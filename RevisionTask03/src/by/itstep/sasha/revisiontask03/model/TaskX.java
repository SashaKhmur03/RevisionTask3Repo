package by.itstep.sasha.revisiontask03.model;

public class TaskX {
    public static boolean isKnightGetToTheSecondCell(int x1, int y1, int x2, int y2) {
        int xDiff = Math.abs(x2 - x1);
        int yDiff = Math.abs(y2 - y1);

        return (xDiff == 1 && yDiff == 2) || (xDiff == 2 && yDiff == 1);
    }
}
