package com.hexaware.Mappings.Entity2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Doctor {
@Id
private int doctorid;
private String doctorname;
private char gender;
private String qualification;
private String speciality;
private String username;
private String password;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
private Set<Appointment> appointments= new HashSet<Appointment>();
public Doctor() {
	super();
}
public Doctor(int doctorid, String doctorname, char gender, String qualification, String speciality, String username,
		String password, Set<Appointment> appointments) {
	super();
	this.doctorid = doctorid;
	this.doctorname = doctorname;
	this.gender = gender;
	this.qualification = qualification;
	this.speciality = speciality;
	this.username = username;
	this.password = password;
	this.appointments = appointments;
}
public int getDoctorid() {
	return doctorid;
}
public void setDoctorid(int doctorid) {
	this.doctorid = doctorid;
}
public String getDoctorname() {
	return doctorname;
}
public void setDoctorname(String doctorname) {
	this.doctorname = doctorname;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getSpeciality() {
	return speciality;
}
public void setSpeciality(String speciality) {
	this.speciality = speciality;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Set<Appointment> getAppointments() {
	return appointments;
}
public void setAppointment(Set<Appointment> appointments) {
	this.appointments = appointments;
}
public void addAppointment(Appointment appointment) {

	
	appointment.setDoctor(this); 

			Set<Appointment> set = getAppointments();

			set.add(appointment);

		}
}
