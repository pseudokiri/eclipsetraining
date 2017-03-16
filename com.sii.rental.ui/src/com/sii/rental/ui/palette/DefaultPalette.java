package com.sii.rental.ui.palette;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;
import com.sii.rental.ui.RentalUIConstants;

public class DefaultPalette implements IColorProvider, RentalUIConstants{

	public DefaultPalette() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Color getForeground(Object element) {
		
		IPreferenceStore ps=new ScopedPreferenceStore(InstanceScope.INSTANCE,"com.sii.rental.ui");
		
		
//		if(element instanceof RentalAgency)
//			return Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
		if(element instanceof Customer)
			return getAColor(ps.getString(PREF_CUSTOMER_COLOR));
		if(element instanceof RentalObject)
			return getAColor(ps.getString(PREF_RENTAL_OBJECT_COLOR));
		if(element instanceof Rental)
			return getAColor(ps.getString(PREF_RENTAL_COLOR));
//		if(element instanceof Node)
//			return Display.getCurrent().getSystemColor(SWT.COLOR_YELLOW);
//		
		return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
		
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
