package org.max;

import java.util.ArrayList;
import java.util.List;

public class Container implements IElement {

    public List<IElement> elements = new ArrayList<>();

    public void addElement(IElement element){
        elements.add(element);
    }

    public void removeElement(int index){
        elements.remove(index);
    }

    public List<IElement> getElements(){
        return elements;
    }


    @Override
    public int getCount() {
        return elements.stream()
                .map(IElement::getCount)
                .mapToInt(Integer::intValue).sum();
    }
}
