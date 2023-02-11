package lk.ijse.dep10.app.controller;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

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
    private double mouseX;
    private double mouseY;



    @FXML
    private Canvas cnvMain;

    public void initialize() {
        GraphicsContext gc = cnvMain.getGraphicsContext2D();
        gc.setFill(Color.BLUE);
        gc.fillRect(0, 0 , cnvMain.getWidth(), cnvMain.getHeight());




    }






    public void lblTabOnMouseReleased(MouseEvent mouseEvent) {

    }

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
        vBox.setLayoutX(mouseEvent.getSceneX()- mouseX);
        vBox.setLayoutY(mouseEvent.getSceneY() -mouseY);

    }


    public void lblRectangleOnMouseEntered(MouseEvent mouseEvent) {
    }

    public void lblRectangleOnMouseExited(MouseEvent mouseEvent) {
    }

    public void lblRoundedRectangleOnMouseEntered(MouseEvent mouseEvent) {
    }

    public void lblRoundedRectangleOnMouseExited(MouseEvent mouseEvent) {
    }

    public void lblCircleOnMouseEntered(MouseEvent mouseEvent) {
    }

    public void lblCircleOnMouseExited(MouseEvent mouseEvent) {
    }

    public void lblPencilOnMouseEntered(MouseEvent mouseEvent) {
    }
    public void lblPencilOnMouseExited(MouseEvent mouseEvent) {
    }

    public void lblTextOnMouseEnterd(MouseEvent mouseEvent) {
    }

    public void lblTextOnMouseExited(MouseEvent mouseEvent) {
    }

    public void lblEraserOnMouseEntered(MouseEvent mouseEvent) {
    }

    public void lblEraserOnMouseExited(MouseEvent mouseEvent) {
    }

    public void lblStrokeOnMouseEntered(MouseEvent mouseEvent) {

    }
    public void lblStrokeOnMouseExited(MouseEvent mouseEvent) {

    }    public void lblFillOnMouseEntered(MouseEvent mouseEvent) {

    }
    public void lblFillOnMouseExited(MouseEvent mouseEvent) {

    }
}


