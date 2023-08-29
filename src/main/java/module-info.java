module git.jd.fmsquadbuilder {
    requires javafx.controls;
    requires javafx.base;
    requires org.apache.commons.csv;
    requires org.jsoup;


    opens git.jd499.fmsquadbuilder to javafx.fxml;
    exports git.jd499.fmsquadbuilder;
}