package com.sii.rental.ui.views;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;

public class RentalAgencies {
	
	
	@PostConstruct
	public void createPartControl(Composite parent, RentalAgency a, IEclipseContext context, EMenuService menuService) {
		
		TreeViewer tv=new TreeViewer(parent);
		RentalProvider rp=ContextInjectionFactory.make(RentalProvider.class, context);
		tv.setLabelProvider(rp);
		tv.setContentProvider(rp);
		
		
		tv.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {

				IStructuredSelection sel =(IStructuredSelection) event.getSelection();
				selectionService.setSelection(sel.size()==1 ? sel .getFirstElement() : sel.toArray());
				
			}
		});
		
		
		ArrayList<RentalAgency> rgs=new ArrayList<RentalAgency>();
		rgs.add(a);		
		tv.setInput(rgs);
		menuService.registerContextMenu(tv.getControl(), "com.sii.rental.eap.popupmenu.MessageAgency");
		tv.expandAll();

		
		
	}
	
	
	@Inject
	private ESelectionService selectionService;
	


}
