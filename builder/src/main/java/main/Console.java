package main;

import com.domain.User;

/**
 * 程序入口
 * @author: wangyong
 * @date: 2018/11/24 0:00
 */
public class Console {

	public static void main(String[] args) {
		User user = new User.Builder().setUserName("admin").setUserId("admin").setEmail("admin@126.com").build();
		System.out.println(user);
	}
}
