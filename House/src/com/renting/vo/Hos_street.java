package com.renting.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * �ֵ���Ϣ��
 * @author ����
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hos_street implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6894044725570311504L;
	//�ֵ����
	private Integer sid;
	//�ֵ�����
	private String sName;
	//���ر��
	private Integer sDid;
	
	private Hos_district district;
}
