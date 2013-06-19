package org.eclipse.examples.helloworld;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IWorkbenchWindow;

public class HelloWorldAction implements IActionDelegate  {
	IWorkbenchWindow activeWindow = null;

	/** Run the action. Display the Hello World message
	 */		
	public void run(IAction proxyAction) {
		// proxyAction has UI information from manifest file (ignored)
		Shell shell = activeWindow.getShell();
		MessageDialog.openInformation(shell, "Hello World", "Hello World!");
	}

	// IActionDelegate method
	public void selectionChanged(IAction proxyAction, ISelection selection) {
		// do nothing, action is not dependent on the selection
	}
	
	// IWorkbenchWindowActionDelegate method
	public void init(IWorkbenchWindow window) {
		activeWindow = window;
	}
	
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
