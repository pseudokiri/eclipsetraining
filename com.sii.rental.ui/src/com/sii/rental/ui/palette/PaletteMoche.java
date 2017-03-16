package com.sii.rental.ui.palette;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;
import com.sii.rental.ui.RentalUIConstants;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class PaletteMoche implements IColorProvider,RentalUIConstants {

	public PaletteMoche() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Color getForeground(Object element) {
				
		return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_MAGENTA);
		
	}

	@Override
	public Color getBackground(Object element) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
private Color getAColor(String rgbKey) {
	
	ColorRegistry colorRegistry=JFaceResources.getColorRegistry();
	
	Color col=colorRegistry.get(rgbKey);
	if(col==null) {
		colorRegistry.put(rgbKey, StringConverter.asRGB(rgbKey));
		col=colorRegistry.get(rgbKey);
		
	}
	return col;
	
}

}
