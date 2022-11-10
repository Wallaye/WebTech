package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of a refrigerator appliance
 */
public class RefrigeratorCreator implements ApplianceCreator {
    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(Node node) {
        Refrigerator refrigerator = new Refrigerator();
        NodeList nodes = node.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "powerConsumption" -> refrigerator.powerConsumption = Integer.parseInt(value);
                    case "weight" -> refrigerator.weight = Double.parseDouble(value);
                    case "freezerCapacity" -> refrigerator.freezerCapacity = Integer.parseInt(value);
                    case "overallCapacity" -> refrigerator.overallCapacity = Double.parseDouble(value);
                    case "height" -> refrigerator.height = Integer.parseInt(value);
                    case "width" -> refrigerator.width = Integer.parseInt(value);
                    default -> throw new IllegalArgumentException("Illegal field name");
                }
            }
        }
        return refrigerator;
    }
}
