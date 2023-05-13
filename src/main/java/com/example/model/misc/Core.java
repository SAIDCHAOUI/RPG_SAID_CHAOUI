package com.example.model.misc;

import lombok.Getter;

@Getter
public enum Core {
    PHOENIX_FEATHER("Phoenix Feather"),
    DRAGON_HEARTSTRING("Dragon Heartstring"),
    KNEAZLE_WHISKER("Kneazle Whisker");

    private final String name;

    Core(String name) {
        this.name = name;
    }
}
