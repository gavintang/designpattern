package com.gtang.pattern.singleton;


public class Client {

    public static void main (String[] args) {

        SerialNumberGeneratorTraditional generatorA = SerialNumberGeneratorTraditional.getInstance();
        
        System.out.println(generatorA.getNextSerial());
        System.out.println(generatorA.getNextSerial());
        System.out.println(generatorA.getNextSerial());
        System.out.println(generatorA.getNextSerial());
        
        System.out.println("--------------------------------------------------");
        
        SerialNumberGenerator generatorB = SerialNumberGenerator.ENGINE;
        SerialNumberGenerator generatorC = SerialNumberGenerator.VEHICLE;
        
        System.out.println(generatorB.getNextSerial());
        System.out.println(generatorB.getNextSerial());
        System.out.println(generatorC.getNextSerial());
        System.out.println(generatorB.getNextSerial());
        System.out.println(generatorC.getNextSerial());

    }

}
