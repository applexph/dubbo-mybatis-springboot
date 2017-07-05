package com.gdt.ent.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.gdt.api.EntService;
import com.gdt.mapper.EntMapper;

public class EntServiceImpl implements EntService{
	
	@Autowired
	EntMapper mapper;
	
	@Override
	public Map<String, Object> queryEntInfo(int id) {
		return mapper.queryEntInfo(id);
	}

	@Override
	public Map<String, Object> queryPowerMonth(int id, String month) {
		return mapper.queryPowerMonth(id, month);
	}

	@Override
	public Map<String, Object> queryCurrMonthMonth(int id) {
		return mapper.queryCurrMonthMonth(id);
	}

}
