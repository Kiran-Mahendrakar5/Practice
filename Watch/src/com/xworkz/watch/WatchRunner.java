package com.xworkz.watch;


import java.util.LinkedList;

import com.xworkz.watch.dao.WatchDaoImp;
import com.xworkz.watch.dto.WatchDto;

public class WatchRunner {
	
	public static void main(String[] args) {
		
		WatchDto dtos = new WatchDto("Iwatch","smartWatch","black",29900);
		WatchDto dtos1 = new WatchDto("Samsung","normalWatch","white",15000);
		WatchDaoImp dao = new WatchDaoImp();
		
		dao.save(dtos);
		dao.save(dtos1);
		System.out.println("....................................");
		WatchDto finded = dao.find("Iwatch");
		System.out.println(finded);
		System.out.println("........................................");
		boolean delete =dao.delete("Iwatch");
		System.out.println(delete);
//		boolean delete1 =dao.delete("Samsung");
//		System.out.println(delete);
		
		
		LinkedList<WatchDto> result = dao.read();
		for(WatchDto secResult:result) {
		System.out.println(secResult);
			
		}
	}

}
