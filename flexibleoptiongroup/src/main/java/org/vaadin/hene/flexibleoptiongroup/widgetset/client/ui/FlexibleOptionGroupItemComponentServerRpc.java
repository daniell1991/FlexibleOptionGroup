package org.vaadin.hene.flexibleoptiongroup.widgetset.client.ui;

import com.vaadin.shared.communication.ServerRpc;

/**
 * @author Henri Kerola / Vaadin
 */
public interface FlexibleOptionGroupItemComponentServerRpc extends ServerRpc {

    void selected(boolean selected);
}
