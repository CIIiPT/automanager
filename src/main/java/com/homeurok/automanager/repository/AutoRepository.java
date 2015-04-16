package com.homeurok.automanager.repository;

import com.homeurok.automanager.domain.Auto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class AutoRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void addAuto(Auto auto){
      this.sessionFactory.getCurrentSession().save(auto);
    }

    public List listAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from Auto").list();
    }
    public void removeAuto(Integer Id){
        Auto contact = (Auto)this.sessionFactory.getCurrentSession().load(Auto.class, Id);
        if (contact != null){
            this.sessionFactory.getCurrentSession().delete(contact);
        }

    }
    public void updateAuto(Auto auto){

        this.sessionFactory.getCurrentSession().update(auto);
    }
    public Auto getAutoById(Integer id1)
     {return (Auto)this.sessionFactory.getCurrentSession().get(Auto.class, id1); }


}
