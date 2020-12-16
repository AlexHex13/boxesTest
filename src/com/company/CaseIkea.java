package com.company;

import com.company.parent.Box;
import com.company.parent.impl.NotWheeled;

public class CaseIkea extends Box implements NotWheeled {

    private String thing;

    public CaseIkea(String thing) {
        this.thing = thing;
    }

    @Override
    public void open() {
        System.out.println("Сумка ИКЕА открыта");
    }

    @Override
    public void close() {
        System.out.println("Сумка ИКЕА закрыта");
    }

    @Override
    public void lookInside() {
        super.keepInside(thing);
    }

    @Override
    public void carry() {
        System.out.println("Возьму в магазин");
    }
}
