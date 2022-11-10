package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of a vacuum cleaner appliance
 */
public class VacuumCleanerCreator implements ApplianceCreator {
    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(Node node) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        NodeList nodes = node.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "powerConsumption" -> vacuumCleaner.powerConsumption = Integer.parseInt(value);
                    case "filterType" -> vacuumCleaner.filterType = value;
                    case "bagType" -> vacuumCleaner.bagType = String.valueOf(value);
                    case "wandType" -> vacuumCleaner.wandType = String.valueOf(value);
                    case "motorSpeedRegulation" -> vacuumCleaner.motorSpeed = Integer.parseInt(value);
                    case "cleaningWidth" -> vacuumCleaner.cleaningWidth = Integer.parseInt(value);
                    default -> throw new IllegalArgumentException("Illegal field name");
                }
            }
        }
        return vacuumCleaner;
    }
}
