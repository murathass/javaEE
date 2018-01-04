package com.example.demo;

public interface MessageRenderer {
	void render();
	 void setMessageProvider(MessageProvider provider);
	 MessageProvider getMessageProvider();
}
