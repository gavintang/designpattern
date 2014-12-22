
package com.gtang.pattern.singleton;

public class SerialNumberGeneratorTraditional {

    private static SerialNumberGeneratorTraditional instance;

    public synchronized static SerialNumberGeneratorTraditional getInstance () {

        if (instance == null) {
            instance = new SerialNumberGeneratorTraditional();
        }

        return instance;
    }

    private int count = 0;

    private SerialNumberGeneratorTraditional () {}

    public synchronized int getNextSerial () {

        return ++count;
    }
}
