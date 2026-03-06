package com.example.phongnmph62216_kiemttra_kiemthunangcao.methods;

public class MyUyttil {

//// Viết unit test để kiểm thử hàm thực hiện chức năng tính tổng
//các số chia hết cho 3 từ 1 đến n (n là số nguyên bất kỳ)
    public static int sumDivisibleBy3(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
