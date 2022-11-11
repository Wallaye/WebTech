package by.tc.task01.service.validation.impl;

import by.tc.task01.service.validation.ValueValidator;

/**
 * Represents value validator for string type
 */
public class StringValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            return ((String) obj).length() != 0;
        } catch (Exception e) {
            return false;
        }
    }
}