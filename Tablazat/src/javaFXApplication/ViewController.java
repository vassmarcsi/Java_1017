package javaFXApplication;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{

    @FXML
    private TableView<Szemely> tabla;

    @FXML
    private TableColumn<Szemely, Number> tablaID;

    @FXML
    private TableColumn<Szemely, String> tablaVezeteknev;

    @FXML
    private TableColumn<Szemely, String> tablaKeresztnev;

    @FXML
    private TextField szovegmezoID;

    @FXML
    private TextField szovegmezoVezeteknev;

    @FXML
    private TextField szovegmezoKeresztnev;

    @FXML
    void hozzaadGomb(ActionEvent event) {

    }
    
    private  ObservableList<Szemely> adat = FXCollections.observableArrayList();
    
    private void adatHozzaad()
    {
    	Szemely szemely1 = new Szemely(1, "Rédai","Dávid");
    	Szemely szemely2 = new Szemely(2, "Pusztai", "Bence");
    	Szemely szemely3 = new Szemely(3, "Csonka", "Dániel");
    	adat.add(szemely1);
    	adat.add(szemely2);
    	adat.add(szemely3);
    }
    
    private void tablazatLetrehoz()
    {
    	tablaID.setCellValueFactory(cellaAdat -> cellaAdat.getValue().idProperty());
    	tablaVezeteknev.setCellValueFactory(cellaAdat -> cellaAdat.getValue().vezeteknevProperty());
    	tablaKeresztnev.setCellValueFactory(cellaAdat -> cellaAdat.getValue().keresztnevProperty());
    	tabla.setItems(adat);
    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		adatHozzaad(); // először adatot viszünk fel a táblába
		tablazatLetrehoz(); // utána létrehozzuk a táblát és a SetItems() beállítja az adatokat
		
	}
    

    
}
