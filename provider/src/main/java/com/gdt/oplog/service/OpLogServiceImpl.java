package com.gdt.oplog.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gdt.api.OpLogService;
import com.gdt.mapper.OpLogMapper;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class OpLogServiceImpl implements OpLogService{
	
	@Autowired
	OpLogMapper mapper;
	
	@Override
	public Object detail(String id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean save(HashMap<String,Object> log) {
		return mapper.insert(log) == 1;
	}

	@Override
	public boolean del(String id) {
		return mapper.deleteByPrimaryKey(id) == 1;
	}

	@Override
	public List<Object> list(int page,int limit,final HashMap<String,Object> param) {
		PageInfo<Object> pageInfo = PageHelper.startPage(page,limit).doSelectPage(new ISelect() {
			@Override
			public void doSelect() {
				mapper.list(param);
			}
		}).toPageInfo();
		return pageInfo.getList();
	}

}
