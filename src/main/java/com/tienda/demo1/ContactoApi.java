package com.tienda.demo1;

import dto.Contacto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactoApi {
    @RequestMapping(value = "/contacto", method = RequestMethod.GET)
    public Contacto getContacto(){
        return new Contacto(1l, "Robin", "Garcia", "3002087655", "roger@gmail.com");
    }
}
