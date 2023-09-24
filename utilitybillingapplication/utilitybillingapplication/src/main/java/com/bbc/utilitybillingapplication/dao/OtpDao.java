package com.bbc.utilitybillingapplication.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bbc.utilitybillingapplication.model.Otp;

@Repository
public class OtpDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Otp getOtp(int id) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Otp.class);
		criteria.add(Restrictions.eqOrIsNull("id", id));
		return (Otp) criteria.list().get(0);
	}

	public void saveOtp(Otp otpObj) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Otp.class);
		session.save(otpObj);
		session.beginTransaction().commit();
	}
	

}
