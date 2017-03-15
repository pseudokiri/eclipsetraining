package com.sii.rental.ui.views;

import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.sii.rental.ui.RentalUIConstants;

public class RentalProvider extends LabelProvider implements ITreeContentProvider, IColorProvider,RentalUIConstants{

	@Inject @Named(RENTAL_UI_IMG_REGISTRY)
	private ImageRegistry registry;
	
	@Override
	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof Collection<?>) {
			return  ((Collection<?>) inputElement).toArray();
			
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		
		if (parentElement instanceof Node) 
			return ((Node)parentElement).getChildren();
		
		
		if(parentElement instanceof RentalAgency) {	
			RentalAgency a =(RentalAgency) parentElement;
			return new Node[] { new Node(Node.CUSTOMERS,a),
								new Node(Node.RENTALS,a),
								new Node(Node.OBJECTS,a),
			};
			
		
			
				
		}
		return null;
		
	
	}

	@Override
	public Object getParent(Object element) {
		
		if (element instanceof EObject) 
			return ((EObject) element).eContainer();
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		
		return element instanceof RentalAgency || element instanceof Node;
	}

	
	@Override
	public String getText(Object element) {
		if(element instanceof RentalAgency)
			return ((RentalAgency) element).getName();
		if(element instanceof Customer)
			return ((Customer) element).getDisplayName();
		if(element instanceof RentalObject)
			return ((RentalObject) element).getName();
		
		
		
		return super.getText(element);
	}
	

	
	@Override
	public Image getImage(Object element) {
		if(element instanceof RentalAgency)
			return registry.get(IMG_AGENCY);
		if(element instanceof Customer)
			return registry.get(IMG_CUSTOMER);
		if(element instanceof RentalObject)
			return registry.get(IMG_RENTAL_OBJECT);
		if(element instanceof Rental)
			return registry.get(IMG_RENTAL);
		
		return null;
	}
	
	
	
	class Node {
		private static final String CUSTOMERS = "Clients";
		private static final String RENTALS = "Locations";
		private static final String OBJECTS = "Objets à louer";
		private String title;
		private RentalAgency a;
		public Node(String title, RentalAgency a) {
			super();
			this.title = title;
			this.a = a;
		}
		
		public Object[] getChildren() {
			
			switch (title) {
			
				case CUSTOMERS :return a.getCustomers().toArray();
				case RENTALS :return a.getRentals().toArray();
				case OBJECTS : return a.getObjectsToRent().toArray();
				
			}
				
			return null;
			
		}
		
		@Override
		public String toString() {			
			return title;
		}
		
	}



	@Override
	public Color getForeground(Object element) {
//		if(element instanceof RentalAgency)
//			return Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
//		if(element instanceof Customer)
//			return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
//		if(element instanceof RentalObject)
//			return Display.getCurrent().getSystemColor(SWT.COLOR_GREEN);
//		if(element instanceof Rental)
//			return Display.getCurrent().getSystemColor(SWT.COLOR_MAGENTA);
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
	
	

	
	
}
