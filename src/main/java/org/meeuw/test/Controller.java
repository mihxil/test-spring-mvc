package org.meeuw.test;

import org.meeuw.test.domain.a.A;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller

@RequestMapping("/")
public class Controller {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public A get() {
        return new A();
    }
}
