package com.vimandi;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

//f6 b
@XmlRootElement
public class Employee {
    private int id;
    private String name;

    @XmlElement
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
//System.out.println("t1");


//System.out.println("test");




//f6 a


//merge1

//merge2


//REL3 A


//REL3 B



//p1 a

//p1 b
