package com.example.springstart.response;

public class Error {
    private final Integer id;
    private final Integer index;
    public Error(Integer id, Integer index){
        this.id = id;
        this.index = index;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIndex() {
        return index;
    }
}
