/*******************************************************************************
 * Copyright (c) 2016 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.openshift.internal.ui.property.tabbed;

import org.eclipse.swt.SWT;
import org.jboss.tools.openshift.internal.common.ui.utils.TableViewerBuilder;

import com.openshift.restclient.ResourceKind;
import com.openshift.restclient.model.volume.IPersistentVolumeClaim;

public class StoragePropertySection extends OpenShiftResourcePropertySection {

	public StoragePropertySection() {
		super("popup:org.jboss.tools.openshift.ui.properties.tab.StorageTab", ResourceKind.PVC);
	}
	
	@Override
	protected void addColumns(TableViewerBuilder tableViewerBuilder) {
		addNameColumn(tableViewerBuilder);
		tableViewerBuilder
			.column(model -> ((IPersistentVolumeClaim)getResource(model)).getStatus())
				.name("Status")
				.align(SWT.LEFT)
				.weight(1)
				.minWidth(25)
			.buildColumn();
		addCreatedColumn(tableViewerBuilder);
	}

}
