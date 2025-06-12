package com.overcode.tool.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //TÁCH DATA RA KHỎI HÀM TEST
    //DỰNG 1 MẢNG 2 CHIỀU, INPUT, EXPECTED
    //SAU ĐÓ NHỒI VÀO, FILL VÀO CÂU LỆNH SO SÁNH!!!
    //MẢNG NÀY SẼ LÀ NGUỒN DỮ LIỆU ĐỂ HÀM SO SÁNH GỌI, NHIỀU LẦN NHƯ THẾ, DO NHIỀU DATA -> NGUỒN NÀY
    //LÀ STATIC NÀY LÀ STATIC ĐỂ TÌM KIẾM NHANH CHỐNG
    public static Object[][] initTestData() {//PHẢI PUBLIC VÌ MÚN NGƯỜI KHÁC LẤY DATA ĐỂ TEST
        return new Object[][] { {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                                {6, 7200}


        };

    }

    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }


}