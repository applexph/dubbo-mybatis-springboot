package com.gdt.ent.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.gdt.api.EntService;
import com.gdt.entity.ent.EntModel;
import com.gdt.mapper.EntMapper;

public class EntServiceImpl implements EntService{
	
	@Autowired
	EntMapper mapper;
	
	@Override
	public EntModel queryEntInfo(String id) {
		return mapper.queryEntInfo(id);
	}

	@Override
	public Map<String, Object> queryPowerMonth(String id, String month) {
		return mapper.queryPowerMonth(id, month);
	}

	@Override
	public Map<String, Object> queryCurrMonthMonth(String id) {
		return mapper.queryCurrMonthMonth(id);
	}

	@Override
	public String queryHashCode(String account, String password) {
		Map<String, Object> map  = mapper.queryHashCode(account,password);
		if(map != null){
			return (String)map.get("id");
		}
		return null;
	}

	@Override
	public boolean addEnt(EntModel model) {
		String msNo = this.queryMsNo(model.getEnt_name());
		if(msNo != null){
			model.setMs_no(msNo);
		}
		return mapper.saveEnt(model) > 0;
	}

	@Override
	public List<EntModel> queryEnts(EntModel model) {
		return mapper.queryEnts(model);
	}

	@Override
	public String queryMsNo(String entName) {
		Map<String, Object> map  = mapper.queryMsNo(entName);
		if(map != null){
			return (String)map.get("msno");
		}
		return null;
	}

}
