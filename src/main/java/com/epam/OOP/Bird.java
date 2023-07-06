package com.epam.OOP;

public class Bird extends Animal {


    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, 2, true);
    }

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        String parentDescription = super.getDescription();
        return parentDescription + " Moreover, it has 2 wings and can fly.";
    }
}
