package com.gtang.pattern.template;

public class ServiceHistoryBooklet extends AbstractBookletPrinter {

    @Override
    protected int getPageCount () {

        return 100;
    }

    @Override
    protected void printFrontCover () {

        System.out.println("Printing front cover for Service History booklet");
    }

    @Override
    protected void printTableOfContents () {

        System.out.println("Printing table of contents for Service History booklet");
    }

    @Override
    protected void printPage (int pageNumber) {

        System.out.println("Printing page " + pageNumber + " for Service History booklet");
    }

    @Override
    protected void printIndex () {

        System.out.println("Printing index for Service History booklet");
    }

    @Override
    protected void printBackCover () {

        System.out.println("Printing back cover for Service History booklet");
    }

}
