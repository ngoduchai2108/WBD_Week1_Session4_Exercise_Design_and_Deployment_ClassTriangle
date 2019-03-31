package com.code;

public class Shape {
    private String color_ = "green";
    private boolean filled_ = true;

    public Shape() {
    }

    public Shape(String color_, boolean filled_) {
        this.color_ = color_;
        this.filled_ = filled_;
    }

    public String getColor_() {
        return color_;
    }

    public void setColor_(String color_) {
        this.color_ = color_;
    }

    public boolean isFilled_() {
        return filled_;
    }

    public void setFilled_(boolean filled_) {
        this.filled_ = filled_;
    }

    @Override
    public String toString() {
        return "A Shape a color of " + getColor_() + " and " + (isFilled_() ? " filled ": " NOT filled");
    }
}
