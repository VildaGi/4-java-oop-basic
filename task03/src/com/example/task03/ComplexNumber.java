package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(double real) { this(real, 0.0); }
    public ComplexNumber(){
        this(0.0,0.0);
    }

    public double getReal() { return real; }
    public double getImaginary() { return imaginary; }


    public void setReal(double real) { this.real = real; }
    public void setImaginary(double imaginary) { this.imaginary = imaginary; }

    public ComplexNumber add(ComplexNumber otherNumber){
        return new ComplexNumber(
                real + otherNumber.real,
                imaginary + otherNumber.imaginary
        );
    }

    public ComplexNumber subtract(ComplexNumber otherNumber){
        return new ComplexNumber(
                real - otherNumber.real,
                imaginary - otherNumber.imaginary
        );
    }

    public ComplexNumber multiply(ComplexNumber otherNumber){
        double newReal = real * otherNumber.real - imaginary * otherNumber.imaginary;
        double newImaginary = real * otherNumber.imaginary + imaginary * otherNumber.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public String toString(){
        return real + (imaginary >= 0 ? "+" : "-") + Math.abs(imaginary) + "i";
    }
}
