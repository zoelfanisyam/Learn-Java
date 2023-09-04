package oop.enumCls;

public enum Level {
    STANDART("Standar Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level(String description) {
        this.description = description;
    }

    String getDescription() {
        return description;
    }
}
