package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int num1, int num2) {
        int y = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x>=num1 && x<=num2) {
                y++;
            }
        }
        return y;
    }
}
