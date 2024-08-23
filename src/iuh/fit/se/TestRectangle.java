/*
 * @ (#) TestRectangle.java   1.0 8/21/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.se;

import java.util.Scanner;

/*
 * @description
 * @author: Duong Nguyen
 * @date: 8/21/2024
 * version: 1.0
 */
public class TestRectangle {
    public static void main(String[] args) throws IllegalAccessException {
        // Tạo đối tượng Scanner để nhập liệu
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập chiều dài và chiều rộng
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double length = sc.nextDouble();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double width = sc.nextDouble();

        // Tạo đối tượng Rectangle
        Rectangle rectangle = new Rectangle(length, width);

        // In ra chu vi, diện tích và biểu diễn dạng chuỗi của hình chữ nhật
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
        System.out.println("Biểu diễn hình chữ nhật dạng chuỗi: " + rectangle.toString());

        // Đóng Scanner
        sc.close();
    }

}
