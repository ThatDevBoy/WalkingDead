package com.DevBoy.Inf;

public class Schematics {
	
		 
	    private byte[] blocks;
	    private byte[] data;
	    private short width;
	    private short length;
	    private short height;
	 
	    public Schematics(byte[] blocks, byte[] data, short width, short length, short height)
	    {
	        this.blocks = blocks;
	        this.data = data;
	        this.width = width;
	        this.length = length;
	        this.height = height;
	    }
	 
	    public byte[] getBlocks()
	    {
	        return blocks;
	    }
	 
	    public byte[] getData()
	    {
	        return data;
	    }
	 
	   
	    public short getWidth()
	    {
	        return width;
	    }
	 
	    public short getLenght()
	    {
	        return length;
	    }
	 
	    public short getHeight()
	    {
	        return height;
	    }
	}
