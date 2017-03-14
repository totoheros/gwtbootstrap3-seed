package org.gwtbootstrap3.seed.client;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;

public class Tabulation extends Composite  {

	private static TabulationUiBinder uiBinder = GWT.create(TabulationUiBinder.class);

	interface TabulationUiBinder extends UiBinder<Widget, Tabulation> {
	}

	@UiField(provided = true)
	DataGrid1 dataGrid1 = new DataGrid1();
	
	@UiField(provided = true)
	DataGrid2 dataGrid2 = new DataGrid2();	

	
	public Tabulation() {
		initWidget(uiBinder.createAndBindUi(this));

	}


	public void setPersons(ArrayList<Person> persons,ArrayList<Person> persons2) {
		dataGrid1.setPersons(persons);
		dataGrid2.setPersons(persons2);

	}


}
