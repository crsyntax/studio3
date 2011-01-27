/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.sass.preferences;

import org.eclipse.swt.widgets.Composite;
import com.aptana.editor.common.preferences.CommonEditorPreferencePage;
import com.aptana.editor.sass.Activator;

public class SassPreferencePage extends CommonEditorPreferencePage
{

	/**
	 * SassPreferencePage
	 */

	public SassPreferencePage()
	{
		super();
		setDescription(Messages.SassPreferencePage_SASS_Page_Title);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	@Override
	protected void createMarkOccurrenceOptions(Composite parent)
	{
	}

}
