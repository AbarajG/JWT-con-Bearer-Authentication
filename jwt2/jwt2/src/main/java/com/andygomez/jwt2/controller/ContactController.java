package com.andygomez.jwt2.controller;

import com.andygomez.jwt2.entity.Contact;
import com.andygomez.jwt2.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contacts")
@AllArgsConstructor
public class ContactController {

    private final ContactRepository repository;

    @GetMapping
    public List<Contact> listContacts(){ return repository.findAll(); }

}
