/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nguyendat.mathutil.test.core;

//import org.junit.jupiter.api.Test;
import com.nguyendat.mathutil.core.MathUtil;
import java.io.ObjectOutputStream;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilityTest {

    public MathUtilityTest() {
        //đây là class sẽ sử dụng các hàm của junit framework để verify code chính
        //ở đây là hàm tính GIAO THỪA ở core.MathUtil

    }
    //có nhiều quy tắc đặt tên hàm kiểm thử nhưng thường là nói lên mục đích
    //của các case/tình huống kiểm thử theo kiểu thành công hay thất bại

    //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //ta sẽ sài hàm kiểu well - đưa 5!,6!
    @Test //@Test Junit sẽ phối hợp với JVM để chạy hàm
    //bản chất là public static voi main()
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test thử tình huống tử tế đầu vào
        long expected = 1; //hy vọng 0! = 1
        //long actual = ; //gọi hàm cần test bên trong core/app chính
        long actual = MathUtil.getFactorial(n);

        //so sánh expected với actual
        Assert.assertEquals(expected, actual);
        //hàm giúp so sánh 2 giá trị nào đó có giống nhau ko
        //nếu giống thì trả về màu xanh -> code ngon
        //nếu trả về màu đỏ -> expected và actual ko giống nhau

        //gộp thêm vài case thành công 
        Assert.assertEquals(1, MathUtil.getFactorial(1)); //tui muốn 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); //tui muốn 2! == 2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); //tui muốn 3! == 24
        Assert.assertEquals(720, MathUtil.getFactorial(6)); //tui muốn 6! == 720

    }
    
    
    //hàm getF() ta thiết kế có 2 tình huống xử lý
    //1. đưa data tử tế trong [0...20] -> xanh
    //2. đưa data cà chớn, âm hoặc > 20 -> ra ngoại lệ
    //Test này kì vọng ngoại lệ xuất hiện
    
    //Test tình huống ngoại lệ, mà nó ném ngoại lệ -> nó đúng vì hàm đã ném ra ngoại lệ như thiết kế
    //Test case:
    //input: -5
    //exception: IllegalArgumentException xuất hiện
    //những tình huống bất thường, ngoại lệ, ngoài dự tính là những thứ ko thể đo lường theo value
    //mà chỉ có thể đo lường bằng cách chúng có xuất hiện ko
    // -> ko sử dụng assertEqual để so sánh 2 ngoại lệ
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5); //hàm @Test/MathUtil.get..() chạy sẽ phải ném về ngoại lệ NumberFormatException
//    }
    //trả về màu đỏ, do hàm đúng có ném exception nhưng ko phải cái kì vọng
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5); //hàm @Test/MathUtil.get..() chạy sẽ phải ném về ngoại lệ NumberFormatException
    }

    //cách khác để bắt ngoại lệ xuất hiện
    //xài Labda
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        //Assert.assertThrows(tham số 1: ngoại lệ muốn so sánh, tham số 2: đoạn code chạy văng ra ngoại lệ runnable)
        
        Assert.assertThrows(IllegalArgumentException.class, 
                () -> MathUtil.getFactorial(-5) );
        
        //MathUtil.getFactorial(-5); //hàm @Test/MathUtil.get..() chạy sẽ phải ném về ngoại lệ NumberFormatException
    }
}
