package com.pluralsight.classes;

import com.pluralsight.interfaces.ICleaner;
import com.pluralsight.interfaces.IDrawable;

public class EtchASketch implements ICleaner, IDrawable {
    private String drawing;

    public EtchASketch() {
        this.drawing = " ";
    }

    public String getDrawing() {
        return drawing;
    }

    @Override
    public void clean() {
        this.drawing = " ";
        System.out.println("Etechasketch has been cleared");
    }

    @Override
    public void draw() {
        this.drawing += "Drawing...";
        System.out.println("Drawing on the EtchASketch");
    }

    //have to override because it implements 2 interfaces that have their own print methods
    @Override
    public void print(){
      //  System.out.println("Potato Picasso");
        IDrawable.super.print();
        ICleaner.super.print();
        //calling the print method within one of the interfaces
    }

}
