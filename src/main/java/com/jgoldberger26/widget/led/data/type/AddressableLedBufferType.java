package com.jgoldberger26.widget.led.data.type;

import edu.wpi.first.shuffleboard.api.data.SimpleDataType;

public class AddressableLedBufferType extends SimpleDataType<byte[]> {

    public static final AddressableLedBufferType Instance = new AddressableLedBufferType();

    private AddressableLedBufferType() {
        super("AddressableLed", byte[].class);
    }

    @Override
    public byte[] getDefaultValue() {
        return new byte[0];
    }
}
