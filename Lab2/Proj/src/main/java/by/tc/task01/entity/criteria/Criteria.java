package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents search criteria for specific appliance type
 */
public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<>();

	/**
	 * Instantiates object of a type Criteria
	 * @param groupSearchName name searching type
	 */
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	/**
	 * Gets the search appliance type name
	 * @return search appliance type name
	 */
	public String getGroupSearchName() {
		return groupSearchName;
	}

	/**
	 * Add new search criteria
	 * @param searchCriteria field to search
	 * @param value value of search criteria
	 */
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	/**
	 * Gets the search criteria
	 * @return search criteria
	 */
	public Map<String, Object> getSearchCriteria() {
		return criteria;
	}

}