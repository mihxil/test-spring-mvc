package org.meeuw.test;

import org.meeuw.test.domain.a.A;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller

@RequestMapping("/")
public class Controller {

    @RequestMapping(method = RequestMethod.GET, produces = "application/xml")
    @ResponseBody
    public A get() {
        return new A();
    }
}
