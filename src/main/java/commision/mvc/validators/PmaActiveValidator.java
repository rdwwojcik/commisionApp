package commision.mvc.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class PmaActiveValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {

    }
}
