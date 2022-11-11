package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import java.util.Map;

public class Validator {
	/**
	 * Validates the criteria
	 * @param criteria criteria to validate
	 * @return true if criteria is valid, false otherwise
	 */
	public static boolean criteriaValidator(Criteria criteria) {
		if (criteria == null || criteria.getSearchCriteria() == null) {
			return false;
		}

		ValueValidatorFactory factory = ValueValidatorFactory.getInstance();
		for (Map.Entry<String, Object> entry : criteria.getSearchCriteria().entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();

			ValueValidator validator = factory.getValueValidator(key);
			boolean isValid = validator.validate(value);
			if (!isValid) {
				return false;
			}
		}
		return true;
	}
}