package org.gwtbootstrap3.seed.client;

import java.util.ArrayList;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2015 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Basic GWT entry point.
 * 
 * @author Steven Jardine
 * @author Joshua Godi
 */
public class SeedWebApp implements EntryPoint {

	public void onModuleLoad() {
		Tabulation tabulation = new Tabulation();

		// RootPanel.get().add(myUiBinder.createAndBindUi(this));
		
		RootPanel.get("tabulation").add(tabulation);

		Person personne = new Person();
		personne.setFirstName("Arnold");
		personne.setLastName("The Terminator");
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(personne);

		Person personne2 = new Person();
		personne2.setFirstName("Donald");
		personne2.setLastName("The blaireau");
		ArrayList<Person> persons2 = new ArrayList<Person>();
		persons2.add(personne2);

		tabulation.setPersons(persons, persons2);
		
	}

}
