module com.pokedex.pokedex {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.pokedex.pokedex to javafx.fxml;
    exports com.pokedex.pokedex;
}