package com.company;

import com.company.parent.Box;
import com.company.parent.impl.Wheeled;

public class SuitCaseWithWheels extends Box implements Wheeled {

    private String thing;

    public SuitCaseWithWheels(String thing) {
        this.thing = thing;
    }

    @Override
    public void open() {
        System.out.println("Чемодан с колесами открыт");
    }

    @Override
    public void close() {
        System.out.println("Чемодан с колесами закрыт");
    }

    @Override
    public void lookInside() {
        super.keepInside(thing);
    }

    @Override
    public void carry() {
        System.out.println("Поеду в отпуск на Мальдивы");
    }
}
