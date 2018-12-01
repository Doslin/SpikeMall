package com.doude.dao.test;

import com.doude.enity.test.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao {
	Person querypersonbyid(int id);
	void inserperson(Person person);
}
