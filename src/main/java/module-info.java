module com.example.courseprojecteng {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires mysql.connector.j;
    requires java.sql;

    requires org.kordamp.bootstrapfx.core;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.persistence;

    opens com.example.courseprojecteng to javafx.fxml;
    exports com.example.courseprojecteng;
    exports com.example.courseprojecteng.fxController to javafx.fxml;
}