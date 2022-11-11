package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.validation.impl.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Factory of a criteria validators
 */
public class ValueValidatorFactory {
    private static final ValueValidatorFactory instance = new ValueValidatorFactory();
    private final Map<List<String>, ValueValidator> map = new HashMap<>();

    /**
     * Instantiates a map of search criteria and corresponding validator type
     */
    private ValueValidatorFactory() {
        map.put(List.of(SearchCriteria.Laptop.BATTERY_CAPACITY.name(), SearchCriteria.Laptop.CPU.name(),
                SearchCriteria.Oven.WEIGHT.name(), SearchCriteria.Oven.DEPTH.name(),
                SearchCriteria.Oven.HEIGHT.name(),SearchCriteria.Oven.WIDTH.name(),
                SearchCriteria.Refrigerator.WEIGHT.name(), SearchCriteria.Refrigerator.HEIGHT.name(),
                SearchCriteria.Refrigerator.WIDTH.name()), new DoubleValidator());
        map.put(List.of(SearchCriteria.Laptop.MEMORY_ROM.name(), SearchCriteria.Laptop.SYSTEM_MEMORY.name(),
                SearchCriteria.Laptop.DISPLAY_INCHS.name(), SearchCriteria.Oven.POWER_CONSUMPTION.name(),
                SearchCriteria.Oven.CAPACITY.name(), SearchCriteria.Refrigerator.POWER_CONSUMPTION.name(),
                SearchCriteria.Refrigerator.FREEZER_CAPACITY.name(),
                SearchCriteria.Refrigerator.OVERALL_CAPACITY.name(), SearchCriteria.Speakers.CORD_LENGTH.name(),
                SearchCriteria.Speakers.POWER_CONSUMPTION.name(), SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name(),
                SearchCriteria.TabletPC.BATTERY_CAPACITY.name(), SearchCriteria.TabletPC.DISPLAY_INCHES.name(),
                SearchCriteria.TabletPC.MEMORY_ROM.name(), SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name(),
                SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.name(),
                SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.name(),
                SearchCriteria.VacuumCleaner.CLEANING_WIDTH.name()), new IntValidator());
        map.put(List.of(SearchCriteria.Laptop.OS.name(), SearchCriteria.VacuumCleaner.BAG_TYPE.name(),
                SearchCriteria.VacuumCleaner.WAND_TYPE.name()), new StringValidator());
    }

    /**
     * Gets the factory instance
     * @return factory instance
     */
    public static ValueValidatorFactory getInstance() {
        return instance;
    }

    /**
     * Gets the value validator by criterion name
     * @param criterionName name of criterion to validate
     * @return value validator for specific criterion
     */
    public ValueValidator getValueValidator(String criterionName) {
        for (Map.Entry<List<String>, ValueValidator> entry : map.entrySet()) {
            List<String> key = entry.getKey();
            ValueValidator validator = entry.getValue();

            if (key.contains(criterionName)){
                return validator;
            }
        }
        return null;
    }
}