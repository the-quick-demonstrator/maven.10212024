package com.github.curriculeon;

public enum Lenum {
    INSTANCE;
    private Long id;
    private String name;

    Lenum() {
        this(10L, "Leon");
    }

    Lenum(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
