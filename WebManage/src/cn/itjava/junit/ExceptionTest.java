package cn.itjava.junit;

import org.junit.Test;

import cn.itjava.exception.CustomException;

public class ExceptionTest {

	@Test
	public void testException(){
		String x = "abc";
		int s =0;
		try{
			throw new CustomException("���ݿ����ӳ���");
		}catch(CustomException e){
			System.out.println(e);
		}
	}
}
