package com.hexaware.Mappings.Entity2;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Appointment {
@Id
private int appointmentid;
@Temporal(TemporalType.DATE)
private  Date  appointmentdate;
private String status;


@ManyToOne
@JoinColumn(name = "did") 
Doctor doctor;


public int getAppointmentid() {
	return appointmentid;
}


public void setAppointmentid(int appointmentid) {
	this.appointmentid = appointmentid;
}


public Date getAppointmentdate() {
	return appointmentdate;
}


public void setAppointmentdate(Date appointmentdate) {
	this.appointmentdate = appointmentdate;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


public Doctor getDoctor() {
	return doctor;
}


public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}


public Appointment() {
	super();
}


public Appointment(int appointmentid, Date appointmentdate, String status) {
	super();
	this.appointmentid = appointmentid;
	this.appointmentdate = appointmentdate;
	this.status = status;
}

}
