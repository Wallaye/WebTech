package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;

/**
 * Represents factory of ApplianceDAO
 */
public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

	private DAOFactory() {}

	/**
	 * Gets the instance of appliance DAO
	 * @return instance of appliance DAO
	 */
	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	/**
	 * Gets the instance of DAO factory
	 * @return instance of DAO factory
	 */
	public static DAOFactory getInstance() {
		return instance;
	}
}