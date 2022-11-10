package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents creator of a speakers appliance
 */
public class SpeakersCreator implements ApplianceCreator {
    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance create(Node node){
        Speakers speakers = new Speakers();
        NodeList nodes = node.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "powerConsumption" -> speakers.powerConsumption = Integer.parseInt(value);
                    case "numberOfSpeakers" -> speakers.numberSpeakers = Integer.parseInt(value);
                    case "frequencyRange" -> speakers.frequencyRange = String.valueOf(value);
                    case "cordLength" -> speakers.cordLength = Integer.parseInt(value);
                    default -> throw new IllegalArgumentException("Illegal field name");
                }
            }
        }
        return speakers;
    }
}
