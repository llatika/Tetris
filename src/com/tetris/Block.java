package com.tetris;

import java.awt.*;

public class Block {

   private BlockType blockType;
   private Color color;

    public Block(BlockType type)
    {
        blockType = type;
    }

    public BlockType getBlockType() {
        return blockType;
    }
}
