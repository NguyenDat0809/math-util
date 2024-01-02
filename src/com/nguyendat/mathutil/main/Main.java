/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyendat.mathutil.main;

import com.nguyendat.mathutil.core.MathUtil;

/**
 *
 * @author 84859
 */
public class Main {
    public static void main(String[] args) {
        //thư nghiệm coi hàm tính giai thừa chạy đúng như thiết kế hay không
        //ta phải đưa các tính huống xử dụng hàm trong thực tế
        //ví dụ: -5 coi tính dc ko
        //          0 coi tính máy
        //          20 coi tính mấy
        //          21 coi tính mấy 
        //TESTCÁSE: MỘT TÌNH HUỐNG HÀM/APP/TÍNH NĂNG dc đưa vào sử dụng giả lập hình vi sài của ai đó
        
        //TESTCASE: là 1 tình huông sử dụng, sai fapp mà nó bao hàm
        //Data đầu vào
        //Output đầu ra ứng với xử lý của hàm
        //Kì vọng: mong hàm sẽ trả về value ứng với input ở trên
        //So sánh để bt kết quả xem có đúng như kì vọng ko
        long expected = 120; //kì vọng nếu tính 5!
        int n = 5; //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = "+ expected +" expected");
        System.out.println("5! = "+ actual + " actual");
    }
}
