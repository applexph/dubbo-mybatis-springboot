package com.gdt.oplog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gdt.api.EntService;
import com.gdt.entity.ent.EntModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/ent")
@Api("企业信息服务")
public class EntController {
	
	@Autowired
	EntService service;
	
	@RequestMapping(value="/reg",method={RequestMethod.PUT})
	@ApiOperation(value="注册接口")
	public Object reg(@RequestBody EntModel model) {
		return service.addEnt(model);
	}
	
	@RequestMapping(value="/hash",method={RequestMethod.GET})
	@ApiOperation(value="查询用户hashcode")
	public Object queryHash(@ApiParam(value="用户名",required=true) @RequestParam(required = true) String account,
			@ApiParam(value="密码",required=true) @RequestParam(required = true) String pwd) {
		return service.queryHashCode(account, pwd);
	}
	
	@RequestMapping(value="/info/hash",method={RequestMethod.GET})
	@ApiOperation(value="基本信息查询")
	public EntModel queryEntInfo(@ApiParam(required=true) @RequestParam(required=true)String hashcode) {
		return service.queryEntInfo(hashcode);
	}
	
	@RequestMapping(value="/info/account",method={RequestMethod.GET})
	@ApiOperation(value="基本信息查询")
	public EntModel queryEntInfo1(@ApiParam(value="用户名",required=true) @RequestParam(required = true) String account,
			@ApiParam(value="密码",required=true) @RequestParam(required = true) String pwd) {
		String id = service.queryHashCode(account, pwd);
		return service.queryEntInfo(id);
	}

	@RequestMapping(value="/power/hash",method={RequestMethod.GET})
	@ApiOperation(value="月度用电量查询")
	public Object queryPowerMonth(@RequestParam(required = true) String hashcode,
			@RequestParam(required = true) @ApiParam(value="月份[yyyymm]",required=true) String month) {
		return service.queryPowerMonth(hashcode, month);
	}
	
	@RequestMapping(value="/power/account",method={RequestMethod.GET})
	@ApiOperation(value="月度用电量查询")
	public Object queryPowerMonth1(
			@ApiParam(value = "用户名", required = true) @RequestParam(required = true) String account,
			@ApiParam(value = "密码", required = true) @RequestParam(required = true) String pwd,
			@ApiParam(value = "月份[yyyymm]", required = true) @RequestParam(required = true) String month) {
		String id = service.queryHashCode(account, pwd);
		return service.queryPowerMonth(id, month);
	}
	
	@RequestMapping(value="/cpower/hash",method={RequestMethod.GET})
	@ApiOperation(value="当月用电量查询")
	public Object queryCurrMonthMonth(@RequestParam(required=true,name="hashcode")String hashcode) {
		return service.queryCurrMonthMonth(hashcode);
	}
	
	@RequestMapping(value="/cpower/account",method={RequestMethod.GET})
	@ApiOperation(value="当月用电量查询")
	public Object queryCurrMonthMonth1(
			@ApiParam(value = "用户名", required = true) @RequestParam(required = true) String account,
			@ApiParam(value = "密码", required = true) @RequestParam(required = true) String pwd) {
		String id = service.queryHashCode(account, pwd);
		return service.queryCurrMonthMonth(id);
	}
	
	@RequestMapping(value="/cnts",method={RequestMethod.GET})
	@ApiOperation(value="查询已注册企业列表")
	public List<EntModel> queryEntList() {
		return service.queryEnts(null);
	}
}
