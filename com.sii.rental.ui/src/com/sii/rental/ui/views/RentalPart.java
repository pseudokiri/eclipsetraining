
package com.sii.rental.ui.views;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import com.opcoach.training.rental.Rental;
import com.sii.rental.core.RentalCoreActivator;

public class RentalPart {

private Label rentedObjectLabel,customerNameLabel,startDateLabel,endDateLabel,preCustomerLabel;	
	
	@PostConstruct
public void createUI(Composite parent) {
		parent.setLayout(new GridLayout(1,false));
		
		Group infoGroup=new Group(parent,SWT.NONE);
		infoGroup.setText("Informations");
		infoGroup.setLayout(new GridLayout(2,false));
		
		GridData gd=new GridData();
		gd.horizontalSpan=2;
		gd.horizontalAlignment=SWT.FILL;
		
		rentedObjectLabel=new  Label(infoGroup,SWT.NONE);
		rentedObjectLabel.setLayoutData(gd);
		rentedObjectLabel.setText("Perceuse");
		
		preCustomerLabel=new  Label(infoGroup,SWT.NONE);		
		preCustomerLabel.setText("Loué à ");		
		
		customerNameLabel=new  Label(infoGroup,SWT.NONE);
		customerNameLabel.setText("durand");			
		
		startDateLabel=new  Label(infoGroup,SWT.NONE);
		startDateLabel.setText("01/01/2017");
		
		endDateLabel=new  Label(infoGroup,SWT.NONE);
		endDateLabel.setText("03/02/2017");
		
		setRental(RentalCoreActivator.getAgency().getRentals().get(0));
		
		
	}

	@Focus
	public void onFocus() {
		//rentedObjectLabel.setFocus();
	}
	
	public void setRental(Rental r) {
		
		rentedObjectLabel.setText(r.getRentedObject().getName());
		customerNameLabel.setText(r.getCustomer().getDisplayName());		
		
		
		
	}

}