package com.company;

import java.util.Random;
import java.util.Scanner;

public class Perceptron {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    
    public static double[][] WEIGHTS = new double[5][4];
    public static final double THETA = random.nextDouble();
    public static int epoch = 0;

    public static void main(String[] args) {

        System.out.println("θ = " + THETA + "\n");

        learn();

        checkInputNumbers();
    }

    public static void learn() {
        generateWeights();

        while (true) {
            int counter = 0;

            for (int i = 1; i <= 9; i++) {
                System.out.println("Епоха: " + (++epoch));

                System.out.println("Перевірка числа " + i);
                int [][] x = NumbersToMatrixConverter.convertNumberToMatrix(i);
                double sum = getSum(x);
                System.out.println("Сума = " + sum);

                boolean y = isRight(sum);
                System.out.println("Відповідь: " + y + "\n");

                if ((i % 2 == 0 && !y) || (i % 2 != 0 && y)) {
                    changeWeights(x, y);
                } else {
                    counter++;
                }
            }
            if (counter == 9) {
                break;
            }
        }

        System.out.println("Навчання завершилось \n");
    }

    private static void checkInputNumbers() {
        while (true) {
            System.out.println("Введіть цифру: ");
            int inputNumber = scanner.nextInt();
            boolean y = isRight(getSum(NumbersToMatrixConverter.convertNumberToMatrix(inputNumber)));
            System.out.println(y ? "Число парне \n" : "Число непарне \n");
        }
    }

    private static void generateWeights() {
        System.out.println("Синаптичні ваги:");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 4; j++) {
                WEIGHTS[i][j] = random.nextDouble() * 5;
                System.out.print(WEIGHTS[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void changeWeights(int [][]x, boolean y) {
        System.out.println("Нові синаптичні ваги: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (y) {
                    WEIGHTS[i][j] -= x[i][j];
                } else {
                    WEIGHTS[i][j] += x[i][j];
                }
                System.out.print(WEIGHTS[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static double getSum(int[][] x) {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                sum += x[i][j] * WEIGHTS[i][j];
            }
        }
        return sum;
    }

    public static boolean isRight(double sum) {
        return sum >= THETA;
    }

}
