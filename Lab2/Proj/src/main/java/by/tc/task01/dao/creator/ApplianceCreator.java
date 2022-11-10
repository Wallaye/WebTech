package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import org.w3c.dom.Node;

/**
 * Represents factory of an appliance from nodes list
 */
public interface ApplianceCreator {
    /**
     * Creates the appliance
     * @param nodes list of an appliances nodes
     * @return specific type of the appliance
     */
    Appliance create(Node nodes);
}