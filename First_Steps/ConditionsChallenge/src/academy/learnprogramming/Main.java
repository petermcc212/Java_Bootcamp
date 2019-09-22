package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	double varOne = 20.00d;
	double varTwo = 80.00d;
	double varTotal = ((varOne + varTwo)* 100.00d);
    System.out.println("VarTotal = " + varTotal);
	double varRemainder = (varTotal% 40.00d);
    System.out.println("VarRemainder = " + varRemainder);



	boolean isNoRemainder = (varRemainder == 0)? true : false;
    System.out.println("varRemainder = " + isNoRemainder);
    if(!isNoRemainder){
        System.out.println("Got some remainder");
    }
    }
}
