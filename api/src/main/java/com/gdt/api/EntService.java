package com.gdt.api;

import java.util.Map;

public interface EntService {
	Map<String, Object> queryEntInfo(int id);
	Map<String, Object> queryPowerMonth(int id,String month);
	Map<String, Object> queryCurrMonthMonth(int id);
}
