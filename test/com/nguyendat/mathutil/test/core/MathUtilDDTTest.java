/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.nguyendat.mathutil.test.core;



import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import com.nguyendat.mathutil.core.MathUtil;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 84859
 */
//câu lệnh này của JUnit báo hiệu rằng sẽ cần loop qua tập data để lấy ra cặp 
//input/expected để đưa hàm hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    //hàm này ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected|Input
    @Parameterized.Parameters //JUnit sẽ ngầm loop qua từng dòng của mãng
                              //để lấy ra dc cặp data input/expected
    public static Object[][] initData() {
        return new Integer[][] {
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {4,24},
            {6,120}  
        };
    }
    
    //giả sử loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột
    //vào biến tương ứng input, expected để lát đưa vào hàm
    @Parameterized.Parameter(value = 0) //value = 0 là map với mảng data
    public int n; //biến map với value của cột 0 của mảng
    @Parameterized.Parameter(value = 1) 
    public long expected; //kiểu long vì giá trị trả về của hàm là long
 
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
