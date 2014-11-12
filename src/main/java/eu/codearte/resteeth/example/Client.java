package eu.codearte.resteeth.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

interface Client {

    @RequestMapping(value = "/echo/{message}", method = RequestMethod.GET)
    String echo(@PathVariable("message") String message);
}