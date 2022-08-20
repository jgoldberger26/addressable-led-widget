package com.jgoldberger26.widget.led;

import java.util.List;

import com.jgoldberger26.widget.led.widget.AddressableLedWidget;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType; 

@Description(group="com.jgoldberger26", name="AddressableLedPlugin", version="1.0.0", summary = "A plugin for displaying LED patterns in shuffleboard")
public class AddressableLedWidgetPlugin extends Plugin {
    @Override
    public List<ComponentType> getComponents() {
        return List.of(WidgetType.forAnnotatedWidget(AddressableLedWidget.class));
    }
}
