package com.CvProJava.CvPro.Entities;

import java.util.Date;



import javax.persistence.*;


import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="PersonelInformations")
@Data
@ToString
public class PersonelInformation {	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="Id")
	private int Id;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="MiddleName")
	private String MiddleName;
	private String LastName;
	private Date  Birthdate;
	private String BirthCity;
	private boolean MaritalStatus;
	private boolean MilitaryStatus;
	private String PhotoLink;
	private Date MilitaryEndDate;
	@ToString.Include
	String FullName(){
		if (MiddleName=="") {
			return FirstName+" "+LastName;
		}else {
			return FirstName+" "+MiddleName+" "+LastName;
		}
	}
	

}
