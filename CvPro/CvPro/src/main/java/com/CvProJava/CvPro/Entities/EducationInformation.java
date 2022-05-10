package com.CvProJava.CvPro.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="EducationInformations")
@Data
@ToString
public class EducationInformation {
	 @Id
	 @Column(name="ID")
	 private int Id ;
	 @Column(name="PersonelId")
	 private int PersonId ;
	 @Column(name="EducationName")
	 private String EducationName ;
	 @Column(name="EducationType")
	 private String EducationType ;
	 @Column(name="StartDate")
	 private Date StartDate ;
	 @Column(name="EndDate")
	 private Date  EndDate ;
	 @Column(name="Graduate")
	 private boolean Graduate ;
	 @Column(name="Degree")
	 private double Degree ;

}
