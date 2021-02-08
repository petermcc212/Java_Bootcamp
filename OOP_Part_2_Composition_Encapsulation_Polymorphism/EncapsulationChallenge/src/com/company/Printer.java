package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,  boolean duplex) {
        this.duplex = duplex;
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if((tonerAmount > 0) && (tonerAmount <= 100)){
            if(this.tonerLevel + tonerAmount <= 100){
                this.tonerLevel += tonerAmount;
                return tonerLevel;
            }
        }else{
            return -1;
        }            return -1;
    }


    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            if(pagesToPrint % 2 == 0){
                pagesToPrint = pagesToPrint / 2;
                pagesPrinted += pagesToPrint;
            }else{
                pagesToPrint = ((pagesToPrint /2)+1);
                pagesPrinted += pagesToPrint;
            }
        }else{
            pagesPrinted += pagesToPrint;
        }
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }


}
