package com.ares.action;

import com.ares.queue.IActionQueue;

/**
 * 无限循环
 * 
 * @author admin
 *
 */
public abstract class InfiniteLoopAction extends DelayAction {

	public InfiniteLoopAction(IActionQueue queue, int delay) {
		super(queue, delay);
	}

	@Override
	public void execute() {
		try{			
			loopExecute();
		}catch (Exception e) {
			throw e;
		}finally {			
			this.execTime = System.currentTimeMillis() + this.delay;
			if(!super.getActorQueue().isStop()){				
				super.getActorQueue().enDelayQueue(this);
			}
		}
	}

	/**
	 * 循环执行接口
	 */
	public abstract void loopExecute();
}
