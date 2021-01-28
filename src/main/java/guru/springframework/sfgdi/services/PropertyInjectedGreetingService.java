package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author DanielEitan
 * @created 27/01/2021
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
