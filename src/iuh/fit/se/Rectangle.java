/*
 * @ (#) Rectangle.java   1.0 8/21/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.se;

/*
 * @description
 * @author: Duong Nguyen
 * @date: 8/21/2024
 * version: 1.0
 */
public class Rectangle {
    private double length;
    private double width;

    //phuong thuc tinh dien tich
    public double getArea(){
        return length * width;
    }
    //phuong thuc tinh chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }
    //property get
    public double getLenght(){
        return length;
    }
    public double getWidth(){
        return  width;
    }
    //constructor
    public Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
    }
    public Rectangle(double length, double width) throws IllegalAccessException {
        if (length <= 0 || width <= 0)
            throw new IllegalAccessException("Length and width must be greater than 0");
        this.length = length;
        this.width = width;
    }
    //property set
    public void setLength(double length) throws IllegalAccessException {
        if (length <= 0)
            throw new IllegalAccessException("Length must be greater than 0");
        this.length = length;
    }    
    public void setWidth(double width) throws IllegalAccessException{
        if (width <= 0)
            throw new IllegalAccessException("Width must be greater than 0");
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
