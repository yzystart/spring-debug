package com.yezhiyuan.aop;


import com.yezhiyuan.annotation.DB;
import com.yezhiyuan.config.DataSourceHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DBAspect {

	@Before("@annotation(com.yezhiyuan.annotation.DB)  && @annotation(db) ")
	public void before(JoinPoint joinPoint,DB db) throws Throwable {
		System.out.println("切换了数据库-》"+db.value());
		DataSourceHolder.setCurrentDataSource(DataSourceHolder.datasourceMap.get(db.value()));
	}


}
