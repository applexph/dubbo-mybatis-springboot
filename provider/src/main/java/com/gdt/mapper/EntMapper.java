package com.gdt.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gdt.entity.ent.EntModel;

public interface EntMapper {
	EntModel queryEntInfo(@Param("id") String id);
	Map<String, Object> queryPowerMonth(@Param("id")String id,@Param("month") String month);
	Map<String, Object> queryCurrMonthMonth(@Param("id")String id);
	Map<String, Object> queryHashCode(@Param("account")String account, @Param("password")String password);
	List<EntModel> queryEnts(@Param("ent") EntModel ent);
	Integer saveEnt(@Param("ent") EntModel ent);
	Map<String, Object> queryMsNo(@Param("entName")String entName);
}
