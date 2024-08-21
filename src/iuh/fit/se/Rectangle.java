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
    private double lenght;
    private double width;

    //phuong thuc tinh dien tich
    public double getArea(){
        return lenght * width;
    }
    //phuong thuc tinh chu vi
    public double getPerimeter() {
        return 2 * (lenght + width);
    }
    //property get
    public double getLenght(){
        return lenght;
    }
    public double getWidth(){
        return  width;
    }
    //constructor
    public Rectangle(){
        this.lenght = 0.0;
        this.width = 0.0;
    }
    public Rectangle(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }
    //property set
    public void setLenght(double lenght){
        this.lenght = lenght;
    }
    public void setWidth(double width){
        this.width = width;
    }
}
