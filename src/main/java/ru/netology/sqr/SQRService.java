package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int num1, int num2) {
        int numberSquares = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= num1 && i * i <= num2) {
                numberSquares++;
            }
        }
        return numberSquares;
    }
}
