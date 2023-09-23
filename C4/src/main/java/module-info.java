module com.yashpreet.c4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.yashpreet.c4 to javafx.fxml;
    exports com.yashpreet.c4;
}