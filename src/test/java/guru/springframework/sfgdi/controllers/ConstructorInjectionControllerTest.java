package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author DanielEitan
 * @created 27/01/2021
 */
class ConstructorInjectionControllerTest {

    ConstructorInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectionController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}