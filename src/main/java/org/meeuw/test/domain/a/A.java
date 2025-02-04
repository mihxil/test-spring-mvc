package org.meeuw.test.domain.a;

import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.meeuw.test.domain.b.B;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class A {

    @XmlAnyElement
    List<Object> message = new ArrayList<>(List.of(new B("foo"), new B("bar")));
}
