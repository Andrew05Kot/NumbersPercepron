package com.company;

public class NumbersToMatrixConverter {
    public static int[][] convertNumberToMatrix(int i) {
        switch (i) {
            case (1):
                return new int[][] {
                        {0, 0, 0, 1},
                        {0, 0, 0, 1},
                        {0, 0, 0, 1},
                        {0, 0, 0, 1},
                        {0, 0, 0, 1}
                };
            case (2):
                return new int[][] {
                        {1, 1, 1, 1},
                        {0, 0, 0, 1},
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 1, 1, 1}
                };
            case (3):
                return new int[][] {
                        {1, 1, 1, 1},
                        {0, 0, 0, 1},
                        {1, 1, 1, 1},
                        {0, 0, 0, 1},
                        {1, 1, 1, 1}
                };
            case (4):
                return new int[][] {
                        {1, 0, 0, 1},
                        {1, 0, 0, 1},
                        {1, 1, 1, 1},
                        {0, 0, 0, 1},
                        {0, 0, 0, 1}
                };
            case (5):
                return new int[][] {
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {0, 0, 0, 1},
                        {1, 1, 1, 1}
                };
            case (6):
                return new int[][] {
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {1, 0, 0, 1},
                        {1, 1, 1, 1}
                };
            case (7):
                return new int[][] {
                        {1, 1, 1, 0},
                        {0, 0, 1, 0},
                        {1, 1, 1, 1},
                        {0, 0, 1, 0},
                        {0, 0, 1, 0}
                };
            case (8):
                return new int[][] {
                        {1, 1, 1, 1},
                        {1, 0, 0, 1},
                        {1, 1, 1, 1},
                        {1, 0, 0, 1},
                        {1, 1, 1, 1}
                };
            case (9):
                return new int[][] {
                        {1, 1, 1, 1},
                        {1, 0, 0, 1},
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 1, 1, 1}
                };
            default: return new int[][] {};
        }
    }
}
