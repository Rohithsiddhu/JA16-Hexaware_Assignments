package com.hexaware.Mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.Mappings.Entity3.MedicalTest;
import com.hexaware.Mappings.Entity3.Prescription;
public class ManyToMany {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Prescription p1=new Prescription();
		p1.setPrescriptionid(201);
		p1.setMedicinename("Adol Syrup");
		p1.setPrice(50000);

		Prescription p2=new Prescription();
		p2.setPrescriptionid(202);
		p2.setMedicinename("Paracetamol");
		p2.setPrice(70000);

		Prescription p3=new Prescription();
		p3.setPrescriptionid(203);
		p3.setMedicinename("Aspirin");
		p3.setPrice(90000);

		
		  MedicalTest mt1 = new MedicalTest();
		  mt1.setTestid(111);
		  mt1.setTestname("Blood Test");
		  mt1.addPrescription(p1);
		  mt1.addPrescription(p2);
		  mt1.addPrescription(p3);
		  MedicalTest mt2 = new MedicalTest();
		  mt2.setTestid(112);
		  mt2.setTestname("X ray");
		  mt2.addPrescription(p1);
		  mt2.addPrescription(p2);
		  mt2.addPrescription(p3);
		  
			session.persist(mt1);
			session.persist(mt2);
			
			tx.commit();
			
			sessionFactory.close();
		

	}
}
