package SpeedTail;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Controller {
    public Button music;
    public Button nav;
    public Button energy;
    public Button camera;
    public Button calls;
    public AnchorPane Asset_holder;



    public void Asset_holder(){

    }






    public static BorderPane createExample(){
        BorderPane borderPane = new BorderPane();
        borderPane.getStyleClass().add("bg-1");
        borderPane.setPadding(new Insets(5));

        Label top = createLabel("Top", "bg-2");
        top.setPrefHeight(100);
        borderPane.setTop(top);

        Label left = createLabel("Left", "bg-3");
        left.setPrefWidth(150);
        left.setMaxHeight(200);
        BorderPane.setAlignment(left, Pos.BOTTOM_LEFT);
        borderPane.setLeft(left);

        Label center = createLabel("Center", "bg-4");
        center.setMinWidth(250);
        center.setMaxWidth(450);
        center.setMaxHeight(200);
        BorderPane.setAlignment(center, Pos.TOP_CENTER);
        borderPane.setCenter(center);

        Label right = createLabel("Right", "bg-5");
        right.setPrefWidth(75);
        borderPane.setRight(right);

        Label bottom = createLabel("Bottom", "bg-6");
        borderPane.setBottom(bottom);

        return borderPane;
    }

    private static Label createLabel(String text, String styleClass){
        createExample();
        Label label = new Label(text);
        label.getStyleClass().add(styleClass);
        BorderPane.setMargin(label, new Insets(5));
        label.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        return label;
    }




    public static void main(String[] args) {

    }


    public void music(){
        System.out.println("showing music feed");
    }
    public void nav(){
        System.out.println("navigation has started");
    }
    public void energy(){
        System.out.println("showing how much energy has been consumed");
    }
    public void camera(){
        System.out.println("showing live camera feed");
    }
    public void calls(){
        System.out.println("showing caller and contacts");
    }


}
