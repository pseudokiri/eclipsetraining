package com.sii.rental.ui.views;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

public class RentalProvider extends LabelProvider implements ITreeContentProvider{

	
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
			
		
//		if(parentElement instanceof Customer) {	
//			RentalObject ro =(RentalObject) parentElement;
//			return new Node[] { new Node(Node.CUSTOMERS,a),
//								new Node(Node.RENTALS,a),
//								new Node(Node.OBJECTS,a),
//			};
				
			
				
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
	
	
	
	class Node {
		private static final String CUSTOMERS = "Customers";
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
	
	
}
