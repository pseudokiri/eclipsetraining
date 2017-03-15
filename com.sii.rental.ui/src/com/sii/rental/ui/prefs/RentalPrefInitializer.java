package com.sii.rental.ui.prefs;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.RGB;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.sii.rental.ui.RentalUIConstants;

public class RentalPrefInitializer extends AbstractPreferenceInitializer implements RentalUIConstants{

	public RentalPrefInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore ps=new ScopedPreferenceStore(InstanceScope.INSTANCE,"com.sii.rental.ui");
		ps.setDefault(PREF_CUSTOMER_COLOR, StringConverter.asString(new RGB(20,200,244)));
		ps.setDefault(PREF_RENTAL_COLOR, StringConverter.asString(new RGB(20,100,24)));
		ps.setDefault(PREF_RENTAL_OBJECT_COLOR, StringConverter.asString(new RGB(120,240,244)));

	}

}
