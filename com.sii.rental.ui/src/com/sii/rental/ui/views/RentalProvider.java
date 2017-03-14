package com.sii.rental.ui.views;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;

import com.opcoach.training.rental.RentalAgency;

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
		Object[] result=null;
		
		if(parentElement instanceof RentalAgency) {			
			result=  ((RentalAgency) parentElement).getCustomers().toArray();			
		}
		return result;
		
	}

	@Override
	public Object getParent(Object element) {
		
		if (element instanceof EObject) 
			return ((EObject) element).eContainer();
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		
		return true;
	}

	
	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		return super.getText(element);
	}
	
	
}
