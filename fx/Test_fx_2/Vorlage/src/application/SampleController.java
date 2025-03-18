package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {
	
	@FXML Button bt_rot;
	@FXML Button bt_gruen;
	@FXML Button bt_gelb;
	
	
	
	
	@FXML
	protected void gelb(ActionEvent event) {
		System.out.println(" in  gelb ");
	}
	
	
	@FXML
	protected void gruen(ActionEvent event) {
		System.out.println(" in  gruen ");
	}
	
	@FXML
	protected void rot(ActionEvent event) {
		System.out.println(" in  rot ");
	}
}
