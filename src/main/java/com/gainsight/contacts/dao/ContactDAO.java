package com.gainsight.contacts.dao;

import java.util.List;

import com.gainsight.contacts.model.Contact;


public interface ContactDAO {

    public void saveOrUpdate(Contact contact);

    public void delete(int contactId);

    public Contact get(int contactId);

    public List<Contact> list();
}
