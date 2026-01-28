/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectkrishna;

/**
 * This class is sample code so can perform all steps for ICE4 
 * here i added code for simple calculator
 * 
 * @author patel
 */
public class krishnaICE4 {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        krishnaICE4 calc = new krishnaICE4();
        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(5, 3));
        System.out.println("Multiply: " + calc.multiply(5, 3));
        System.out.println("Divide: " + calc.divide(10, 2));
    }
}

