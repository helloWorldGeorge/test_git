package cn.hero.aop;


import java.lang.reflect.Method;
import java.util.Date;

import javax.annotation.Resource;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import cn.hero.service.LoggerService;
import cn.hero.vo.Logger;
@Component
@Aspect
public class LoggerAspect {
    private LoggerService loggerServiceImpl;
    
	public LoggerService getLoggerServiceImpl() {
		return loggerServiceImpl;
	}
   @Resource
	public void setLoggerServiceImpl(LoggerService loggerServiceImpl) {
		this.loggerServiceImpl = loggerServiceImpl;
	}

	//切面
	@Pointcut("execution(public * cn.hero.service.impl.ImplServiceVoUser.*(..))")
	//签名
	public void userLogger(){
		
	}
	//多个切面
	@Pointcut("execution(public * cn.hero.service.impl.ImplServiceVoCustomer.*(..))")
	//签名
	public void departmentLogger(){
			
	}
	
//	@Around(value="userLogger()　|| departmentLogger()")
	public Object loggerMethod(ProceedingJoinPoint p)throws Throwable{
		Logger log = new Logger();
		//获取类名
		String className = p.getSignature().getDeclaringType().getName();
		//获取方法名
		Method method = ((MethodSignature)p.getSignature()).getMethod();
	    String methodName = method.getName();
	    
	    log.setClassName(className);
	    log.setMethodName(methodName);
	    log.setUsername(null);
	    try{
	    	log.setStatus("success");
	    	return p.proceed();
	    }catch (Throwable e) {
		    log.setStatus("failure");
		    return null;
		}finally{
			log.setDatetime(new Date());
			loggerServiceImpl.saveLogger(log);
		}
	}
}
