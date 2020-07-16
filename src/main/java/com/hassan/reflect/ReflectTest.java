package com.hassan.reflect;

import com.hassan.reflect.controller.UserController;
import com.hassan.reflect.service.UserService;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.stream.Stream;

public class ReflectTest {

    @Test
    public void one() throws Exception {
        UserController userController = new UserController();
        UserService service = new UserService();

        Class<? extends UserController> clazz = userController.getClass();

        Field userService = clazz.getDeclaredField("userService");
        userService.setAccessible(true);

        String fieldName = userService.getName();
        String userSetMethodName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length());
        String serviceMethod = "set" + userSetMethodName;

        Method declaredMethod = clazz.getDeclaredMethod(serviceMethod, UserService.class);

        declaredMethod.invoke(userController, service);

        System.out.println(userController.getUserService());
    }

    @Test
    public void two() {
        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();

        Stream.of(clazz.getDeclaredFields()).forEach(field -> {

            AutoWired annotation = field.getAnnotation(AutoWired.class);

            if (annotation != null) {
                field.setAccessible(true);
                Class<?> type = field.getType();
                try {
                    Object o = type.newInstance();
                    field.set(userController,o);
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(userController.getUserService());
    }
}
