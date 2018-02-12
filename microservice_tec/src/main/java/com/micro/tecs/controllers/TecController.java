package com.micro.tecs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.micro.tecs.dto.Tec;
import com.micro.tecs.service.TecService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tec")
@Api(value="technologies", description="technologies repository")// description="Operations pertaining to products in Online Store")
public class TecController {

	@Autowired
	private TecService tecService;

	@ApiOperation(value = "get a technology by id")
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public Tec getTec(@PathVariable("id") String id) {

		return tecService.getTecById(id);
	}



	@ApiOperation(value = "get list of technologies")
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public List<Tec> getIndex() {

		return tecService.getTecs();
	}
	
	
}
