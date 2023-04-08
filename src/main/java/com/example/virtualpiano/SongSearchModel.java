package com.example.virtualpiano;

import javax.print.attribute.standard.MediaSize;

public class SongSearchModel {
    public  String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }


    public SongSearchModel(String NAME) {
        this.NAME = NAME;
    }

    public String NAME;
}
