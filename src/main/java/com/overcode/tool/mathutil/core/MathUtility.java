package com.overcode.tool.mathutil.core;

public class MathUtility {
    //CLASS NÀY CHỨA CÁC HÀM STATIC, LÀ NHỮNG HÀM TIỆN ÍCH DÙNG CHUNG CHO MỌI NƠI


    // ĐÂY LÀ HÀM MÔ PHỎNG THƯ VIỆN TOÁN HỌC MATH. CỦA JDK
    //HÀM NÀY TÍNH N!
    //N! = 1.2.3...N
    //KO CÓ GIAI THỪA SỐ ÂM
    //0! = 1
    //20! VỪA ĐỦ KIỂU LONG, TỨC LÀ 21! VƯỢT KIỂU LONG

    public static long getFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return getFactorial(n - 1) * n;

        //ĐỆ QUY - RECURSION - GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
        //ĐEM LÊN SERVER MÀ RA MÀU XANH:
         //1. CODE TỐI ƯU HƠN VÌ PASS TEST CASE
         //2. TEST LẠI THỨ TỪNG TEST RẤT MẤT CÔNG, NAY CÓ SCRIPT TEST TỰ ĐỘNG, KHỎE RE
         //REGRESSION TESTING
    }




//    public static long getFactorial(int n) {
//        //ĐEM CODE CHÍNH RA SỬA GỌI LÀ REFACTOR/REFACTORING
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0 and 20");
//        //BẠN ĐƯA INVALID DATA, TỚ NÉM RA NGOẠI LỆ, HÀM KO ĐC CHẠY THÀNH CÔNG, KO VALUE TRẢ VỀ
//
//        if (n == 0)
//            return 1;
//
//
//        //SỐNG SÓT ĐẾN ĐÂY N = 1...19
//        //FOR MÀ TÍNH
//        long result = 1; //THUẬT TOÁN DỒN CON HEO ĐẤT
//        for (int i = 1; i <= n; i++)
//            result *= i; //NHÂN DỒN VÀO TỪNG CHÁU i
//
//
//        return result;
//    }

}
