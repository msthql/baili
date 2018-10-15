package com.asiainfo.abdinfo.testJxy;

import java.util.Collection;
import java.util.Iterator;
 
import javax.net.SocketFactory;
 
import org.jivesoftware.smack.AccountManager;
import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.ChatManager;
import org.jivesoftware.smack.ChatManagerListener;
import org.jivesoftware.smack.Connection;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Session;
import org.jivesoftware.smack.packet.Message.Type;
 
public class SmackUtil {
 
    private Connection connection;
    private ConnectionConfiguration config;
    /** openfire服务器address */
    private final static String server = "localhost";
    
    private final void print(Object o) {
        if (o != null) {
            System.out.println(o);
        }
    }
    
    private final void print(Object o, Object... args) {
        if (o != null && args != null && args.length > 0) {
            String s = o.toString();
            for (int i = 0; i < args.length; i++) {
                String item = args[i] == null ? "" : args[i].toString();
                if (s.contains("{" + i + "}")) {
                    s = s.replace("{" + i + "}", item);
                } else {
                    s += " " + item;
                }
            }
            System.out.println(s);
        }
    }
    
    /**
     * 初始Smack对openfire服务器链接的基本配置
     */
    public void init() {
        try {
            //connection = new XMPPConnection(server);
            //connection.connect();
            /** 5222是openfire服务器默认的通信端口，你可以登录http://10.100.53.65:9090/到管理员控制台查看客户端到服务器端口 */
            config = new ConnectionConfiguration(server, 5222);
            
            /** 是否启用压缩 */ 
            config.setCompressionEnabled(true);
            /** 是否启用安全验证 */
            config.setSASLAuthenticationEnabled(true);
            /** 是否启用调试 */
            config.setDebuggerEnabled(false);
            config.setReconnectionAllowed(true);
            config.setRosterLoadedAtLogin(true);
            
            /** 创建connection链接 */
            connection = new XMPPConnection(config);
            /** 建立连接 */
            connection.connect();
            System.out.println("connection success");
        } catch (XMPPException e) {
            e.printStackTrace();
        }
        print(connection);
        print(connection.getConnectionID());
    }
    
    public void destory() {
        if (connection != null) {
            connection.disconnect();
            connection = null;
        }
    }
    
    /**
     * ConnectionConfiguration 的基本配置相关信息
     */
    public void seeConfig() {
        print("PKCS11Library: " + config.getPKCS11Library());
        print("ServiceName: {0}", config.getServiceName());
        // ssl证书密码
        print("TruststorePassword: {0}", config.getTruststorePassword());
        print("TruststorePath: {0}", config.getTruststorePath());
        print("TruststoreType: {0}", config.getTruststoreType());
        
        SocketFactory socketFactory = config.getSocketFactory();
        print("SocketFactory: {0}", socketFactory);
    }
    
    /**
     * Connection 基本方法信息
     */
    public void seeConnection() {
        /** 用户管理 */
        AccountManager accountManager = connection.getAccountManager();
        for (String attr : accountManager.getAccountAttributes()) {
            print("AccountAttribute: {0}", attr);
        }
        print("AccountInstructions: {0}", accountManager.getAccountInstructions());
        /** 是否链接 */
        print("isConnected:", connection.isConnected());
        print("isAnonymous:", connection.isAnonymous());
        /** 是否有权限 */
        print("isAuthenticated:", connection.isAuthenticated());
        print("isSecureConnection:", connection.isSecureConnection());
        /** 是否使用压缩 */
        print("isUsingCompression:", connection.isUsingCompression());
    }
    
    /**
     * 创建用户
     * @param username
     * @param password
     */
    public void createUser(String username, String password){
    	AccountManager accountManager = connection.getAccountManager();
    	try {
    		/** 创建一个用户；你可以在管理员控制台页面http://10.100.53.65:9090/user-summary.jsp查看用户/组的相关信息，来查看是否成功创建用户 */
    		accountManager.createAccount(username, password);
    		/** 修改密码 */
    		accountManager.changePassword("abc");
    	} catch (XMPPException e) {
    		e.printStackTrace();
    	}    	
    }
    
    /**
     * 修改密码
     * @param username
     * @param password
     */
    public void changePassword(String password){
    	AccountManager accountManager = connection.getAccountManager();
    	try {
    		/** 修改密码 */
    		accountManager.changePassword("123456");
    	} catch (XMPPException e) {
    		e.printStackTrace();
    	}    	
    }
    
    
    /**
     * 用户登陆
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        try {
            /** 用户登陆，用户名、密码 */
            connection.login(username, password);
        } catch (XMPPException e) {
            e.printStackTrace();
        }
        /** 获取当前登陆用户 */
        print("User:", connection.getUser());
        
        /** 所有用户组 */
        Roster roster = connection.getRoster();
        
       /* try {
			roster.createEntry("test55", "test55", null);//添加好友，不添加成为好友也同样可以收发信息
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        
        /** 好友用户组，你可以用Spark添加用户好友，这样这里就可以查询到相关的数据 */
        Collection<RosterEntry> rosterEntiry = roster.getEntries();
        Iterator<RosterEntry> iter = rosterEntiry.iterator();
        while (iter.hasNext()) {
            RosterEntry entry = iter.next();
            print("Groups: {0}, Name: {1}, Status: {2}, Type: {3}, User: {4}", entry.getGroups(), entry.getName(), entry.getStatus(), entry.getType(), entry);
        }
        
        print("-------------------------------");
        /** 未处理、验证好友，添加过的好友，没有得到对方同意 */
        Collection<RosterEntry> unfiledEntries = roster.getUnfiledEntries();
        iter = unfiledEntries.iterator();
        while (iter.hasNext()) {
            RosterEntry entry = iter.next();
            print("Groups: {0}, Name: {1}, Status: {2}, Type: {3}, User: {4}", entry.getGroups(), entry.getName(), entry.getStatus(), entry.getType(), entry);
        }        
    }
    
    /**
     * 添加消息监听器
     */
    public void addMsgListener(){
    	//监听接收到的消息
    	connection.getChatManager().addChatListener(new ChatManagerListener() {	//可以监听到所有用户发来的消息		
    		@Override
    		public void chatCreated(Chat chat, boolean createdLocally) {
    			chat.addMessageListener(new MessageListener() {  
    				public void processMessage(Chat chat, Message message) {  
    					//String from = message.getFrom();  
    					//String body =  message.getBody();  
    					System.out.println("body:"+message.getBody());
    					
    				}  
    			});  				
    		}
    	});    	
    }
    
    /**
     * Packet消息聊天
     * @param from
     * @param to
     * @param msg
     */
    public void sendPacketMsg(String from, String to, String msg) {
//        try {
//            connection.login(from, from);
//        } catch (XMPPException e) {
//            e.printStackTrace();
//        }
        
        /** 更改用户状态，available=true表示在线，false表示离线，status状态签名；当你登陆后，在Spark客户端软件中就可以看到你登陆的状态 */
        Presence presence = new Presence(Presence.Type.available);
        presence.setStatus("Q我吧");
        connection.sendPacket(presence);
        
        Session session = new Session();
        //String sessid = session.nextID();
        connection.sendPacket(session);
        Message message = new Message(to+"@" + server, Type.chat);
        //Message message = new Message(sessid, Type.chat);
        message.setBody(msg);
        connection.sendPacket(message);
    }
    
    /**
     * Chat消息聊天
     * @param from
     * @param to
     * @param msg
     */
    public void sendChatMsg(String from, String to, String msg) {
        /** 设置状态 */
//        try {
//            connection.login(from, from);
//        } catch (XMPPException e) {
//            e.printStackTrace();
//        }
        
        /** 设置状态 */
        Presence presence = new Presence(Presence.Type.available);
        presence.setStatus("Q我吧");
        connection.sendPacket(presence);
        
        /** 获取当前登陆用户的聊天管理器 */
        ChatManager chatManager = connection.getChatManager();
        /** 为指定用户创建一个chat，监听对方发过来的消息  */
        Chat chat = chatManager.createChat(to+"@" + server, new MessageListener() {//仅监听该用户发来的消息
			
			@Override
			public void processMessage(Chat chat, Message message) {
				System.out.println("body:"+message.getBody());				
			}
		});
        try {
            /** 发送消息 */
            chat.sendMessage(msg);
            
            /** 用message对象发送消息 */
//            Message message = new Message();
//            message.setBody("message");
//            message.setProperty("color", "red");
//            chat.sendMessage(message);
        } catch (XMPPException e) {
            e.printStackTrace();
        }
    }
    
}

