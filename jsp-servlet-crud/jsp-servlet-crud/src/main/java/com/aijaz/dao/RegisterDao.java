package com.aijaz.dao;

import java.util.List;

import com.aijaz.pojo.Person;

public interface RegisterDao {
public void savePerson(Person person);
public void updatePerson(Person person);
public List<Person> getAllPerson();
public void deleteOneValue(int personId);

}
