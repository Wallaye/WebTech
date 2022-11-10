package by.tc.task01.entity;


import by.tc.task01.entity.criteria.SearchCriteria;

public class Oven extends Appliance{
	public int powerConsumption;
	public double weight;
	public int capacity;
	public double depth;
	public double height;
	public double width;

	@Override
	public String toString() {
		return String.format("Oven: POWER_CONSUMPTION=%d, WEIGHT=%.1f, CAPACITY=%d, DEPTH=%.1f, HEIGHT=%.1f, WIDTH=%.1f",
				powerConsumption, weight, capacity, depth, height, width);
	}

	/**
	 *{@inheritDoc}
	 */
	@Override
	public boolean isSatisfy(String key, Object value) {
		return switch (SearchCriteria.Oven.valueOf(key)) {
			case POWER_CONSUMPTION -> powerConsumption <= (Integer) value;
			case WEIGHT -> weight <= Double.parseDouble(String.valueOf(value));
			case CAPACITY -> capacity >= (Integer) value;
			case DEPTH -> depth <= Double.parseDouble(String.valueOf(value));
			case HEIGHT -> height <= Double.parseDouble(String.valueOf(value));
			case WIDTH -> width <= Double.parseDouble(String.valueOf(value));
		};
	}
}
