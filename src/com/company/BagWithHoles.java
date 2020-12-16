package com.company;

import com.company.parent.Box;
import com.company.parent.impl.NotWheeled;

public class BagWithHoles extends Box implements NotWheeled {

    private String thing;

    public BagWithHoles(String thing) {
        this.thing = thing;
    }

    @Override
    public void open() {
        System.out.println("Авоська открыта");
    }

    @Override
    public void close() {
        System.out.println("Авоська закрыта");
    }

    @Override
    public void lookInside(){
        super.keepInside(thing);
    }

    @Override
    public void carry() {
        System.out.println("Поеду на базар на!");
    }
}
