package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author DanielEitan
 * @created 28/01/2021
 */
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
