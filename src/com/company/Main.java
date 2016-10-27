package com.company;

public class Main {
    private final Calculator calculator = new Calculator();
    private final SignFiller signFiller = new SignFiller();

    public static void main(String[] args) {
	    Main main = new Main();
        String s1 = "11+2*3"; //17
        String s2 = "11+2/3"; //11.666
        String s3 = "11+2/3/4"; //11.166
        String s4 = "11+2/3*3"; //13
        String s5 = "1-4/3+2/5"; //0.066
        String s6 = "1/3-2*8+1/3"; //-15.333
        String s7 = "1/3-2*8-1/3"; //-16
        System.out.println(main.calculator.calculate(s1));
        System.out.println(main.calculator.calculate(s2));
        System.out.println(main.calculator.calculate(s3));
        System.out.println(main.calculator.calculate(s4));
        System.out.println(main.calculator.calculate(s5));
        System.out.println(main.calculator.calculate(s6));
        System.out.println(main.calculator.calculate(s7));

        main.signFiller.fillWithSimpleSigns("423009");
    }
}