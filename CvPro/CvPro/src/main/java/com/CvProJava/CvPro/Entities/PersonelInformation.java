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
	@Column(name="LastName")
	private String LastName;
	@Column(name="Birthdate")
	private Date  Birthdate;
	@Column(name="BirthCity")
	private String BirthCity;
	@Column(name="MaritalStatus")
	private boolean MaritalStatus;
	@Column(name="MilitaryStatus")
	private boolean MilitaryStatus;
	@Column(name="PhotoLink")
	private String PhotoLink;
	@Column(name="MilitaryEndDate")
	private Date MilitaryEndDate;
	@ToString.Include
	
	String FullName(){		
		String result = (this.getMiddleName() == null ? FirstName+" "+LastName : FirstName+" "+MiddleName+" "+LastName);  
		 return result;		
	 }
	
}
