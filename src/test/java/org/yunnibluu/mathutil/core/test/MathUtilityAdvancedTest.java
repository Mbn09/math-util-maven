/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.yunnibluu.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.yunnibluu.mathutil.core.MathUtility;

/**
 *
 * @author ngocn
 */
public class MathUtilityAdvancedTest {
    
//    Chuẩn bị sẵn riêng data, lát hồi fill vào hàm
//    DDT
    
    // Hàm trả về mảng 2 chiều, kiểu Wrapper class/object
    // Mảng chứa các cặp n -> expected value
    // VD 01-> 1; 1! -> 1, 5 -> 120
    public static Object[][] initTestData() {
        Object[][] testData = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {5, 120}, 
                               {6, 7200}
                              };
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell (int n, long expected) {
//         tham số hóa việc đưa test data vào hàm asserE()
//  biến đổi dữ liệu thành tham số cho tổng quát
//  PARAMETERIZED

        assertEquals(expected, MathUtility.getFactorial(n));
        
    }

// TDD vs DDT   
// TDD - Test Driven Development
//  Kĩ thuật viết code chính đan xen, xen kẽ cùng với viết code Test Case
//  Quá trình viết code làm app, ta làm luôn những đọn code dùng framework, thư viên, unitTest, Junit, ActUnit, TestNG
//  dùng để test hàm ta vừa code
    
//  Viết cde và viết code test cùng vơ nhau thì gọi là kĩ thuật lâp trình hướng về kiểm thử - TDD
    
// DDT - Data Driven Testing
//  là kĩ thuật mở rộng bổ trợ thêm cho TDD
//  là kĩ thuật viết các test code mà ta tách riêng dataa test tiêng
//  câu lệnh so sánh ra 1 chỗ
//  kết nối, map/fill test data vào hàm test thông qua các tham số
//  {6, 720} => fill vào 2 biến n, expected và lát hồi biến 2 biến này đc fill vào tiếp cái hàm assertEquals
    
//  Kì thuật tách data nhma hướng cho việc kiểm thử => DDT
//  còn gọi 1 ten khác còn gọi là PARAMETERIZED TESTING
//  kĩ thuật kiểm thử code mà hướng về tham số hóa các data test    

}
