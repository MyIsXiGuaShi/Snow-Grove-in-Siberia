package com.renting.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ������Ϣ��
 * @author ����
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hos_district implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8655448286036960999L;
	//���ر��
	private Integer did;
	//��������
	private String dName;
}
