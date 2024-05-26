package org.max;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ContainerTest {

    @Test
    public void GetCountContainer(){
        //given
        Container container = new org.max.Container();
        container.addElement(new Element(1));
        container.addElement(new Element(2));
        container.addElement(new Element(3));
        //when
        int result = container.getCount();
        //then
        Assertions.assertEquals(6, result);
    }

    @Test
    public void GetCountAllContainers(){
        //given
        Container container1 = new org.max.Container();
        Container container2 = new org.max.Container();
        Container container3 = new org.max.Container();

        container1.addElement(new Element(1));
        container1.addElement(new Element(2));  //3

        container2.addElement(new Element(4));
        container2.addElement(container1);              //7

        container3.addElement(container1);
        container3.addElement(container2);              //10

        //when
        int result = container3.getCount();
        //then
        Assertions.assertEquals(10, result);
    }

    @Test
    public void GetCountContainerRemoveElement(){
        //given
        Container container1 = new org.max.Container();
        Container container2 = new org.max.Container();
        Container container3 = new Container();

        container1.addElement(new Element(10));
        container1.addElement(new Element(10));     //20

        container2.addElement(new Element(100));
        container2.addElement(container1);
        container2.addElement(new Element(30));     //150

        container3.addElement(container1);
        container3.addElement(container2);                 //170

        container2.removeElement(0);                 //70


        //when
        int result = container3.getCount();
        //then
        Assertions.assertEquals(70, result);
    }
}
