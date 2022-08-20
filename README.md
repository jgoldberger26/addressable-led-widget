# Addressable LED Widget

A simple widget that displays an LED strip in shuffleboard

![Example Screenshot](TODO)

## Installation

Put [this jar](TODO) into your Shuffleboard/plugins directory

> **Note**
> This directory should have been created by shuffleboard.
> Its default location is {{userhome}}/Shuffleboard/plugins.

## Usage

This widget takes a byte[] and uses the Addressable LED widget. In java, this
could look like

(In the constructor)

```java
Shuffleboard.getTab("My Tab Name").addRaw("My Widget Name", this::getLedData).withWidget("Addressable LED");
```

(In the class)

```java
private byte[] getLedData() {
  return m_ledSim.getData();
}
```
