package cn.interesting.sdk.qywx.agent;

import cn.interesting.sdk.qywx.msg.receive.RMessage;
import cn.interesting.sdk.qywx.msg.response.Message;

/**
 * 测试应用
 * @author Administrator
 *
 */
public class JUnitAgent extends Agent {

	@Override
	public int getAgentId() {
		return 15;
	}

	@Override
	protected Message doReceiving(RMessage message) {
		return null;
	}

}
