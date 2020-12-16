package com.company;

import com.company.parent.Box;
import com.company.parent.impl.NotWheeled;

public class SuitCase extends Box implements NotWheeled {

    private String thing;

    public SuitCase(String thing) {
        this.thing = thing;
    }

    @Override
    public void open() {
        System.out.println("Чемодан открыт");
    }

    @Override
    public void close() {
        System.out.println(" Чемодан закрыт");
    }

    @Override
    public void lookInside() {
        super.keepInside(thing);
    }


    @Override
    public void carry() {
        System.out.println("Поеду в отпуск!");
    }
}
