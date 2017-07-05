package com.gdt.api;

import java.util.HashMap;
import java.util.List;

public interface OpLogService {
	/**
	 * 查询日志明细
	 * @param id
	 * @return
	 */
	Object detail(String id);
	/**
	 * 保存日志
	 * @param log
	 * @return
	 */
	boolean save(HashMap<String,Object> log);
	/**
	 * 删除日志
	 * @param id
	 * @return
	 */
	boolean del(String id);
	/**
	 * 查询日志列表
	 * @param param
	 * @return
	 */
	List<Object> list(int page,int limit,HashMap<String,Object> param);
}
