package com.jgoldberger26.widget.led.widget;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.PixelFormat;
import javafx.scene.layout.Pane;

@Description(name = "Addressable LED", dataTypes = byte[].class, summary = "Displays the color pattern of an LED buffer")
@ParametrizedController("AddressableLedWidget.fxml")
public class AddressableLedWidget extends SimpleAnnotatedWidget<byte[]> {
    @FXML
    private Pane root;
    @FXML
    private Canvas canvas;

    @FXML
    private void initialize() {
        // Creating a scene puts a panel behind the LED
        new Scene(root, 0, 0);
        canvas = new Canvas(144, 5);

        dataOrDefault.addListener(observable -> {
            drawLedPattern(dataOrDefault.get());
        });

        root.getChildren().add(canvas);
    }

    private void drawLedPattern(byte[] pattern) {
        canvas.getGraphicsContext2D().getPixelWriter().setPixels(0, 0, pattern.length / 4, 5,
                PixelFormat.getByteBgraPreInstance(), pattern, 0, 0);
    }

    @Override
    public Pane getView() {
        return root;
    }

}
