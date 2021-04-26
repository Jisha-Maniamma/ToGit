package com.Java.Class1.Day16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/22 11:17
 */


public class StickMan  extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(100, 100, 0);//head
        Circle circle1 = new Circle(120, 80, 50);//eye
        circle1.setRadius(5);//radius of eye
        circle.setRadius(50);//radius of head
        circle.setStroke(Color.BLACK);//circle color
        circle1.setStroke(Color.BLACK);//circle color
        circle.setFill(null);//makes the head empty(no brain haha)
        circle.setStrokeWidth(5);//sets the line thickness of circle (head)

        Arc arc = new Arc();//mouth
        arc.setCenterX(110.0f);//mouth position
        arc.setCenterY(120.0f);//mouth position
        arc.setRadiusX(35.0f);//mouth size
        arc.setRadiusY(25.0f);//mouth size
        arc.setStartAngle(1.0f);//angle of mouth
        arc.setLength(5.0f);//length of mouth
        arc.setType(ArcType.ROUND);

        Line line1 = new Line(100, 250, 100, 150); //body of stick figure
        Line line2 = new Line(); //left leg
        Line line3 = new Line();//right leg
        Line line4 = new Line();//right arm
        Line line5 = new Line();//left arm

        line2.setStartX(30.0f); //left leg starting position y
        line2.setStartY(350.0f);//left leg starting position y
        line2.setEndX(100.0f);//left leg end pos x
        line2.setEndY(250.0f);//left leg end pos y

        line3.setStartX(200.0f); //right leg start pos x
        line3.setStartY(350.0f);// right leg start pos y
        line3.setEndX(100.0f); //right leg end pos x
        line3.setEndY(250.0f); //right leg end pos y

        line4.setStartX(100.0f);//right arm start pos x
        line4.setStartY(200.0f); //right arm start pos y
        line4.setEndX(200.0f); //right arm end pos x
        line4.setEndY(170.0f); //right arm end pos y

        line5.setStartX(30.0f);//left arm arm statt pos x
        line5.setStartY(250.0f); // left arm start pos y
        line5.setEndX(100.0f);//left arm end pos x
        line5.setEndY(200.0f);//left arm end pos y

        line1.setStrokeWidth(5); //thickness of line
        line1.setStroke(Color.BLACK);//color of line
        line2.setStrokeWidth(5);//thickness of line
        line2.setStroke(Color.BLACK);//color of line
        line3.setStrokeWidth(5);//thickness of line
        line3.setStroke(Color.BLACK);//color of line
        line4.setStrokeWidth(5);//thickness of line
        line4.setStroke(Color.BLACK);//color of line
        line5.setStrokeWidth(5);//thickness of line
        line5.setStroke(Color.BLACK);//color of line

// Create a pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(circle); //adds circle to picture
        pane.getChildren().add(circle1);//adds circle to picture
        pane.getChildren().add(line1);//adds line
        pane.getChildren().add(line2);//adds line
        pane.getChildren().add(line3);//adds line
        pane.getChildren().add(line4);//adds line
        pane.getChildren().add(line5);//adds line
        pane.getChildren().add(arc);//adds arc




        Scene scene = new Scene(pane, 400, 400);

        primaryStage.setTitle("stick figure");//title
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}