package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
@Entity
@Table(name="employees")
public class Employee{
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
      private long Id;
	@Column(name="first_name")
      private String firstname;
	@Column(name="last_name")
      private String lastname;
	@Column(name="sap_id")
      private Integer sapid;
	@Column(name="medical_history")
	  private String medicalhis;
	@Column(name="prescription")
	  private String prescription;
      
      public Employee() {
    	  
      }
      
     public Employee(String firstname, String lastname, Integer sapid, String medicalhis,String prescription) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.sapid = sapid;
		this.medicalhis=medicalhis;
		this.prescription=prescription;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		this.Id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getsapid() {
		return sapid;
	}
	public void setEmailid(Integer sapid) {
		this.sapid = sapid;
	}
	public String getmedicalhis() {
		return medicalhis;
	}
	public void setmedicalhis(String medicalhis) {
		this.medicalhis= medicalhis;
	}
	public String getprescription() {
		return prescription;
	}
	public void setprescription(String prescription) {
		this.prescription= prescription;
	}
      
      
      
}
