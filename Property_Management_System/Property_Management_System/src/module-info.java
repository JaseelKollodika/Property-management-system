module Property_Management_System {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires org.junit.jupiter.api;
	
	opens application to javafx.graphics, javafx.fxml;
}
