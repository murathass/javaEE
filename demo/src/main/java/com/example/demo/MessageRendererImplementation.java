package com.example.demo;

public class MessageRendererImplementation implements MessageRenderer {

	private MessageProvider messageProvider;

	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException(
					"MessageProvider Interface'ini Uygulamış Bir Sınıfın Nesnesini Göndermelisiniz:" 
					+ MessageRendererImplementation.class.getName());
		}
		System.out.println(messageProvider.getMessage());

	}

	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;
	}

	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

}
