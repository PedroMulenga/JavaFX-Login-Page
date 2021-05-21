/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author PEDRO P MULENGA
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField txtNome, txtEmail;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnSignIn;

    @FXML
    private void handleSignIn(ActionEvent event) {
        System.out.println("Nome Digitado: "+ txtNome.getText());
        System.out.println("Email Digitado: "+ txtEmail.getText());
        System.out.println("Password Digitada: "+ txtPassword.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
