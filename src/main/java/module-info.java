module git.jd499.fmsquadbuilder {
    requires javafx.controls;
    requires javafx.base;
    requires org.apache.commons.csv;
    requires org.jsoup;


    opens git.jd499.fmsquadbuilder to javafx.fxml;
    exports git.jd499.fmsquadbuilder;
    exports git.jd499.fmsquadbuilder.domain;
    opens git.jd499.fmsquadbuilder.domain to javafx.fxml;
    exports git.jd499.fmsquadbuilder.data;
    opens git.jd499.fmsquadbuilder.data to javafx.fxml;
}