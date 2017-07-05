package com.gdt.oplog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gdt.api.EntService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/ent")
@Api("企业信息查询")
public class EntController {
	
	@Autowired
	EntService service;
	
	@RequestMapping(value="/info/{id}",method={RequestMethod.GET,RequestMethod.POST})
	@ApiOperation(value="基本信息查询")
	public Object queryEntInfo(@PathVariable(required=true) int id) {
		return service.queryEntInfo(id);
	}

	@RequestMapping(value="/power/{month}/{id}",method={RequestMethod.GET,RequestMethod.POST})
	@ApiOperation(value="月度用电量查询")
	public Object queryPowerMonth(@PathVariable(required=true) int id, @PathVariable(required=true) @ApiParam("月份[yyyymm]") String month) {
		return service.queryPowerMonth(id,month);
	}
	
	@RequestMapping(value="/power/{id}",method={RequestMethod.GET,RequestMethod.POST})
	@ApiOperation(value="当月用电量查询")
	public Object queryCurrMonthMonth(@PathVariable(required=true) int id) {
		return service.queryCurrMonthMonth(id);
	}
}
