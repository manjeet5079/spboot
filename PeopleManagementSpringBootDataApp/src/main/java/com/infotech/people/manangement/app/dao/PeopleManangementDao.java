package com.infotech.people.manangement.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.infotech.people.manangement.app.entities.Person;

public interface PeopleManangementDao extends CrudRepository<Person, Integer>{

}
