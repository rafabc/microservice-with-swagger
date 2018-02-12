package com.micro.tecs.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.micro.tecs.dto.Tec;

@Service
public class TecService {
	
	List<Tec> tecs;
	

	
	
	@PostConstruct
	public void init() {
		
		 tecs = new ArrayList<Tec>();
		 tecs.add(new Tec("1", "Java", "1998"));
		 tecs.add(new Tec("2", "C++", "1985"));
		 tecs.add(new Tec("3", ".Net", "2001"));
		 tecs.add(new Tec("4", "Python", "2005"));
		 tecs.add(new Tec("5", "Cobol", "1980"));
		 tecs.add(new Tec("6", "Pascal", "1978"));
	}
	
	public Tec getTecById(String id) {
		
		return tecs.get(Integer.valueOf(id) - 1);
	}
	
	public List<Tec> getTecs() {
		
		return tecs;
	}
	
}
