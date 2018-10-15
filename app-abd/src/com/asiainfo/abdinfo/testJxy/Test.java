package com.asiainfo.abdinfo.testJxy;

public class Test {
		
			public static void main(String[] args) {
				SmackUtil smackUtil = new SmackUtil();
				
				smackUtil.init();
				smackUtil.seeConfig();
				smackUtil.seeConnection();
				
				smackUtil.login("test2", "test2");
				smackUtil.addMsgListener();		
				
				smackUtil.sendChatMsg("test2","test1","222222222222222222222222222222222222222");
				smackUtil.sendPacketMsg("test2","test1","222222222222222222222222222222222222222");
				
				try {
					Thread.sleep(100*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}


	

}
