package com.gtang.pattern.template;

public class TemplateClient {

    public static void main(String[] args) {
        
        System.out.println("About to print a booklet for Saloon cars");
        AbstractBookletPrinter saloonBooklet = new SaloonBooklet();
        saloonBooklet.print();
        
        System.out.println("About to print a service history booklet");
        AbstractBookletPrinter serviceHistroy = new ServiceHistoryBooklet();
        serviceHistroy.print();
        
    }
    
}
