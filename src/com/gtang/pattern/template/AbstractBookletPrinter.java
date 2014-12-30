package com.gtang.pattern.template;

public abstract class AbstractBookletPrinter {

    public final void print() {
        
        printFrontCover();
        printTableOfContents();
        
        for (int i=0; i<getPageCount(); i++) {
            printPage(i);
        }
        
        printIndex();
        printBackCover();
        
    }
    
    protected abstract int getPageCount();
    protected abstract void printFrontCover();
    protected abstract void printTableOfContents();
    protected abstract void printPage(int pageNumber);
    protected abstract void printIndex();
    protected abstract void printBackCover();
    
}
