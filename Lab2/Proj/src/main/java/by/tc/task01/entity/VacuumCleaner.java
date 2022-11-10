package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class VacuumCleaner extends Appliance{
	public int powerConsumption;
    public String filterType;
    public String bagType;
    public String wandType;
    public int motorSpeed;
    public int cleaningWidth;

    @Override
    public String toString() {
        return String.format("VacuumCleaner : POWER_CONSUMPTION=%d, FILTER_TYPE=%s, BAG_TYPE=%s, WAND_TYPE=%s, MOTOR_SPEED_REGULATION=%d, CLEANING_WIDTH=%d",
                powerConsumption, filterType, bagType, wandType, motorSpeed, cleaningWidth);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSatisfy(String key, Object value) {
        return switch (SearchCriteria.VacuumCleaner.valueOf(key)) {
            case POWER_CONSUMPTION -> powerConsumption <= (Integer) value;
            case FILTER_TYPE -> filterType.equals(value);
            case BAG_TYPE -> bagType.equals(value);
            case WAND_TYPE -> wandType.equals(value);
            case MOTOR_SPEED_REGULATION -> motorSpeed >= (Integer) value;
            case CLEANING_WIDTH -> cleaningWidth >= (Integer) value;
        };
    }
}
