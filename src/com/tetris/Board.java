package com.tetris;

public class Board {

    Block block;
    Block[][] boardTable;

    public Board(int width, int height) {
        boardTable = new Block[width][height];

      for(int i=0; i<width;i++)
      {
          for(int j=0; j<height; j++)
          {
              set(i,j, new Block(BlockType.EMPTY));
          }
      }
    }

    public int getSizeX() {
        return boardTable.length;
    }
    public int getSizeY() {
        return boardTable[0].length;
    }

    public void changeSize(int width, int height) {
        boardTable = new Block[width][height];
    }

    public Block get(int xCell, int yCell) {
        return boardTable[xCell][yCell];
    }

    public void set(int x, int y, Block block) {
        boardTable[x][y] = block;
    }
}
