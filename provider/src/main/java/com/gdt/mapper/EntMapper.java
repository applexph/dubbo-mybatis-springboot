package com.gdt.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EntMapper {
	Map<String, Object> queryEntInfo(@Param("id") int id);
	Map<String, Object> queryPowerMonth(@Param("id")int id,@Param("month") String month);
	Map<String, Object> queryCurrMonthMonth(@Param("id")int id);
}
