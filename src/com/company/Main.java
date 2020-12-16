package com.company;

import com.company.parent.Box;

public class Main {

    public static void main(String[] args) {
        Box box = new GrandmaSuitCase("бабушкины вещи");
        box.open();
        box.lookInside();
        box.close();
        box.carry();

    }
}
