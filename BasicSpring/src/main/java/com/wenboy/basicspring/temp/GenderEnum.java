/**
 * 
 */
package com.wenboy.basicspring.temp;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wenbyuan
 *
 */
public final class GenderEnum {
	public static final String MALE = "Male";
	public static final String FEMALE = "Female";
	
	public static List<String> getGenderEnum() throws IllegalArgumentException, IllegalAccessException{
		Field[] fields = GenderEnum.class.getFields();
		List<String> enums = new ArrayList<String>();
		for(Field f:fields){
			String fieldName = (String)f.get(GenderEnum.class);
			enums.add(fieldName);
		}
		return enums; 
	}
	
	public static void main(String[] args){
		try {
			System.out.println(GenderEnum.getGenderEnum());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
