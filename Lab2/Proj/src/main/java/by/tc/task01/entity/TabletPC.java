package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class TabletPC extends Appliance{
	public int batteryCapacity;
    public int displayInches;
    public int rom;
    public int flashMemoryCapacity;
    public String color;

    @Override
    public String toString() {
        return String.format("TabletPC: BATTERY_CAPACITY=%d, DISPLAY_INCHES=%d, MEMORY_ROM=%d, FLASH_MEMORY_CAPACITY=%d, COLOR=%s",
                batteryCapacity, displayInches, rom, flashMemoryCapacity, color);
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public boolean isSatisfy(String key, Object value) {
        return switch (SearchCriteria.TabletPC.valueOf(key)) {
            case BATTERY_CAPACITY -> batteryCapacity >= (Integer) value;
            case DISPLAY_INCHES -> displayInches >= (Integer) value;
            case MEMORY_ROM -> rom >= (Integer) value;
            case FLASH_MEMORY_CAPACITY -> flashMemoryCapacity >= (Integer) value;
            case COLOR -> color.equals(value);
        };
    }
}
