package net.drifthyena.fluiditality.utility;

public class ChunkWaterData {
    public short[][][] highestNeigbhor = new short[16][16][384]; //x z y
    private boolean isDirty = true;
}
