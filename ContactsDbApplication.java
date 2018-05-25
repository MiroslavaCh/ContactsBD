package com.example.contacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ContactsDbApplication {

    static ArrayList<Contact> contacts;

    public static void main(String[] args) {
        SpringApplication.run(ContactsDbApplication.class, args);
        contacts = new ArrayList<>();
    }
}
