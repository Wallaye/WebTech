package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

/**
 * Represents interface of an appliance service
 */
public interface ApplianceService {
	/**
	 * Validates criteria and finds all appliances
	 * tha satisfy given criteria
	 * @param criteria criteria to satisfy for
	 * @return appliance array that satisfy the given criteria or null if criteria is invalid
	 */
	Appliance[] find(Criteria criteria);
}