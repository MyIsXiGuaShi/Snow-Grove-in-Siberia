package com.renting.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date>{
	private String datePattern;
	
	public StringToDateConverter(String datePattern){
		this.datePattern = datePattern;
	}
	
	@Override
	public Date convert(String arg) {
		Date date = null;
		System.out.println("��ʼת����������");
		try{
			date = new SimpleDateFormat(datePattern).parse(arg);
			System.out.println("ת����ɡ�����");
		}catch(ParseException e){
			System.out.println("ת��ʧ�ܡ�����");
			e.printStackTrace();
		}
		
		return date;
	}
}
