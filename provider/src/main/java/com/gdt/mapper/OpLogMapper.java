package com.gdt.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface OpLogMapper {
	HashMap<String, Object> selectByPrimaryKey(@Param("id") String id);
	int insert(HashMap<String, Object> log);
	int deleteByPrimaryKey(@Param("id") String id);
	List<Map<String, Object>> list(HashMap<String, Object> param);
}
