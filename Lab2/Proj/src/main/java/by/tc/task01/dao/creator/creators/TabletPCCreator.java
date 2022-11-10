package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of a tablet PC appliance
 */
public class TabletPCCreator implements ApplianceCreator {
    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(Node node) {
        TabletPC tabletPC = new TabletPC();
        NodeList nodes = node.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "batteryCapacity" -> tabletPC.batteryCapacity = Integer.parseInt(value);
                    case "displayInches" -> tabletPC.displayInches = Integer.parseInt(value);
                    case "memoryRom" -> tabletPC.rom = Integer.parseInt(value);
                    case "flashMemoryCapacity" -> tabletPC.flashMemoryCapacity = Integer.parseInt(value);
                    case "color" -> tabletPC.color = value;
                    default -> throw new IllegalArgumentException("Illegal field name");
                }
            }
        }
        return tabletPC;
    }
}
