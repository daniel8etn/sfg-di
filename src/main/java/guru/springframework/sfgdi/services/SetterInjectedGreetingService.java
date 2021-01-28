package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author DanielEitan
 * @created 28/01/2021
 */
@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
