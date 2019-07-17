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
		// Chamando Alert com Botão
		
		Alerts.showAlert("Titulo do alert", "Cabeçalho", "Texto do alert", AlertType.WARNING); //AlertType é um tipo enumerado e o cabeçalho aceita valor nullo
		
		
	}

}
