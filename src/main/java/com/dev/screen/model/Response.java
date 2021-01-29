package com.dev.screen.model;

import java.util.List;

public class Response {

	private String status;

	private List<Output> list;

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Output> getList() {
		return list;
	}

	public void setList(List<Output> list) {
		this.list = list;
	}

}
