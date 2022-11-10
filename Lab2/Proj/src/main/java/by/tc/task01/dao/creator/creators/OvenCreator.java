package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of an oven appliance
 */
public class OvenCreator implements ApplianceCreator {
    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(Node node) {
        Oven oven = new Oven();
        NodeList nodes = node.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "powerConsumption" -> oven.powerConsumption = Integer.parseInt(value);
                    case "weight" -> oven.weight = Double.parseDouble(value);
                    case "capacity" -> oven.capacity = Integer.parseInt(value);
                    case "depth" -> oven.depth = Double.parseDouble(value);
                    case "height" -> oven.height = Double.parseDouble(value);
                    case "width" -> oven.width = Double.parseDouble(value);
                    default -> throw new IllegalArgumentException("Illegal field name");
                }
            }
        }
        return oven;
    }
}
