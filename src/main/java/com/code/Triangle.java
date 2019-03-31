package com.code;

public class Triangle extends Shape {
    private double side1_ = 1.0;
    private double side2_ = 1.0;
    private double side3_ = 1.0;

    public Triangle() {
    }

    public Triangle(double side1_, double side2_, double side3_) {
        this.side1_ = side1_;
        this.side2_ = side2_;
        this.side3_ = side3_;
    }

    public double getSide1_() {
        return side1_;
    }

    public void setSide1_(double side1_) {
        this.side1_ = side1_;
    }

    public double getSide2_() {
        return side2_;
    }

    public void setSide2_(double side2_) {
        this.side2_ = side2_;
    }

    public double getSide3_() {
        return side3_;
    }

    public void setSide3_(double side3_) {
        this.side3_ = side3_;
    }

    public double getPerimeter(){
        return side1_+side2_+side3_;
    }
    public double getArea(){
        double p =getPerimeter()/2;
        return Math.sqrt(p*(p-side1_)*(p-side2_)*(p-side3_));
    }

    @Override
    public String toString() {
        if ((side1_+side2_)>side3_ && (side1_+side3_)>side2_ && (side3_+side2_)>side1_){
            return "A Triangle with three side is: a = "+ getSide1_()+", b = "+ getSide2_()+" c = "+getSide3_()+
                    ",Has Perimeter = "+ getPerimeter()+", Area = "+ getArea();
        }else {
            return "Three sides NOT sides of a Triangle.";
        }

    }
}
