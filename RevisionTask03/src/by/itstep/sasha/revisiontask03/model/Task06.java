package by.itstep.sasha.revisiontask03.model;

public class Task06 {
    public static boolean isBecomeAnyFigure(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            return y2 == y1 + 1 && y2 >= 2 && y2 <= 8;
        }
        return false;
    }
}
