package com.gdt.entity.ent;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("��ҵ������Ϣ")
public class EntModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5663863025403106241L;
	@ApiModelProperty(notes="hashcode")
	private String id;
	@ApiModelProperty("�˺�")
	private String account;
	@ApiModelProperty("����")
	private String pwd;
	@ApiModelProperty("��������� ")
	private String ms_no;
	@ApiModelProperty("������")
	private String res_man;
	@ApiModelProperty("��ҵ���� ")
	private String ent_name;
	@ApiModelProperty("��ҵ����")
	private String ent_property;
	@ApiModelProperty("��ϸ��ַ ")
	private String detail_addr;
	@ApiModelProperty("��ϵ�绰")
	private String conn_phone;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMs_no() {
		return ms_no;
	}
	public void setMs_no(String ms_no) {
		this.ms_no = ms_no;
	}
	public String getRes_man() {
		return res_man;
	}
	public void setRes_man(String res_man) {
		this.res_man = res_man;
	}
	public String getEnt_name() {
		return ent_name;
	}
	public void setEnt_name(String ent_name) {
		this.ent_name = ent_name;
	}
	public String getEnt_property() {
		return ent_property;
	}
	public void setEnt_property(String ent_property) {
		this.ent_property = ent_property;
	}
	public String getDetail_addr() {
		return detail_addr;
	}
	public void setDetail_addr(String detail_addr) {
		this.detail_addr = detail_addr;
	}
	public String getConn_phone() {
		return conn_phone;
	}
	public void setConn_phone(String conn_phone) {
		this.conn_phone = conn_phone;
	}
	
	
}
