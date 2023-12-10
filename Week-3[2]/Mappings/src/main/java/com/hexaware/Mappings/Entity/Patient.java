package com.hexaware.Mappings.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Patient implements Serializable{
	
 @Id
 private int patientid;
 private String username;
 private String password;
 private String disease;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "did")
 private Doctor doctor;
public Patient() {
	super();
}

public Patient(int patientid, String username, String password, String disease) {
	super();
	this.patientid = patientid;
	this.username = username;
	this.password = password;
	this.disease = disease;
}


public Patient(int patientid, String username, String password, String disease, Doctor doctor) {
	super();
	this.patientid = patientid;
	this.username = username;
	this.password = password;
	this.disease = disease;
	this.doctor = doctor;
}

public int getPatientid() {
	return patientid;
}

public void setPatientid(int patientid) {
	this.patientid = patientid;
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

public String getDisease() {
	return disease;
}

public void setDisease(String disease) {
	this.disease = disease;
}

public Doctor getDoctor() {
	return doctor;
}

public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}


}
