package ch.bbw.vp.itemlist.service;

import ch.bbw.vp.itemlist.model.Person;
import ch.bbw.vp.itemlist.persistence.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @class: PersonService
 * @author: anesh
 * @version: 02.06.2021
 **/

@Service
public class PersonService {

    private final ProjectRepository projectRepository;

    @Autowired
    public PersonService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public ArrayList<Person> getPersons() {
        return projectRepository.getPersonList();
    }

    public void createPerson(Person person) {
        projectRepository.addPerson(person);
    }

    public void deletePerson(long id) {
        projectRepository.deletePersonById(id);
    }
}
