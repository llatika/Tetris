package com.tetris;

public class Main {

    public static void main(String[] args) {
        Board board = new Board(5,5);
        board.set(1,2,new Block(BlockType.POINT));
        ConsoleTetrisDrawer con = new ConsoleTetrisDrawer();
        con.draw(board);
    }
}
