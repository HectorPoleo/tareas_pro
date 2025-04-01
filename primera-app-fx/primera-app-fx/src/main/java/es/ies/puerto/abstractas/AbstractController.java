package es.ies.puerto.abstractas;

import java.io.File;
import java.util.Properties;

import es.ies.puerto.config.ConfigManager;
import es.ies.puerto.modelo.UsuarioServiceModel;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class AbstractController {

    static final String Path_Db = "src/main/resources/usuarios.db";

    private UsuarioServiceModel usuarioServiceModel;

    private Properties propertiesIdioma;

    File file = new File(Path_Db);
    
    public AbstractController(){
        try {
            usuarioServiceModel = new UsuarioServiceModel(Path_Db);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public Text textUsuario;

    @FXML
    public Text textContrasenia;

    public void cambiarIdioma() {
        textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textContrasenia.setText(ConfigManager.ConfigProperties.getProperty("textContrasenia"));
    }

    public UsuarioServiceModel getUsuarioServiceModel() {
        return this.usuarioServiceModel;
    }

    public Properties getPropertiesIdioma() {
        return this.propertiesIdioma;
    }

    public Text getTextUsuario() {
        return this.textUsuario;
    }

    public Text getTextContrasenia() {
        return this.textContrasenia;
    }

}
