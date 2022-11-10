package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of a laptop appliance
 */
public class LaptopCreator implements ApplianceCreator {
    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(Node node) {
        Laptop laptop = new Laptop();
        NodeList nodes = node.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "batteryCapacity" -> laptop.batteryCapacity = Double.parseDouble(value);
                    case "os" -> laptop.os = value;
                    case "memoryRom" -> laptop.rom = Integer.parseInt(value);
                    case "systemMemory" -> laptop.systemMemory = Integer.parseInt(value);
                    case "cpu" -> laptop.cpu = value;
                    case "displayInches" -> laptop.displayInches = Integer.parseInt(value);
                    default -> throw new IllegalArgumentException("Illegal field name");
                }
            }
        }
        return laptop;
    }
}
