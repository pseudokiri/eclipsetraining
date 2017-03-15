package com.sii.rental.ui.prefs;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import com.sii.rental.ui.RentalUIConstants;
import org.eclipse.jface.resource.ImageDescriptor;

public class RentalColorPage extends FieldEditorPreferencePage implements RentalUIConstants{

	public RentalColorPage() {
		super(GRID);
	}



	@Override
	protected void createFieldEditors() {
		
		addField(new ColorFieldEditor(PREF_CUSTOMER_COLOR, "Customer :", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_COLOR, "Location :", getFieldEditorParent()));
		addField(new ColorFieldEditor(PREF_RENTAL_OBJECT_COLOR, "Objet loué :", getFieldEditorParent()));
		

	}

}
