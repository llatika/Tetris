package com.tetris;

public class ConsoleTetrisDrawer {

    public void draw(Board board) {
        for (int i = 0; i < board.getSizeX(); i++) {
            for (int j = 0; j < board.getSizeY(); j++) {
int rows = board.boardTable.length;
int column = board.boardTable[0].length;
Block a= board.get(i,j);
BlockType b = a.getBlockType();
                if (board.get(i, j).getBlockType() == BlockType.EMPTY) {
                    System.out.print("*");
                } else {
                    System.out.print("w");
                }
            }
            System.out.println();
        }
    }
}
