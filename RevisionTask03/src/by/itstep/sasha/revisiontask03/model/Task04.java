package by.itstep.sasha.revisiontask03.model;

public class Task04 {
    public static boolean isKingGetToTheSecondCell(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1;
    }
}
