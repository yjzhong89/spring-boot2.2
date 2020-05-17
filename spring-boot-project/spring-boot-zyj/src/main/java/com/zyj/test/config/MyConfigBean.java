package com.zyj.test.config;

import org.springframework.beans.factory.annotation.Value;

public class MyConfigBean {
	@Value("${server.port}")
	private int port;

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
