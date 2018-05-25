package com.example.contacts;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static com.example.contacts.ContactsDbApplication.contacts;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/createContact", method = RequestMethod.POST)
    @ResponseBody
    String createContact(@RequestParam("name") String name,
                         @RequestParam("phone") String phone,
                         @RequestParam("birthday") String birthday) {
        Contact contact = new Contact(name, phone, birthday);
        contacts.add(contact);
        return "1";
    }

    @RequestMapping(value = "/updateContact", method = RequestMethod.POST)
    @ResponseBody
    String updateContact(@RequestParam("id") long id,
                         @RequestParam("name") String name,
                         @RequestParam("phone") String phone,
                         @RequestParam("birthday") String birthday) {
        Contact contact = new Contact(id, name, phone, birthday);
        contacts.get((int) contact.getId()).setName(name);
        contacts.get((int) contact.getId()).setPhone(phone);
        contacts.get((int) contact.getId()).setBirthday(birthday);
        return "1";
    }

    @RequestMapping(value = "/deleteContact", method = RequestMethod.POST)
    @ResponseBody
    String deleteContact(@RequestParam("id") long id) {
        contacts.remove((int)id);
        return "1";
    }

    @RequestMapping(value = "/getContacts", method = RequestMethod.GET)
    @ResponseBody
    String getContacts() {
        return new Gson().toJson(contacts, ArrayList.class);
    }
}
