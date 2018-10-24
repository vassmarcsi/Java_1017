package javaFXApplication;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Szemely {
	
	private SimpleIntegerProperty id;
	private SimpleStringProperty vezeteknev;
	private SimpleStringProperty keresztnev;
	
	public Szemely(int id, String vezeteknev, String keresztnev) {
		this.id = new SimpleIntegerProperty(id);
		this.vezeteknev = new SimpleStringProperty(vezeteknev);
		this.keresztnev = new SimpleStringProperty(keresztnev);
	}

	public final String getVezeteknev()
	{
		return this.vezeteknev.get();
	}

	public final void setVezeteknev(String vezeteknev)
	{
		this.vezeteknevProperty().set(vezeteknev);
	}
	
	
	//vezetéknév
	public final SimpleStringProperty vezeteknevProperty()
	{
		return this.vezeteknev;
	}
	
	//keresztnév
	public final String getKeresztnev()
	{
		return this.keresztnev.get();
	}
	
	public final void setKeresztnev(String keresztnev)
	{
		this.keresztnevProperty().set(keresztnev);
	}
	
	public final SimpleStringProperty keresztnevProperty()
	{
		return this.keresztnev;
	}

	//ID
	public final SimpleIntegerProperty idProperty() {
		return this.id;
	}
	

	public final int getId() {
		return this.idProperty().get();
	}
	

	public final void setId(final int id) {
		this.idProperty().set(id);
	}
	
}
