package com.cjm.boot.demo.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.cjm.boot.demo.common.status.StatusInfo;

/**
 * 
 * 返回前端统一接口
 * 
 * @author yuhao
 *
 * @since 2017年9月30日09:11:56
 */
public class ResponseEntity<T> {

	

	/**
	 * 状态代码
	 */
	protected String code = StatusInfo.REQUEST_SUCCESS.getCode();
	/**
	 * 消息内容
	 */
	protected String message = StatusInfo.REQUEST_SUCCESS.getMessage();
	/**
	 * 消息主体业务对象
	 */
	protected T data;
	/**
	 * token
	 */
	protected String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@JsonIgnore
	protected StatusInfo statusInfo = StatusInfo.REQUEST_SUCCESS;

	/**
	 * 简单构造，返回一个成功信息，不带业务对象
	 */
	public ResponseEntity() {
		this.statusInfo(StatusInfo.REQUEST_SUCCESS);
	}
	
	/**
	 * 简单构造，返回一个成功信息，不带业务对象
	 */
	public ResponseEntity(StatusInfo o) {
		this.code = o.getCode();
		this.message = o.getMessage();
	}

	/**
	 * 简单构造，返回执行结果信息，不带业务对象
	 * @param code
	 * @param msg
	 */
	public ResponseEntity(String code, String msg) {
		this.code = code;
		this.message = msg;
	}

	/**
	 * 简单构造，返回执行结果信息，带业务对象
	 * @param code
	 * @param msg
	 * @param data
	 */
	public ResponseEntity(String code, String msg, T data) {
		this.code = code;
		this.message = msg;
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public StatusInfo getStatusInfo() {
		return statusInfo;
	}

	public void statusInfo(StatusInfo statusInfo) {
		this.statusInfo = statusInfo;
		this.code = statusInfo.getCode();
		this.message = statusInfo.getMessage();
	}

}
