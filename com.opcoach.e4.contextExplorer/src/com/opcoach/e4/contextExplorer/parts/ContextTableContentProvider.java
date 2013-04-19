package com.opcoach.e4.contextExplorer.parts;

import org.eclipse.e4.core.internal.contexts.EclipseContext;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

@SuppressWarnings("restriction")
public class ContextTableContentProvider implements IStructuredContentProvider {

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof EclipseContext)
			return ((EclipseContext) inputElement).localData().entrySet()
					.toArray();
		return null;
	}

}
