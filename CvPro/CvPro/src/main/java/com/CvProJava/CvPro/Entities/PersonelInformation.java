package com.CvProJava.CvPro.Entities;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="PersonelInformations")
public class PersonelInformation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int Id;
	@Getter @Setter
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private Date  Birthdate;
	private String BirthCity;
	private boolean MaritalStatus;
	private boolean MilitaryStatus;
	private String PhotoLink;
	private Date MilitaryEndDate;
	public PersonelInformation(int id, String firstName, String middleName, String lastName, Date birthdate,
			String birthCity, boolean maritalStatus, boolean militaryStatus, String photoLink, Date militaryEndDate) {
		super();
		Id = id;
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		Birthdate = birthdate;
		BirthCity = birthCity;
		MaritalStatus = maritalStatus;
		MilitaryStatus = militaryStatus;
		PhotoLink = photoLink;
		MilitaryEndDate = militaryEndDate;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	 
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}
	public String getBirthCity() {
		return BirthCity;
	}
	public void setBirthCity(String birthCity) {
		BirthCity = birthCity;
	}
	public boolean isMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(boolean maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public boolean isMilitaryStatus() {
		return MilitaryStatus;
	}
	public void setMilitaryStatus(boolean militaryStatus) {
		MilitaryStatus = militaryStatus;
	}
	public String getPhotoLink() {
		return PhotoLink;
	}
	public void setPhotoLink(String photoLink) {
		PhotoLink = photoLink;
	}
	public Date getMilitaryEndDate() {
		return MilitaryEndDate;
	}
	public void setMilitaryEndDate(Date militaryEndDate) {
		MilitaryEndDate = militaryEndDate;
	}
	
	
}
