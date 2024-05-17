package by.itstep.sasha.revisiontask03.model;

public class Task07 {
    public static boolean isQueenGetToTheSecondCell(int x1, int y1, int x2, int y2) {
        return x1 == x2 || y1 == y2 || Math.abs(x2 - x1) == Math.abs(y2 - y1);
    }
}
