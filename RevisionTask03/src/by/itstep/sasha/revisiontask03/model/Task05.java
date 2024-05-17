package by.itstep.sasha.revisiontask03.model;

public class Task05 {
    public static boolean isBishopGetToTheSecondCell(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) == Math.abs(y1 - y2);
    }
}
