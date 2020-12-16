package com.company;

import com.company.parent.Box;
import com.company.parent.impl.Wheeled;

public class GrandmaSuitCase extends Box implements Wheeled {
   private String thing;

    public GrandmaSuitCase(String thing) {
        this.thing = thing;
    }

    @Override
    public void open() {
        System.out.println("Сумка бабушки открыта");
    }

    @Override
    public void close() {
        System.out.println("Сумка бабушки закрыта");
    }

    @Override
    public void lookInside() {
        super.keepInside(thing);
    }

    @Override
    public void carry() {
        System.out.println("Поеду за пенсией");
    }
}
