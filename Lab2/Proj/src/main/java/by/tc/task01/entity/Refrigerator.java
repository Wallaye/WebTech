package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;
import jdk.incubator.vector.DoubleVector;

public class Refrigerator extends Appliance{
	public int powerConsumption;
    public double weight;
    public int freezerCapacity;
    public double overallCapacity;
    public int height;
    public int width;

    @Override
    public String toString() {
        return String.format("Refrigerator: POWER_CONSUMPTION=%d, WEIGHT=%.1f, FREEZER_CAPACITY=%d, OVERALL_CAPACITY=%.1f, HEIGHT=%d, WIDTH=%d",
                powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public boolean isSatisfy(String key, Object value) {
        return switch (SearchCriteria.Refrigerator.valueOf(key)) {
            case POWER_CONSUMPTION -> powerConsumption <= (Integer) value;
            case WEIGHT -> weight <= Double.parseDouble(String.valueOf(value));
            case FREEZER_CAPACITY -> freezerCapacity >= (Integer) value;
            case OVERALL_CAPACITY -> overallCapacity >= Double.parseDouble(String.valueOf(value));
            case HEIGHT -> height <= (Integer) value;
            case WIDTH -> width <= (Integer) value;
        };
    }
}
