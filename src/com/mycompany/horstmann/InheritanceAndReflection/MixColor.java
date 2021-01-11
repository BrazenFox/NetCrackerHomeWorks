package com.mycompany.horstmann.InheritanceAndReflection;

public class MixColor {

    Color color;
    private boolean checkRed = false;
    private boolean checkGreen = false;
    private boolean checkBlue = false;

    public MixColor() {
        this.color = Color.BLACK;
    }

    public void getRed() {
        this.color = Color.RED;
        checkRed = true;
    }

    public void getGreen() {
        this.color = Color.GREEN;
        checkGreen = true;
    }

    public void getBlue() {
        this.color = Color.BLUE;
        checkBlue = true;
    }

    public void chooseColor() {

        if (checkRed) {
            this.color = Color.RED;
        }
        if (checkBlue) {
            this.color = Color.BLUE;
        }
        if (checkGreen) {
            this.color = Color.GREEN;
        }
        if (checkBlue && checkGreen) {
            this.color = Color.CYAN;
        }
        if (checkBlue && checkRed) {
            this.color = Color.MAGENTA;
        }
        if (checkGreen && checkRed) {
            this.color = Color.YELLOW;
        }
        if (checkRed && checkGreen && checkBlue) {
            this.color = Color.WHITE;
        }
    }

}
