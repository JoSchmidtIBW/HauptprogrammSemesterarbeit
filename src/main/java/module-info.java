module com.example.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


//    opens com.example.login to javafx.fxml;
//    exports com.example.login;
    exports GUI;
    opens GUI to javafx.fxml;
}


   // requires javafx.controls;
   //         requires javafx.fxml;


            //opens com.example.fxmltesti to javafx.fxml;
            //exports com.example.fxmltesti;