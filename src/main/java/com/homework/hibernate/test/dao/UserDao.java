package com.homework.hibernate.test.dao;

import com.homework.hibernate.test.model.Auto;
import com.homework.hibernate.test.model.User;

import com.homework.hibernate.test.utils.HibernateSessionFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {

    public User findById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(User user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public Auto findAutoById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(Auto.class, id);
    }

    public List<User> findAll() {
        List<User> users = (List<User>)  HibernateSessionFactory.getSessionFactory().openSession().createQuery("From User").list();
        return users;
    }
}
