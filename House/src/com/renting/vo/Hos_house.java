package com.renting.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ���ⷿ����Ϣ��
 * @author ����
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hos_house implements Serializable {
	
	private static final long serialVersionUID = -6959355900105713977L;
	//���ⷿ�ݱ��
	private int hMid;
	//�ͻ����
	private int uid;
	//�ֵ����
	private int sid;
	//�������ͱ��
	private int hTid;
	//�������
	private int size;
	//ÿ�����
	private double price;
	//����
	private String topic;
	//����
	private String contents;
	//����ʱ��
	private Date hTime;
	//��ע
	private String copy;
	
	private Sys_user user;
	private Hos_type type;
	private Hos_street street;
}
