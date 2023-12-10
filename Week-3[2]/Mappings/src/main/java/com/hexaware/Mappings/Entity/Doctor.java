package com.hexaware.Mappings.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Doctor implements Serializable{
	@Id
	private int doctorid;
	private String doctorname;
	private char gender;
	private String qualification;
	private String speciality;
	private String username;
	private String password;
	@OneToOne(mappedBy = "doctor")
	private Patient patient;
	public Doctor() {
		super();
	}
	
	
	public Doctor(int doctorid, String doctorname, char gender, String qualification, String speciality,
			String username, String password) {
		super();
		this.doctorid = doctorid;
		this.doctorname = doctorname;
		this.gender = gender;
		this.qualification = qualification;
		this.speciality = speciality;
		this.username = username;
		this.password = password;
	}


	public Doctor(int doctorid, String doctorname,char gender, String qualification, String speciality,
			String username, String password, Patient patient) {
		super();
		this.doctorid = doctorid;
		this.doctorname = doctorname;
		this.gender = gender;
		this.qualification = qualification;
		this.speciality = speciality;
		this.username = username;
		this.password = password;
		this.patient = patient;
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
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}
