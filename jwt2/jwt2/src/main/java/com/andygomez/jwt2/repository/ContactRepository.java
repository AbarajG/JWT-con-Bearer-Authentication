package com.andygomez.jwt2.repository;

import com.andygomez.jwt2.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
