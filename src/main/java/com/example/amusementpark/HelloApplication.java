package com.example.amusementpark;

import com.example.amusementpark.data.ride.Ride;
import com.example.amusementpark.database.RideDataBase;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        //launch();


        //your task here
        var rideDataBase = RideDataBase.getInstance();
        Ride ride = new Ride();
        ride.setName("This is ride");
        ride.setDescription("this is a sample description");

        Ride ride1 = new Ride();
        ride1.setName("This is ride 1");
        ride1.setDescription("this is a sample description 1");

        Ride ride2 = new Ride();
        ride2.setName("This is ride 2");
        ride2.setDescription("this is a sample description 2");

        rideDataBase.addRide(ride);
        rideDataBase.addRide(ride1);
        rideDataBase.addRide(ride2);

        rideDataBase.saveDatabase();

    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
