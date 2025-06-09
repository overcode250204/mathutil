package com.overcode.tool;

import com.overcode.tool.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0RunsWell();
        testFactorialGivenRightArgument1RunsWell();
        testFactorialGivenRightArgumentRunsWell();
    }
    //TEST THỬ HÀM VỪA GÕ
    //CẦN CÓ TEST CASE
    //TEST CASE #1: CHECK/VERIFY THE GETFACTORIAL() METHOD WITH N = 0
    //STEPS: GIVEN N = 0
    //      CALL GETFACTORIAL(N = 0)
    //EXPECTED RESULT : HOPE TO SEE 1 AS THE RESULT OF 0!
    //STATUS: ĐOÁN XEM, CHỜ CHẠY XEM SAO
    public static void testFactorialGivenRightArgument0RunsWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);//THỰC TẾ LÀ MẤY ĐOÁN XEM
        System.out.println("0! Expected: " + expected + ", Actual: " + actual);

    }

    //TEST CASE #2: CHECK/VERIFY THE GETFACTORIAL() METHOD WITH N = 1
    //STEPS: GIVEN N = 1
    //      CALL GETFACTORIAL(N = 1)
    //EXPECTED RESULT : HOPE TO SEE 1 AS THE RESULT OF 0!
    //STATUS: ĐOÁN XEM, CHỜ CHẠY XEM SAO
    public static void testFactorialGivenRightArgument1RunsWell() {
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);//THỰC TẾ LÀ MẤY ĐOÁN XEM
        System.out.println("1! Expected: " + expected + ", Actual: " + actual);

    }

    //TEST CASE #3: CHECK/VERIFY THE GETFACTORIAL() METHOD WITH N = 1
    //STEPS: GIVEN N = 1
    //      CALL GETFACTORIAL(N = 1)
    //EXPECTED RESULT : HOPE TO SEE 1 AS THE RESULT OF 0!
    //STATUS: ĐOÁN XEM, CHỜ CHẠY XEM SAO
    public static void testFactorialGivenRightArgumentRunsWell() {
        System.out.println("2! Expected: 2" + ", Actual: " + MathUtility.getFactorial(2));
        System.out.println("3! Expected: 6" + ", Actual: " + MathUtility.getFactorial(3));
        System.out.println("4! Expected: 24" + ", Actual: " + MathUtility.getFactorial(4));
        System.out.println("5! Expected: 120" + ", Actual: " + MathUtility.getFactorial(5));
    }


    //TDD: TEST DRIVEN-DEVELOPMENT GHI TRONG CV

    //VIẾT CODE CHÍNH VÀ VIẾT TEST CASE/TEST RUN SONG SONG VỚI NHAU
    //CỨ VIẾT ĐC CODE NÀO THÌ CÓ NGAY TEST CASE CHO NÓ
    //TEST CASE DÙNG ĐỂ TEST CÁC HÀM (KO NHẦM VỚI TEST APP - TEST MÀN HÌNH UI VÀ NHẬP LIỆU...), CHỈ DÀNH CHO CHÍNH DÂN DEV (DÂN QA/QC KO DÍNH VÀO CODE CỦA PROJECT)
    //NHỜ TDD, TDD ĐÓNG GÓP 1 PHẦN GIÚP TA TỰ ĐỘNG HÓA QUÁ TRÌNH BUILD, CHECK BUG, ĐÓNG GÓI NẾU CODE ỔN VÀ DEPLOY LÊN STAGING SERVER (SERVER ĐỂ TEST APP)
    //CODE --- CHECK VAR CODE (UNIT TEST, TDD)
    //OKIE THÌ ĐÓNG GÓI APP
    //ĐƯA APP LÊN SERVER
    //QUY TRÌNH NÀY LÀ CI/CD

    //CV CÓ 1 MỤC:
    //Technical Skills -------------
    //JUnit
    //TDD
    //CI/CD
    //Maven

}