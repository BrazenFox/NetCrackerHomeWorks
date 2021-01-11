package com.mycompany.horstmann.InterfacesAndLambdaExpressions;

class Greeter implements Runnable {
    private String target;
    private int times;

    Greeter(String target, int times) {
        this.target = target;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.times; i++) {
            System.out.println(this.target);
        }
    }
}