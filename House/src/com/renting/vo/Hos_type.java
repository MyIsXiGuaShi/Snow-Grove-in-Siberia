package com.renting.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ����������
 * @author ����
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hos_type implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6098622322523714912L;
	//�������ͱ��
	private int hid;
	//������������
	private String htName;
}
