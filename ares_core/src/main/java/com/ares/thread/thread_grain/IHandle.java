package com.ares.thread.thread_grain;

import java.lang.reflect.Method;
@Deprecated
public interface IHandle {
	/**
	 * 消息包
	 * 
	 * @return
	 */
	public Object getPacket();

	/**
	 * 处理消息包的方法
	 * 
	 * @return
	 */
	public Method getMethod();

	/**
	 * 处理消息包方法的实例对象
	 * 
	 * @return
	 */
	public Object getInstance();
}
