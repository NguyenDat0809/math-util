/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyendat.mathutil.core;

/**
 *
 * @author 84859
 */
public class MathUtil {
    //class này cung cấp ra ngoài nhiều hàm xử lý toán học
    //-> clone class Math của JDK
    //hàm thư viện sài chung cho ai đó mà không cần lưu lại giá trị -> thiết kế là static
    
    //hàm tính giai thừa!!!
    //n! = 1.2.3.4...n
    //không có giai thừa âm
    //0! = 1! =1
    //giai thừa tăng rất nhanh
    //20 giai thừa 18 con số 0, vừa đủ cho kiểu long -> 21 giai thừa tràn kiểu long
    //bài này quy ước tính n! từ 0..20
//    public static long getFactorial(int n){
//        if(n < 0 || n >20)
//            throw new IllegalArgumentException("invalid agrument. N must be between 0..20");
//        if(n == 0 || n == 1)
//            return 1; //nhận các giá trị đặc biệt thì trả về lun
//        long result = 1;
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//        return result;
//    }
    
    //Đệ quy code - RECURSION
    public static long getFactorial(int n){
        if(n < 0 || n >20)
            throw new IllegalArgumentException("invalid agrument. N must be between 0..20");
        if(n == 0 || n == 1)
            return 1; 
        return n* getFactorial(n-1);
    }
}
