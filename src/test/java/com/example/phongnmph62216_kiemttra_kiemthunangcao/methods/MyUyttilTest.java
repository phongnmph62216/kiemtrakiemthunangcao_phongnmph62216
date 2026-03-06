package com.example.phongnmph62216_kiemttra_kiemthunangcao.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUyttilTest {


    @Test
    void testSumDivisibleBy3() {

        int result1 = MyUyttil.sumDivisibleBy3(10);
        assertEquals(18, result1); // 3 + 6 + 9 = 18


        int result2 = MyUyttil.sumDivisibleBy3(15);
        assertEquals(45, result2); // 3 + 6 + 9 + 12 + 15 = 45


        int result3 = MyUyttil.sumDivisibleBy3(0);
        assertEquals(0, result3); // No numbers to sum

        int result4 = MyUyttil.sumDivisibleBy3(-5);
        assertEquals(0, result4); // No numbers to sum
    }



}