package org.max;

public class Element implements IElement {

    private int count;

    public Element(int count){
        this.count = count;
    }

    @Override
    public int getCount() {
        return count;
    }
}
