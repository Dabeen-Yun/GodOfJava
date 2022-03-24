package Chap03;

public class Calculator {
    public static void main(String args[]){
        System.out.println("Calculator class started");
        Calculator cal = new Calculator();
        int a = 10;
        int b = 5;
        System.out.println("add="+cal.add(a,b));
        System.out.println("subtract="+cal.subtract(a,b));
        System.out.println("multiply="+cal.multi(a,b));
        System.out.println("divide="+cal.div(a,b));
    }
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multi(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}
