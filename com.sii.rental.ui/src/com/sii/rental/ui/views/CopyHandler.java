package com.sii.rental.ui.views;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.RTFTransfer;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.opcoach.training.rental.Customer;

public class CopyHandler {

	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) Object object) {

		// if(dirtyable==null) return false;
		// return dirtyable.isDirty();
		//return true;

		return (object instanceof Customer);
		

	}

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) Customer customer, IEventBroker broker) {

		broker.send("customer/copy", customer);		
		Clipboard clipboard = new Clipboard(Display.getCurrent());
		String textData = customer.getDisplayName();
		String rtfData = "{\\rtf1\\b\\i "+ customer.getDisplayName();
		TextTransfer textTransfer = TextTransfer.getInstance();
		RTFTransfer rtfTransfer = RTFTransfer.getInstance();
		Transfer[] transfers = new Transfer[]{textTransfer, rtfTransfer};
		Object[] data = new Object[]{textData, rtfData};
		clipboard.setContents(data, transfers);
		clipboard.dispose();

	}

}