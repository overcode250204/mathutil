package com.overcode.tool.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test //MANG Ý NGHĨA BIẾN HÀM Ở SÁT DƯỚI THÀNH HÀM MAIN() THÌ MỚI CHẠY LỆNH TEST ĐƯỢC KHI RUN APP!!!
    //TEST CASE #1: VERIFY GETFACTORIAL WITH N = 0
    void testFactorialGivenRightArgument0RunsWell() {
        int n = 0;
        long expected = 1; //HY VỌNG N = 0, TỨC LÀ 0! SẼ CÓ GIÁ TRỊ LÀ 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual); //SO GIÚP TÔI THỰC TẾ CÓ NHƯ KÌ VỌNG KHÔNG NẾU KO THÌ RA MÀU ĐỎ
                                        // NẾU EXPECTED = ACTUAL, RA MÀU XANH
    }

    //TEST CASE #2: VERIFY GETFACTORIAL WITH N = 1
    @Test
    void testFactorialGivenRightArgument1RunsWell() {
        int n = 1;
        long expected = 1; //HY VỌNG N = 0, TỨC LÀ 1! SẼ CÓ GIÁ TRỊ LÀ 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual); //SO GIÚP TÔI THỰC TẾ CÓ NHƯ KÌ VỌNG KHÔNG NẾU KO THÌ RA MÀU ĐỎ
        // NẾU EXPECTED = ACTUAL, RA MÀU XANH
    }

    //TEST CASE #3: VERIFY GETFACTORIAL
    @Test
    void testFactorialGivenRightArgumentRunsWell() {

        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }

    //TEST CASE #4: (BẮT NGOẠI LỆ)
    //VERIFY getFactorial() with n < 0, e.g n = 5 to throw an Expection
    //Steps:
    //1. Given an invalid number, n = -5
    //2. Call/invoke the function getFactorial(-5)
    //Expected result
    //              an IllegalArgumentExpection will be thrown
    // NẾU ĐƯA -5 HY VỌNG SẼ THẤY NGOẠI LỆ
    @Test
    public void testFactorialGivenWrongArgumentMinus5ThrowsException() {
        //TA PHẢI KIỂM SOÁT TA PHẢI ĐO XEM NGOẠI LỆ ĐÃ ĐẾN CHƯA
        //NẾU LÀ -5 ĐƯA VÀO
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5));
        //SO SÁNH ĐO XEM, NHÌN XEM, NGOẠI LỆ ĐÃ XUẤT HIỆN CHƯA NẾU GỌI -5!
        //CÚ PHÁP BIỂU THỨC LAMDA
    }

}