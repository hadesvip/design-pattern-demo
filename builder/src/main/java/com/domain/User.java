package com.domain;

import java.io.Serializable;

/**
 * 用户信息
 * @author: wangyong
 * @date: 2018/11/23 23:52
 */
public final class User implements Serializable {

	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = -5370796872638524212L;

	/**
	 * 用户编号
	 */
	private String userId;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 邮箱
	 */
	private String email;

	public User(Builder builder) {
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.email = builder.email;
	}


	@Override
	public String toString() {
		return "User{" + "userId='" + userId + '\'' + ", userName='" + userName + '\'' + ", email='" + email + '\''
				+ '}';
	}

	/**
	 * builder方式构建用户信息
	 */
	public static class Builder {

		/**
		 * 用户编号
		 */
		private String userId;

		/**
		 * 用户名
		 */
		private String userName;

		/**
		 * 邮箱
		 */
		private String email;

		public Builder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public Builder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public User build() {
			return new User(this);
		}


	}


	public String getUserId() {
		return userId;
	}

	public User setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getUserName() {
		return userName;
	}

	public User setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}
}
