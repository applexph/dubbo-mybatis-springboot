package com.gdt.api;

import java.util.HashMap;
import java.util.List;

public interface OpLogService {
	/**
	 * ��ѯ��־��ϸ
	 * @param id
	 * @return
	 */
	Object detail(String id);
	/**
	 * ������־
	 * @param log
	 * @return
	 */
	boolean save(HashMap<String,Object> log);
	/**
	 * ɾ����־
	 * @param id
	 * @return
	 */
	boolean del(String id);
	/**
	 * ��ѯ��־�б�
	 * @param param
	 * @return
	 */
	List<Object> list(int page,int limit,HashMap<String,Object> param);
}
