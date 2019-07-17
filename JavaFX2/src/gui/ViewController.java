package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button  btTeste;
	
	@FXML
	public void onBtTesteAction() {
		//System.out.println("Clique!");
		// Chamando Alert com Bot�o
		
		Alerts.showAlert("Titulo do alert", "Cabe�alho", "Texto do alert", AlertType.WARNING); //AlertType � um tipo enumerado e o cabe�alho aceita valor nullo
		
		
	}

}
