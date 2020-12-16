package com.company.parent;

import com.company.parent.impl.Carryable;

public abstract class Box implements Carryable {


protected void keepInside(String thing){
    System.out.printf("Внутри моя %s",thing);
}

public abstract void open();
public abstract void close();
public abstract void lookInside();


}
