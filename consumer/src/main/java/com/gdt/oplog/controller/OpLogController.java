/*package com.gdt.oplog.controller;

import java.util.HashMap;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gdt.api.OpLogService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/oplog")
@Api("日志管理")
public class OpLogController {
	
	@Autowired
	private OpLogService service;
	
	@RequestMapping(value="detail/{id}",method={RequestMethod.GET,RequestMethod.POST})
	@ApiOperation(value="获取操作日志明细", notes="根据id获取操作日志")
	public Object detail(@PathVariable String id){
		return service.detail(id);
	}
	
	@RequestMapping(value="save/{id}",method={RequestMethod.POST})
	@ApiOperation(value="保存操作日志")
	public Object save(@RequestBody @ApiParam("{\"oper_item\":\"操作项\",\"oper_detail\":\"操作详情\"}") HashMap<String, Object> param){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		String userid = "402883335be7bfeb015be7cf00110001";//根据实际情况从会话获取
		
		param.put("oper_log_id", uuid);
		param.put("userid", userid);
		
		return service.save(param) ? uuid : false;
	}
	
	@RequestMapping(value="remove/{id}",method={RequestMethod.GET,RequestMethod.POST})
	@ApiOperation(value="删除日志", notes="根据id删除操作日志")
	public Object remove(@PathVariable String id){
		return service.del(id);
	}
	
	@RequestMapping(value="/list/{page}/{limit}",method={RequestMethod.POST})
	@ApiOperation(value="获取日志列表日志")
	public Object list(@RequestBody @ApiParam("{\"oper_log_id\":\"日志编号\",\"userid\":\"用户编号\",\"oper_item\":\"操作项\",\"oper_detail\":\"操作详情\"}") HashMap<String, Object> param,@PathVariable(required=true) @ApiParam("显示页")int page,@PathVariable(required=true) @ApiParam("每页条数") int limit){
		
		return service.list(page,limit,param);
	}
	
}
*/