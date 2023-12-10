package com.hexaware.Mappings.Entity3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Prescription_Master")

public class Prescription {
@Id
private int prescriptionid;
private String medicinename;
private double price;

@ManyToMany(mappedBy = "prescription", fetch = FetchType.LAZY)

Set<MedicalTest> medicaltest=new HashSet<MedicalTest>();

public int getPrescriptionid() {
	return prescriptionid;
}

public void setPrescriptionid(int prescriptionid) {
	this.prescriptionid = prescriptionid;
}

public String getMedicinename() {
	return medicinename;
}

public void setMedicinename(String medicinename) {
	this.medicinename = medicinename;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Set<MedicalTest> getMedicaltest() {
	return medicaltest;
}

public void setMedicaltest(Set<MedicalTest> medicaltest) {
	this.medicaltest = medicaltest;
}

public Prescription(int prescriptionid, String medicinename, double price, Set<MedicalTest> medicaltest) {
	super();
	this.prescriptionid = prescriptionid;
	this.medicinename = medicinename;
	this.price = price;
	this.medicaltest = medicaltest;
}

public Prescription() {
	super();
}




}
