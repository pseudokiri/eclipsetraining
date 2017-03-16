package com.sii.rental.ui;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.core.RentalCoreActivator;

public class RentalAddon implements RentalUIConstants{

	@PostConstruct
	public void initContext(IEclipseContext ctx) {
		ctx.set(RentalAgency.class, RentalCoreActivator.getAgency());
		
		ctx.set(RENTAL_UI_IMG_REGISTRY, getLocalImageRegistry());
		
	}
	
	ImageRegistry getLocalImageRegistry() {
		
		Bundle b=FrameworkUtil.getBundle(getClass());
		
		ImageRegistry reg=new ImageRegistry();
		
		reg.put(IMG_CUSTOMER, ImageDescriptor.createFromURL(b.getEntry(IMG_CUSTOMER)));
		reg.put(IMG_RENTAL, ImageDescriptor.createFromURL(b.getEntry(IMG_RENTAL)));
		reg.put(IMG_RENTAL_OBJECT, ImageDescriptor.createFromURL(b.getEntry(IMG_RENTAL_OBJECT)));
		reg.put(IMG_AGENCY, ImageDescriptor.createFromURL(b.getEntry(IMG_AGENCY)));
		
		return reg;
		
		
	}
	
	@Inject
	@Optional
	void reactOnRentalEvent(@UIEventTopic("customer/copy") Customer customer) {
		System.out.println(customer.getDisplayName());
		
	}
	
	
	@Inject
	public void getExtensionsQuickAccess(IExtensionRegistry reg) {
		
		String plugIn="org.eclipse.e4.workbench.model";
		for(IConfigurationElement elt : reg.getConfigurationElementsFor(plugIn)) {
			//String attValue=elt.getAttribute(name);
			
			System.out.println("Found : "+elt.getName() + " in "+plugIn);// + " with attr="+attValue);
			if(elt.getName().contentEquals("fragment")) System.out.println(" uri :"+ elt.getAttribute("uri")) ;
			if(elt.getName().contentEquals("processor")) System.out.println(" class :"+ elt.getAttribute("class")) ;
		}
		
	}
	
	
	
}
