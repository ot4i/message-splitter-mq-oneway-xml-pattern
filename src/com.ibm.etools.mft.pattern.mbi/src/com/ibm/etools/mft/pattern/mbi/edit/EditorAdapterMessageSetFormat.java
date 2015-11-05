/*******************************************************************************
* Copyright (c) 2005, 2011 IBM Corporation and others.
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     IBM - initial API and implementation
*******************************************************************************/
package com.ibm.etools.mft.pattern.mbi.edit;

import com.ibm.etools.mft.patterns.model.edit.POVEditorAdapterMsetFormat;

public class EditorAdapterMessageSetFormat extends POVEditorAdapterMsetFormat {
	
	@Override
	protected void populateEditor() {
		setPatternEditImpl(new MessageSetFormatPropertyEditor());
	}
}
