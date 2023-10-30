package com.keyin.utility;

public class IdGenerator {
    private long nextId = 0;

    public long getNextId() {
        long thisId = nextId;
        nextId++;
        return thisId;
    }
}
