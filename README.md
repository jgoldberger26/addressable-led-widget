# Addressable LED Widget

A simple widget that displays an LED strip in shuffleboard

<img src="https://user-images.githubusercontent.com/87028711/185767979-16431206-b3c5-49f0-a49b-4aa474467316.gif" width="200" />


## Installation

Put [this jar](src=https://github.com/jgoldberger26/addressable-led-widget/releases/download/v1.0.0/addressable-led-widget.jar width=200) into your Shuffleboard/plugins directory

> **Note**
> 
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
