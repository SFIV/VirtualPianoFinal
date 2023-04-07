package com.example.virtualpiano;

import javafx.scene.input.KeyCode;

public class Note {
    private int number;
    private String name;
    private KeyCode key;

    Note(String name, KeyCode key, int number) {
        this.name = name;
        this.key = key;
        this.number = number;
    }
}
