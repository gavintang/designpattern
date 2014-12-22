
package com.gtang.pattern.singleton;

public enum SerialNumberGenerator {

    ENGINE, VEHICLE;

    private int count = 0;

    private SerialNumberGenerator () {}

    public int getNextSerial () {

        return ++count;
    }
}
