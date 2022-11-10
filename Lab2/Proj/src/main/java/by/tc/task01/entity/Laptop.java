package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Laptop extends Appliance{
	public double batteryCapacity;
    public String os;
    public int rom;
    public int systemMemory;
    public String cpu;
    public double displayInches;

    @Override
    public String toString() {
        return String.format("Laptop: BATTERY_CAPACITY=%.1f, OS=%s, MEMORY_ROM=%d, SYSTEM_MEMORY=%d, CPU=%.1f, DISPLAY_INCHS=%d",
                batteryCapacity, os, rom, systemMemory, cpu, displayInches);
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public boolean isSatisfy(String key, Object value) {
        return switch (SearchCriteria.Laptop.valueOf(key)){
            case BATTERY_CAPACITY -> batteryCapacity < Double.parseDouble(String.valueOf(value));
            case OS -> os.equals(value);
            case MEMORY_ROM -> rom > (Integer) value;
            case SYSTEM_MEMORY -> systemMemory > (Integer) value;
            case CPU -> cpu.equals(value);
            case DISPLAY_INCHS -> displayInches <= Double.parseDouble(String.valueOf(value));
        };
    }
}
