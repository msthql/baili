package com.asiainfo.abdinfo.testJxy;

public class Test1 {
	public static void main(String[] args) {
		SmackUtil smackUtil = new SmackUtil();
		
		smackUtil.init();
		smackUtil.seeConfig();
		smackUtil.seeConnection();
		
		smackUtil.login("test1", "test1");
		smackUtil.addMsgListener();
		smackUtil.sendChatMsg("test1","test2","1111111111111111111111111111111111111");
		smackUtil.sendPacketMsg("test1","test2","1111111111111111111111111111111111111");
		
		
		try {
			Thread.sleep(1000*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
