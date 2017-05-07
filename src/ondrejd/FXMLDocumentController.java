/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondrejd;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.prefs.*;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebView;

/**
 *
 * @author ondrejd
 */
public class FXMLDocumentController implements Initializable {
    private static final String DEFAULT_URL = "https://webtrh.cz/feeds/?count=10&catid=101&searchauctions=1&do=process";
    private static final Integer DEFAULT_CATID = 101;
    private static final Integer DEFAULT_COUNT = 50;

    private Preferences prefs;

    @FXML
    private Button toolbarButton_Refresh;

    @FXML
    private Button toolbarButton_Templates;

    @FXML
    private ListView listView;

    @FXML
    private WebView webView;

    @FXML
    private void handleRefreshAction(ActionEvent event) {
        // ...
    }

    @FXML
    private void handleTemplatesAction(ActionEvent event) {
        // ...
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize user preferences
        prefs = Preferences.userNodeForPackage(ondrejd.FXMLDocumentController.class);

        // Set up button icons
        Image iconRefresh   = new Image("resources/graphics/refresh.png");
        Image iconTemplates = new Image("resources/graphics/templates.png");
        toolbarButton_Refresh.setGraphic(new ImageView(iconRefresh));
        toolbarButton_Templates.setGraphic(new ImageView(iconTemplates));

        // TODO Finish initialization!
    }
}
