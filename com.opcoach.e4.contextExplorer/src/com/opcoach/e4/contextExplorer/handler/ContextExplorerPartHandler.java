package com.opcoach.e4.contextExplorer.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

public class ContextExplorerPartHandler {
	@Execute
	public void execute(EPartService partService) {
		// Open the ContextExplorerPart
		MPart part = org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory.INSTANCE
				.createPart();
		part.setCloseable(true);
		part.setLabel("Context Explorer");
		part.setElementId("com.opcoach.e4.contextExplorer.part");
		part.setContributionURI("bundleclass://com.opcoach.e4.contextExplorer/com.opcoach.e4.contextExplorer.parts.ContextExplorerPart");

		partService.showPart(part, PartState.ACTIVATE);
	}
}