package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

//    @Autowired
//    EntityManager entityManager;

//    @Transactional
//    public List<Whisky> findWhiskyOfACertainAgeFromDistillery(int age){
//        List<Whisky> result = null;
//
//        Session session = entityManager.unwrap(Session.class);
//        Criteria cr = session.createCriteria(Distillery.class);
//        cr.createAlias("whisky", "whiskyAlias");
//        cr.add(Restrictions.eq("whiskyAlias.age", age));
//        result = cr.list();
//        return result;
//    }
}
