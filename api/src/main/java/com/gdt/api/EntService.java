package com.gdt.api;

import java.util.List;
import java.util.Map;

import com.gdt.entity.ent.EntModel;

public interface EntService {
	EntModel queryEntInfo(String id);
	Map<String, Object> queryPowerMonth(String id,String month);
	Map<String, Object> queryCurrMonthMonth(String id);
	String queryHashCode(String account,String password);
	
	public boolean addEnt(EntModel model);
	public List<EntModel> queryEnts(EntModel model);
	
	public String queryMsNo(String entName);
}
