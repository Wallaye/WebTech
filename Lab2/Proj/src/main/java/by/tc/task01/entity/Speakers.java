package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Speakers extends Appliance{
	public int powerConsumption;
    public int numberSpeakers;
    public String frequencyRange;
    public int cordLength;

    @Override
    public String toString() {
        return String.format("Speakers: POWER_CONSUMPTION=%d, NUMBER_OF_SPEAKERS=%d, FREQUENCY_RANGE=%s, CORD_LENGTH=%d",
                powerConsumption, numberSpeakers, frequencyRange, cordLength);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSatisfy(String key, Object value) {
        return switch (SearchCriteria.Speakers.valueOf(key)) {
            case POWER_CONSUMPTION -> powerConsumption <= (Integer) value;
            case NUMBER_OF_SPEAKERS -> numberSpeakers <= (Integer) value;
            case FREQUENCY_RANGE -> frequencyRange.equals(value);
            case CORD_LENGTH -> cordLength <= (Integer) value;
        };
    }
}
