package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

/**
 * Represents appliance dao
 */
public interface ApplianceDAO {
	/**
	 * Finds all appliances by given search criteria
	 * @param criteria search criteria
	 * @return array of appliances that satisfy search criteria
	 */
	Appliance[] find(Criteria criteria);
}