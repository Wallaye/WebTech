package by.tc.task01.entity;

/**
 * Abstract class for appliances
 */
public abstract class Appliance {
    /**
     * Checks if field satisfies criteria
     * @param key field to satisfy for
     * @param value value of field
     * @return satisfies the given criteria or not
     */
    public abstract boolean isSatisfy(String key, Object value);
}
