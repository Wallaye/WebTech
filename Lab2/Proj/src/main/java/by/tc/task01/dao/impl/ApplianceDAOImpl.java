package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.creator.ApplianceCreatorFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/**
 * Implementation of an appliance dao that reads
 * information from xml file in resources folder
 */
public class ApplianceDAOImpl implements ApplianceDAO{
	private static final String RESOURCES_APPLIANCES = "./src/main/resources/appliances_db.xml";

	/**
	 * {@inheritDoc}
	 */
	public Appliance[] find(Criteria criteria) {
		ArrayList<Appliance> result = new ArrayList<>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File(RESOURCES_APPLIANCES));
			document.getDocumentElement().normalize();
			NodeList nodes = document.getDocumentElement().getElementsByTagName(criteria.getGroupSearchName());

			for (int i = 0; i < nodes.getLength(); i++) {
				Node node = nodes.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					ApplianceCreatorFactory applianceCreatorFactory = ApplianceCreatorFactory.getInstance();
					Appliance appliance = applianceCreatorFactory.create(node);

					Map<String, Object> searchCriteria = criteria.getSearchCriteria();

					boolean isSatisfy = true;
					for (Map.Entry<String, Object> entry : searchCriteria.entrySet()) {
						String key = entry.getKey();
						Object value = entry.getValue();

						if (!appliance.isSatisfy(key, value)) {
							isSatisfy = false;
							break;
						}
					}

					if (isSatisfy) {
						result.add(appliance);
					}
				}
			}
		} catch (Exception e) {
			return null;
		}

		if (result.size() != 0){
			return result.toArray(new Appliance[0]);
		} else {
			return null;
		}
	}
}