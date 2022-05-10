package com.CvProJava.CvPro.restApi;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CvProJava.CvPro.Business.IGenericService;
import com.CvProJava.CvPro.Entities.PersonelInformation;

@SuppressWarnings("hiding")
@RestController
@RequestMapping("/api")
public class PersonelInformationController <PersonelInformation extends Serializable>{
private IGenericService<PersonelInformation> genericService;

public PersonelInformationController(IGenericService<PersonelInformation>  genericService) {

	this.genericService = genericService;
}

@GetMapping("/personel")
public List<PersonelInformation> get(){ 
	return genericService.getList();
}

}
