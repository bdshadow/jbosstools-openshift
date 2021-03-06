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

import com.openshift.restclient.ResourceKind;

/**
 * Tabbed property section for displaying Templates.
 *  
 * @author Jeff Maury
 *
 */
public class TemplatesPropertySection extends OpenShiftResourcePropertySection {

	public TemplatesPropertySection() {
		super("popup:org.jboss.tools.openshift.ui.properties.tab.TemplatesTab", ResourceKind.TEMPLATE);
	}
}
