package com.it.xb.microserviceuser.util;

import org.slf4j.Logger;

/**
  * 日志工具
 * 
  * 调用日志工具打印日志，与直接调用最大的区别就是会先调用log的日志级别判断语句，可以减少sai值
 */
public final class LogUtil {

	/**
	  * 只有静态方法的类，使用私有构造方法
	 */
	private LogUtil() {

	}

	/**
	  * 打印info日志
	 * 
	 * @param logger 日志
	 * @param format format字符串
	 * @param object 
	 */
	public static void info(Logger log, String format, Object... object) {
		if (log.isInfoEnabled()) {
			log.info(format, object);
		}
	}

	public static void debug(Logger log, String format, Object... object) {
		if (log.isDebugEnabled()) {
			log.debug(format, object);
		}
	}

	public static void warn(Logger log, String format, Object... object) {
		if (log.isWarnEnabled()) {
			log.warn(format, object);
		}
	}

	public static void error(Logger log, String format, Object... object) {
		if (log.isErrorEnabled()) {
			log.error(format, object);
		}
	}
}
