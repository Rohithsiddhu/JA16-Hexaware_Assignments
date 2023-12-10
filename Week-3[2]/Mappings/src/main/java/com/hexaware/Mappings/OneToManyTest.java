package com.hexaware.Mappings;
import java.util.HashSet;
import java.util.Set;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.Mappings.Entity2.Doctor;
import com.hexaware.Mappings.Entity2.Appointment;

public class OneToManyTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
     Appointment a1=new Appointment();
     a1.setAppointmentid(101);
     a1.setAppointmentdate(new Date());
     a1.setStatus("scheduled");
     
     Appointment a2=new Appointment();
     a2.setAppointmentid(102);
     a2.setAppointmentdate(new Date());
     a2.setStatus("canceled");
     
     Appointment a3=new Appointment();
     a3.setAppointmentid(103);
     a3.setAppointmentdate(new Date());
     a3.setStatus("completed");
     
     Set<Appointment> appointmentSet=new HashSet<Appointment>();
     appointmentSet.add(a1);
     appointmentSet.add(a2);
     appointmentSet.add(a3);
     
     Doctor doc=new Doctor();
     doc.setDoctorid(120);
     doc.setDoctorname("karthikeya");
     doc.setGender('M');
     doc.setQualification("D.M");
     doc.setSpeciality("Nephrologist");
     doc.setUsername("karthik123");
     doc.setPassword("karthikeya@12345");
     doc.setAppointment(appointmentSet);
     
     session.persist(doc);
	 

		
		tx.commit();

		sessionFactory.close();
	}
}
