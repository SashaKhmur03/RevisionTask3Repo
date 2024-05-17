package by.itstep.sasha.revisiontask03.controller;


import by.itstep.sasha.revisiontask03.model.*;

import java.util.Scanner;

import static by.itstep.sasha.revisiontask03.model.Task01.isTheChessSquareBlack;
import static by.itstep.sasha.revisiontask03.model.Task02.isPawnGetToTheSecondCell;
import static by.itstep.sasha.revisiontask03.model.Task03.isRookGetToTheSecondCell;
import static by.itstep.sasha.revisiontask03.model.Task04.isKingGetToTheSecondCell;
import static by.itstep.sasha.revisiontask03.model.Task06.isBecomeAnyFigure;
import static by.itstep.sasha.revisiontask03.model.Task07.isQueenGetToTheSecondCell;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input coordinates: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        String msg = "can get from the first square to the second in one move ";

        System.out.println("Is square is black: " + isTheChessSquareBlack(x1, y1));
        System.out.println("Pawn " + msg + isPawnGetToTheSecondCell(x1, y1, x2, y2));
        System.out.println("Rook " + msg + isRookGetToTheSecondCell(x1, y1, x2, y2));
        System.out.println("King " + msg + isKingGetToTheSecondCell(x1, y1, x2, y2));
        System.out.println("Bishop " + msg + Task05.isBishopGetToTheSecondCell(x1, y1, x2, y2));
        System.out.println("Pawn " + msg + "become any figure after that " + isBecomeAnyFigure(x1, y1, x2, y2));
        System.out.println("Queen " + msg + isQueenGetToTheSecondCell(x1, y1, x2, y2));
        System.out.println("Knight " + msg + TaskX.isKnightGetToTheSecondCell(x1, y1, x2, y2));

    }
}
