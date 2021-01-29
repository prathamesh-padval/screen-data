package com.dev.screen.model;

public class Output {

	private int id;
	private String content;
	private String desc;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Output [id=" + id + ", content=" + content + ", desc=" + desc + "]";
	}

	
	
}
