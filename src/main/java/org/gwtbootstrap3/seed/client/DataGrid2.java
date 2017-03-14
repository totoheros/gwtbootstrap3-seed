package org.gwtbootstrap3.seed.client;

import java.util.ArrayList;

import org.gwtbootstrap3.client.ui.gwt.DataGrid;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.AbstractCellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;

public class DataGrid2 extends Composite  {

	private static DataGrid2UiBinder uiBinder = GWT.create(DataGrid2UiBinder.class);

	interface DataGrid2UiBinder extends UiBinder<Widget, DataGrid2> {
	}

	@UiField(provided = true)
	DataGrid<Person> dataGrid = new DataGrid<Person>(5);
	
	private ListDataProvider<Person> dataGridProvider = new ListDataProvider<Person>();
	private ArrayList<Person> persons;

	
	public DataGrid2() {
		initTable(dataGrid, dataGridProvider);
		dataGrid.setTableWidth(100, Unit.PCT);
		dataGrid.setHeight("150px");
		dataGrid.setWidth("750px");

		initWidget(uiBinder.createAndBindUi(this));

	}
	
	private void initTable(final AbstractCellTable<Person> grid, ListDataProvider<Person> dataProvider) {



		final TextColumn<Person> col1 = new TextColumn<Person>() {

			@Override
			public String getValue(final Person object) {
				return String.valueOf(object.getFirstName());
			}
		};
		grid.addColumn(col1, "First Name");
		grid.setColumnWidth(col1, 100, Unit.PX);

		final TextColumn<Person> col2 = new TextColumn<Person>() {

			@Override
			public String getValue(final Person object) {
				return String.valueOf(object.getLastName());
			}
		};
		grid.addColumn(col2, "Last Name");

		grid.setColumnWidth(col2, 300, Unit.PX);

		dataProvider.addDataDisplay(grid);
	
		
	}

	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
		dataGridProvider.getList().clear();
		for (Person person : persons)
		{
			dataGridProvider.getList().add(person);
		}

		dataGridProvider.flush();

	}


}

