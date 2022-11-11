package by.tc.task01.service.validation;

/**
 * Represents interface of a simple value validator
 */
public interface ValueValidator {
    /**
     * Validates given value
     * @param obj value to validate
     * @return true if value is valid, false otherwise
     */
    boolean validate(Object obj);
}