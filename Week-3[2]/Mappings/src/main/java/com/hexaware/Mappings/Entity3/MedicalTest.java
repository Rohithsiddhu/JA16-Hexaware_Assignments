package com.hexaware.Mappings.Entity3;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Medicaltest_Master")

public class MedicalTest {
@Id
private int testid;
private String testname;


	@ManyToMany(cascade = CascadeType.ALL)
	
	@JoinTable(name="prescription_medicaltest", joinColumns = {@JoinColumn(name="testid")} , inverseJoinColumns = {@JoinColumn(name="prescriptionid")})
	

private  Set<Prescription>  prescription= new HashSet<Prescription>();

public int getTestid() {
	return testid;
}

public void setTestid(int testid) {
	this.testid = testid;
}

public String getTestname() {
	return testname;
}

public void setTestname(String testname) {
	this.testname = testname;
}

public Set<Prescription> getPrescription() {
	return prescription;
}

public void setPrescription(Set<Prescription> prescription) {
	this.prescription = prescription;
}
public void addPrescription(Prescription prescription) {
	
	
	Set<Prescription> set =	getPrescription();
	
			set.add(prescription);

}
}
