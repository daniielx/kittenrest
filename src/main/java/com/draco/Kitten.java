package com.draco;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Kitten {
    private String type;
    private int cuteness;

    public String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    public int getCuteness() {
        return cuteness;
    }

    void setCuteness(int cuteness) {
        this.cuteness = cuteness;
    }

    @Override
    public String toString() {
        return "Kitten{" +
                "type='" + type + '\'' +
                ", cuteness=" + cuteness +
                '}';
    }
}
