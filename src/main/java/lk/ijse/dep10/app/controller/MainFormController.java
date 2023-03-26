package lk.ijse.dep10.app.controller;

import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.WritableImage;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.security.PublicKey;
import java.util.ArrayList;


public class MainFormController {

    public Label lblTab;
    public AnchorPane root;
    public VBox vBox;
    public Label lblRectangle;
    public Label lblRoundedRectangle;
    public Label lblCircle;
    public Label lblPencil;
    public Label lblText;
    public Label lblEraser;
    public Label lblStroke;
    public Label lblFill;
    public ColorPicker clpFill;
    public ColorPicker clpStroke;
    public Label lblOval;
    public Label lblType;

    private double mouseX;
    private double mouseY;
    private String selectTool;
//    private ArrayList<Double> dragCoordinatesX = new ArrayList<Double>();
//    private ArrayList<Double> dragCoordinatesY = new ArrayList<Double>();
    private  String text;
    private WritableImage snapshot;


    @FXML
    private Canvas cnvMain;

    public void initialize() {
        // Anchor canvas to the root
        cnvMain.widthProperty().bind(root.widthProperty());
        cnvMain.heightProperty().bind(root.heightProperty());
        // set canvas color to white
        GraphicsContext gc = cnvMain.getGraphicsContext2D();
        gc.setFill(Color.web("white"));
        lblRectangle.setTooltip(new Tooltip("Rectangle Tool"));
        // adding tool tips for tools
        lblRoundedRectangle.setTooltip(new Tooltip("Rounded Rectangle Tool"));
        lblCircle.setTooltip(new Tooltip("Circle Tool"));
        lblOval.setTooltip(new Tooltip("Oval Tool"));
        lblPencil.setTooltip(new Tooltip("Pencil Tool"));
        lblText.setTooltip(new Tooltip("Text Tool"));
        lblEraser.setTooltip(new Tooltip("Eraser Tool"));
        lblStroke.setTooltip(new Tooltip("Stroke Tool"));
        lblFill.setTooltip(new Tooltip("Fill Tool"));

    }


    public void lblTabOnMouseReleased(MouseEvent mouseEvent) {

    }

/*
                                                                    Label Tab
*/

    public void lblTabOnMouseEntered(MouseEvent mouseEvent) {
        lblTab.setBackground(Background.fill(Color.GREY));


    }

    public void lblTabOnMouseExited(MouseEvent mouseEvent) {
        lblTab.setBackground(Background.fill(Color.BLACK));

    }

    public void lblTabOnMousePressed(MouseEvent mouseEvent) {
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();

    }

    public void lblTabOnMouseDragged(MouseEvent mouseEvent) {
        vBox.setLayoutX(mouseEvent.getSceneX() - mouseX);
        vBox.setLayoutY(mouseEvent.getSceneY() - mouseY);

    }

/*
                                                                   Label Rectangle
*/


    public void lblRectangleOnMouseEntered(MouseEvent mouseEvent) {
        lblRectangle.getGraphic().setOpacity(0.8);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblRectangle);
        st.setFromX(1);
        st.setFromY(1);
        st.setToX(1.1);
        st.setToY(1.1);
        st.play();
    }

    public void lblRectangleOnMouseExited(MouseEvent mouseEvent) {
        lblRectangle.getGraphic().setOpacity(1);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblRectangle);
        st.setFromX(1.1);
        st.setFromY(1.1);
        st.setToX(1);
        st.setToY(1);
        st.play();
    }


    public void lblRectangleOnMouseClicked(MouseEvent mouseEvent) {
        selectTool = "Rectangle";
    }


    public void lblRectangleOnMousePressed(MouseEvent mouseEvent) {


    }

    public void lblRectangleOnMouseDragged(MouseEvent mouseEvent) {


    }

/*
    Rounded Rectangle
*/

    public void lblRoundedRectangleOnMouseEntered(MouseEvent mouseEvent) {
        lblRoundedRectangle.getGraphic().setOpacity(0.8);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblRoundedRectangle);
        st.setFromX(1);
        st.setFromY(1);
        st.setToX(1.1);
        st.setToY(1.1);
        st.play();
    }


    public void lblRoundedRectangleOnMouseExited(MouseEvent mouseEvent) {
        lblRoundedRectangle.getGraphic().setOpacity(1);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblRoundedRectangle);
        st.setFromX(1.1);
        st.setFromY(1.1);
        st.setToX(1);
        st.setToY(1);
        st.play();
    }

    public void lblRoundedRectangleOnMouseClicked(MouseEvent mouseEvent) {
        selectTool = "RoundedRectangle";


    }

/*
    Label Circle
*/

    public void lblCircleOnMouseEntered(MouseEvent mouseEvent) {
        lblCircle.getGraphic().setOpacity(0.8);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblCircle);
        st.setFromX(1);
        st.setFromY(1);
        st.setToX(1.1);
        st.setToY(1.1);
        st.play();
    }


    public void lblCircleOnMouseExited(MouseEvent mouseEvent) {
        lblCircle.getGraphic().setOpacity(1);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblCircle);
        st.setFromX(1.1);
        st.setFromY(1.1);
        st.setToX(1);
        st.setToY(1);
        st.play();

    }

    public void lblCircleOnMouseClicked(MouseEvent mouseEvent) {
        selectTool = "Circle";
    }

/*
    Label Oval
*/

    public void lblOvalOnMouseEntered(MouseEvent mouseEvent) {
        lblOval.getGraphic().setOpacity(0.8);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblOval);
        st.setFromX(1);
        st.setFromY(1);
        st.setToX(1.1);
        st.setToY(1.1);
        st.play();


    }

    public void lblOvalOnMouseExited(MouseEvent mouseEvent) {
        lblOval.getGraphic().setOpacity(1);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblOval);
        st.setFromX(1.1);
        st.setFromY(1.1);
        st.setToX(1);
        st.setToY(1);
        st.play();

    }

    public void lblOvalOnMouseClicked(MouseEvent mouseEvent) {
        selectTool = "Oval";
    }




/*
    Label Pencil
*/

    public void lblPencilOnMouseEntered(MouseEvent mouseEvent) {
        lblPencil.getGraphic().setOpacity(0.8);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblPencil);
        st.setFromX(1);
        st.setFromY(1);
        st.setToX(1.1);
        st.setToY(1.1);
        st.play();

    }

    public void lblPencilOnMouseExited(MouseEvent mouseEvent) {
        lblPencil.getGraphic().setOpacity(1);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblPencil);
        st.setFromX(1.1);
        st.setFromY(1.1);
        st.setToX(1);
        st.setToY(1);
        st.play();

    }

    public void lblPencilOnMouseCliked(MouseEvent mouseEvent) {
        selectTool = "Pencil";
    }

/*
    Label Text
*/

    public void lblTextOnMouseEnterd(MouseEvent mouseEvent) {
        lblText.getGraphic().setOpacity(0.8);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblText);
        st.setFromX(1);
        st.setFromY(1);
        st.setToX(1.1);
        st.setToY(1.1);
        st.play();
    }

    public void lblTextOnMouseExited(MouseEvent mouseEvent) {
        lblText.getGraphic().setOpacity(1);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblText);
        st.setFromX(1.1);
        st.setFromY(1.1);
        st.setToX(1);
        st.setToY(1);
        st.play();

    }

    public void lblTextOnMouseClicked() {
        selectTool = "Text";
    }

    public void lblTextOnInputMethodTextChange(InputMethodEvent inputMethodEvent) {
    }


/*
    Label Eraser
*/

    public void lblEraserOnMouseEntered(MouseEvent mouseEvent) {
        lblEraser.getGraphic().setOpacity(0.8);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblEraser);
        st.setFromX(1);
        st.setFromY(1);
        st.setToX(1.1);
        st.setToY(1.1);
        st.play();
    }

    public void lblEraserOnMouseExited(MouseEvent mouseEvent) {
        lblEraser.getGraphic().setOpacity(1);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblEraser);
        st.setFromX(1.1);
        st.setFromY(1.1);
        st.setToX(1);
        st.setToY(1);
        st.play();

    }

    public void lblEraserOnMouseClicked() {
        selectTool = "Eraser";
    }


/*
    Label Stroke
*/

    public void lblStrokeOnMouseEntered(MouseEvent mouseEvent) {
        lblStroke.getGraphic().setOpacity(0.8);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblStroke);
        st.setFromX(1);
        st.setFromY(1);
        st.setToX(1.1);
        st.setToY(1.1);
        st.play();

    }

    public void lblStrokeOnMouseExited(MouseEvent mouseEvent) {
        lblStroke.getGraphic().setOpacity(1);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblStroke);
        st.setFromX(1.1);
        st.setFromY(1.1);
        st.setToX(1);
        st.setToY(1);
        st.play();


    }

    /*
        Label Fill
    */
    public void lblFillOnMouseEntered(MouseEvent mouseEvent) {
        lblFill.getGraphic().setOpacity(0.8);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblFill);
        st.setFromX(1);
        st.setFromY(1);
        st.setToX(1.1);
        st.setToY(1.1);
        st.play();

    }

    public void lblFillOnMouseExited(MouseEvent mouseEvent) {
        lblFill.getGraphic().setOpacity(1);
        ScaleTransition st = new ScaleTransition(Duration.millis(100), lblFill);
        st.setFromX(1.1);
        st.setFromY(1.1);
        st.setToX(1);
        st.setToY(1);
        st.play();


    }

    public void clpStrokeOnAction(ActionEvent actionEvent) {
        GraphicsContext gc = cnvMain.getGraphicsContext2D();
        gc.setStroke(clpStroke.getValue());
    }

    public void clpFillOnAction(ActionEvent actionEvent) {
        GraphicsContext gc = cnvMain.getGraphicsContext2D();
        gc.setFill(clpFill.getValue());
    }

/*
    cnvMain Canves
*/

    public void cnvMainOnMouseDragged(MouseEvent mouseEvent) {


        if (selectTool.equals("Rectangle")) {
            double x = mouseEvent.getX();
            double y = mouseEvent.getY();
            double width = x - mouseX;
            double height = y - mouseY;
            GraphicsContext gc = cnvMain.getGraphicsContext2D();
            gc.clearRect(0, 0, cnvMain.getWidth(), cnvMain.getHeight());
            gc.drawImage(snapshot,0,0);
            gc.strokeRect(width < 0 ? x : mouseX, height < 0 ? y : mouseY, Math.abs(width), Math.abs(height));
            gc.fillRect(width < 0 ? x : mouseX, height < 0 ? y : mouseY, Math.abs(width), Math.abs(height));
        }
        if (selectTool.equals("RoundedRectangle")) {
            double x = mouseEvent.getX();
            double y = mouseEvent.getY();
            double width = x - mouseX;
            double height = y - mouseY;
            GraphicsContext gc = cnvMain.getGraphicsContext2D();
            gc.clearRect(0, 0, cnvMain.getWidth(), cnvMain.getHeight());
            gc.strokeRoundRect(width < 0 ? x : mouseX, height < 0 ? y : mouseY, Math.abs(width), Math.abs(height), 40, 40);
            gc.fillRoundRect(width < 0 ? x : mouseX, height < 0 ? y : mouseY, Math.abs(width), Math.abs(height), 40, 40);
        }
        if (selectTool.equals("Circle")) {
            double x = mouseEvent.getX();
            double y = mouseEvent.getY();
            double width = x - mouseX;
            double height = y - mouseY;
            GraphicsContext gc = cnvMain.getGraphicsContext2D();
            gc.clearRect(0, 0, cnvMain.getWidth(), cnvMain.getHeight());
//            gc.strokeRoundRect(width < 0 ? x : mouseX, height < 0 ? y : mouseY, Math.abs(width), Math.abs(width), Math.abs(width), Math.abs(width));
//            gc.fillRoundRect(width < 0 ? x : mouseX, height < 0 ? y : mouseY, Math.abs(width), Math.abs(width), Math.abs(width), Math.abs(width));
            if (Math.abs(width) > Math.abs(height)) {
                gc.strokeOval(width < 0 ? x : mouseX, height < 0 ? y : mouseY, Math.abs(width), Math.abs(width));
                gc.fillOval(width < 0 ? x : mouseX, height < 0 ? y : mouseY, Math.abs(width), Math.abs(width));

            } else {
                gc.strokeOval(width < 0 ? x : mouseX, height < 0 ? y : mouseY, Math.abs(height), Math.abs(height));
                gc.fillOval(width < 0 ? x : mouseX, height < 0 ? y : mouseY, Math.abs(height), Math.abs(height));
            }

        }
        if (selectTool.equals("Oval")) {
            double x = mouseEvent.getX();
            double y = mouseEvent.getY();
            double width = x - mouseX;
            double height = y - mouseY;
            GraphicsContext gc = cnvMain.getGraphicsContext2D();
            gc.clearRect(0, 0, cnvMain.getWidth(), cnvMain.getHeight());
            gc.strokeOval(width < 0 ? x : mouseX, height < 0 ? y : mouseY, Math.abs(width), Math.abs(height));
            gc.fillOval(width < 0 ? x : mouseX, height < 0 ? y : mouseY, Math.abs(width), Math.abs(height));
        }
        if (selectTool.equals("Pencil")) {

            double x = mouseEvent.getX();
            double y = mouseEvent.getY();
//            dragCoordinatesX.add(x);
//            dragCoordinatesY.add(y);

            GraphicsContext gc = cnvMain.getGraphicsContext2D();
//            gc.clearRect(0, 0, cnvMain.getWidth(), cnvMain.getHeight());
//            gc.lineTo();
            //gc.strokeLine(dragCoordinatesX.get(dragCoordinatesX.size() -1), dragCoordinatesY.get(dragCoordinatesY.size()-1), x, y);
            gc.strokeLine(mouseX, mouseY, x,y);
            mouseX = x;
            mouseY = y;


        }
        if (selectTool.equals("Eraser")) {
            double x = mouseEvent.getX();
            double y = mouseEvent.getY();
            GraphicsContext gc = cnvMain.getGraphicsContext2D();

            gc.clearRect(x,y,60,60);

        }



    }


    public void cnvMainOnMousePressed(MouseEvent mouseEvent) {
        if (selectTool.equals("Rectangle") || selectTool.equals("RoundedRectangle") || selectTool.equals("Circle") || selectTool.equals("Oval") || selectTool.equals("Pencil")) {
            mouseX = mouseEvent.getX();
            mouseY = mouseEvent.getY();
            System.out.println(mouseX);
//            dragCoordinatesX.add(mouseX);
//            dragCoordinatesY.add(mouseY);
            snapshot = cnvMain.snapshot(new SnapshotParameters(),null);

        }
    }







    public void cvVMainOnMouseClicked(MouseEvent mouseEvent) {
        if(selectTool.equals("Text")){
            lblText.requestFocus();




            GraphicsContext gc = cnvMain.getGraphicsContext2D();
            gc.strokeText(text,mouseEvent.getX(),mouseEvent.getY(),5);
        }
    }

    public void cnvMainOnKeyPressed(KeyEvent keyEvent) {
//        if(lblText.)
    }
}


