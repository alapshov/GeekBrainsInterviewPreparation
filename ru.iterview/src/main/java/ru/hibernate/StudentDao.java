package ru.hibernate;

import org.hibernate.Session;

public class StudentDao {
    private final Session SESSION = MySessionFactory.getSessionFactory().getCurrentSession();

    public void saveOrUpdate(Student student) {
        SESSION.save(student);
    }

    public void getById(Long id) {
        SESSION.get(Student.class, id);
    }

    public void getAll(Student student) {
        SESSION.get(Student.class, student);
    }

    public void delete(Student student) {
        SESSION.delete(student);
    }

}
