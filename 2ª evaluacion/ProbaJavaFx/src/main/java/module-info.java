module com.mycompany.probajavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.probajavafx to javafx.fxml;
    exports com.mycompany.probajavafx;
}
