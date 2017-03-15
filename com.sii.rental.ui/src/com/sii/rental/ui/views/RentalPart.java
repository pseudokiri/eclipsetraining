
package com.sii.rental.ui.views;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class RentalPart {

private Label rentedObjectLabel,customerNameLabel,startDateLabel,endDateLabel,preCustomerLabel,lblNewLabel_1,lblNewLabel_3;	
private Group grpDatesDeLocation;

@Inject
private ESelectionService ess;

	
	@Inject
public RentalPart(Composite parent, RentalAgency a) {
		parent.setLayout(new GridLayout(1,false));
		
		Group infoGroup=new Group(parent,SWT.NONE);
		infoGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		infoGroup.setText("Informations");
		infoGroup.setLayout(new GridLayout(2,false));
		
		GridData gd=new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalSpan=2;
		gd.horizontalAlignment=SWT.FILL;
		
		rentedObjectLabel=new  Label(infoGroup,SWT.NONE);
		rentedObjectLabel.setLayoutData(gd);
		
		preCustomerLabel=new  Label(infoGroup,SWT.NONE);		
		preCustomerLabel.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, true, false, 1, 1));
		preCustomerLabel.setText("Loué à ");		
		
		customerNameLabel=new  Label(infoGroup,SWT.NONE);
		customerNameLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		grpDatesDeLocation = new Group(parent, SWT.NONE);
		grpDatesDeLocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpDatesDeLocation.setText("Dates de location");
		grpDatesDeLocation.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel = new Label(grpDatesDeLocation, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblNewLabel.setText("du :");  
		
		lblNewLabel_1 = new Label(grpDatesDeLocation, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		//lblNewLabel_1.setText("15/03/2011");
		
		Label lblNewLabel_2 = new Label(grpDatesDeLocation, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblNewLabel_2.setText("au :");
		
		lblNewLabel_3 = new Label(grpDatesDeLocation, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, true, false, 1, 1));
		//lblNewLabel_3.setText("22/03/2011");

		
		//setRental(RentalCoreActivator.getAgency().getRentals().get(0));
		//setRental(a.getRentals().get(0));
		
		
	}

	@Focus
	public void onFocus() {
		//rentedObjectLabel.setFocus();
	}
	
	public void setRental(Rental r) {
		
		if (r!=null) {
		
			rentedObjectLabel.setText(r.getRentedObject().getName());
			customerNameLabel.setText(r.getCustomer().getDisplayName());
			lblNewLabel_1.setText(r.getStartDate().toString());
			lblNewLabel_3.setText(r.getEndDate().toString());
		}
	

	}
	
	@Inject @Optional
	public void receiveSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Rental r) {
		setRental(r);
	}
	
	
	
	
	
	
	
	
}