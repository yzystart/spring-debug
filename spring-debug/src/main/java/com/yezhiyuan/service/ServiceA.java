package com.yezhiyuan.service;

import com.yezhiyuan.annotation.DB;
import org.springframework.transaction.annotation.Transactional;

public interface ServiceA {

	@Transactional
	@DB("db1")
	void doSomething2();

	void doSomething();
}
