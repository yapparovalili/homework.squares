package ru.netology.sqr.homework.square;

public class SQRService {

    public int calcSQRt(int min, int max) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            int iSqr = i * i;
            if ((i * i >= min) && (i * i <= max)) {
                count++;
            }
        }
        return count;
    }
}