package com.Exam.school;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("activity_main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}//end start()
	
	public static void main(String[] args) {
		launch(args);
		System.out.println("Hello. This SQL Side");
		// DB Info. 
					String url = "jdbc:mysql://localhost:3306/finalschool";
					String userName = "root";
					String passWord = "P@$$word1234!@#$";
					String query = "select personid from person";
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} // this will load the driver
					Connection con;
					try {
						con = DriverManager.getConnection(url, userName, passWord);
					
					// PreparedStatement. This is used for dynamic SQL
					Statement st = con.createStatement();
					//this will return results and column header
					st.executeQuery(query);
					ResultSet rs = st.executeQuery(query);
					rs.next();
					String name = rs.getString("personid");
					System.out.println(name);
					st.close();
					con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
	}// end main()
}//end class()
