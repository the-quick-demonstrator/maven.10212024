package com.github.curriculeon;

public class Leon extends Person {
    public static final Leon INSTANCE = new Leon();

    private Leon() {
        super(0L, "LEON");
    }
}
