package com.micro.tecs.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tec {
	
	@ApiModelProperty(notes = "technology id")
	private String idTec;
	
	@ApiModelProperty(notes = "technology name")
	private String tecName;
	
	@ApiModelProperty(notes = "technology date")
	private String tecYear;
	
}
