package org.meeuw.test.servlet;

import org.meeuw.test.app.MyBean;
import org.meeuw.test.domain.a.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller

@RequestMapping("/")
public class Controller {

    @Autowired
    public MyBean myBean;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public A get() {
        return new A();
    }
}
