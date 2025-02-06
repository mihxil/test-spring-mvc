package org.meeuw.test.domain.a;

import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.*;
import org.meeuw.test.domain.b.B;

@XmlRootElement
public class A {
    public static UUID id = UUID.randomUUID();

    @XmlAnyElement
    List<Object> message = new ArrayList<>(List.of(
        new B(id + "-foo"),
        new B(id + "-bar")
    ));
}
