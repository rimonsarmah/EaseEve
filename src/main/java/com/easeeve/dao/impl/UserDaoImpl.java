package com.easeeve.dao.impl;

import com.easeeve.dao.UserDao;
import com.easeeve.model.User;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
@Service
public class UserDaoImpl implements UserDao {
    final Logger logger = Logger.getLogger(UserDaoImpl.class);
    @Autowired
    HibernateTemplate hibernateTemplate;
    @Override
    @Transactional
    public int addUser(User user) {
        int id = -1;
        try{
            id = (int) this.hibernateTemplate.save(user);
        }
        catch (Exception exception){
            logger.error("Exception while adding user. Message: " + exception.getMessage());
        }
        return id;
    }

    @Override
    public User getUserByUserName(String userName){
        User user = null;
        Session session = hibernateTemplate.getSessionFactory().openSession();
        TypedQuery<User> query = session.createQuery("FROM User u where u.userName=:userName");
        query.setParameter("userName", userName);
        try {
            user = (User) query.getSingleResult();
        }
        catch (Exception exception){
            logger.error("Some exception occured while getting user by username : Message : " + exception.getMessage());
        }
        return user;
    }
}
