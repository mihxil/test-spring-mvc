package org.meeuw.test.domain.b;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class B {

    @XmlElement
    private String message;

    public B() {

    }

    public B(String m) {
        this.message = m;
    }
}
