package UI;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Form_Phy extends Dialog {

	protected Object result;
	protected Shell shlFormphy;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public Form_Phy(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shlFormphy.open();
		shlFormphy.layout();
		Display display = getParent().getDisplay();
		while (!shlFormphy.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shlFormphy = new Shell(getParent(), SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		shlFormphy.setSize(516, 300);
		shlFormphy.setText("Form");
		
		Group grpPhysicResource = new Group(shlFormphy, SWT.NONE);
		grpPhysicResource.setText("Resource");
		grpPhysicResource.setBounds(10, 10, 490, 251);
		
		Label lblResName = new Label(grpPhysicResource, SWT.NONE);
		lblResName.setBounds(10, 30, 71, 17);
		lblResName.setText("Res Name:");
		
		text = new Text(grpPhysicResource, SWT.BORDER);
		text.setBounds(87, 30, 100, 23);
		
		Group grpModel = new Group(grpPhysicResource, SWT.NONE);
		grpModel.setText("Model");
		grpModel.setBounds(10, 70, 126, 141);
		
		Label lblType = new Label(grpModel, SWT.NONE);
		lblType.setBounds(10, 23, 61, 17);
		lblType.setText("Type:");
		
		Combo combo = new Combo(grpModel, SWT.NONE);
		combo.setBounds(20, 46, 88, 25);
		combo.setItems(new String[] {"number", "dict", "str", "list"});
		combo.select(0);
		
		Button btnInitvalue = new Button(grpModel, SWT.CHECK);
		btnInitvalue.setBounds(10, 77, 98, 17);
		btnInitvalue.setText("Init_Value:");
		
		text_1 = new Text(grpModel, SWT.BORDER);
		text_1.setBounds(20, 100, 88, 23);
		
		Group grpUpdate = new Group(grpPhysicResource, SWT.NONE);
		grpUpdate.setText("Update");
		grpUpdate.setBounds(156, 71, 324, 170);
		
		Label lblDelay = new Label(grpUpdate, SWT.NONE);
		lblDelay.setBounds(10, 24, 46, 17);
		lblDelay.setText("Delay:");
		
		text_2 = new Text(grpUpdate, SWT.BORDER);
		text_2.setBounds(64, 23, 73, 23);
		
		Label lblNext = new Label(grpUpdate, SWT.NONE);
		lblNext.setBounds(171, 24, 46, 17);
		lblNext.setText("Next:");
		
		text_3 = new Text(grpUpdate, SWT.BORDER);
		text_3.setBounds(223, 23, 73, 23);
		
		Label lblRule = new Label(grpUpdate, SWT.NONE);
		lblRule.setBounds(10, 89, 46, 17);
		lblRule.setText("Rule:");
		
		text_4 = new Text(grpUpdate, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL);
		text_4.setBounds(64, 81, 232, 79);
		
		Label lblDefaultfunc = new Label(grpUpdate, SWT.NONE);
		lblDefaultfunc.setBounds(10, 55, 83, 18);
		lblDefaultfunc.setText("Default_Func:");
		
		Combo combo_1 = new Combo(grpUpdate, SWT.NONE);
		combo_1.setItems(new String[] {"METHOD_MATH_ADD", "METHOD_MATH_DIVISION", "METHOD_MATH_MINUS", "METHOD_MATH_MULTIPLY", "METHOD_MATH_MOD", "METHOD_MATH_LINEAR", "METHOD_MATH_SIN", "METHOD_MATH_LOG", "METHOD_MATH_SUM", "METHOD_MATH_MEAN", "METHOD_PROBABILITY_MARKOV_CHAIN", "METHOD_PROBABILITY_SIMPLE_RAND", "METHOD_PROBABILITY_NORMAL_VARIATE_RAND", "METHOD_OTHERS_COMBINE", "METHOD_OTHERS_DATA_LIST"});
		combo_1.setBounds(99, 52, 197, 25);
		combo_1.select(0);

		final Combo combo_2 = new Combo(grpPhysicResource, SWT.NONE);
		combo_2.setItems(new String[] {"TextBar", "Image"});
		combo_2.setBounds(254, 30, 78, 25);
		combo_2.select(1);

		Label lblDisplay = new Label(grpPhysicResource, SWT.NONE);
		lblDisplay.setBounds(199, 33, 49, 17);
		lblDisplay.setText("Display:");

		Button btnCreate = new Button(grpPhysicResource, SWT.NONE);
		btnCreate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(combo_2.getText().equals("Image"))
				{
					Shell shell = new Shell();
					LoadFile lf = new LoadFile(shell,SWT.ALPHA);
					lf.open();
				}
				else
				{}
			}
		});
		btnCreate.setBounds(35, 217, 80, 27);
		btnCreate.setText("Create");
		
		Label lblClass = new Label(grpPhysicResource, SWT.NONE);
		lblClass.setBounds(344, 33, 136, 17);
		lblClass.setText("Class:");
		
		Combo combo_3 = new Combo(grpPhysicResource, SWT.NONE);
		combo_3.setItems(new String[] {"Physical Resource", "Device Resource", "Properties"});
		combo_3.setBounds(381, 30, 99, 25);
		combo_3.select(2);
		

	}
}
