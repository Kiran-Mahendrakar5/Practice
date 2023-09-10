package com.xworkz.watch.dao;

import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.watch.dto.WatchDto;

public class WatchDaoImp implements WatchDao {

	LinkedList<WatchDto> wtc = new LinkedList<WatchDto>();

	public boolean save(WatchDto dto) {
		if (dto != null) {
			wtc.add(dto);
			System.out.println("dto is saved");
			return true;

		}
		return false;
	}

	@Override
	public LinkedList<WatchDto> read() {
		return wtc;
	}

	@Override
	public WatchDto find(String brand) {
		if (brand != null) {
			for (WatchDto find : wtc) {
				if (find.getBrand().equals(brand)) {
					System.out.println("brand finded");
					return find;

				}
			}
		}
		return null;
	}

	@Override
	public boolean delete(String brand) {
		Iterator<WatchDto> itr = wtc.iterator();
		if (brand != null) {
			while (itr.hasNext()) {
				WatchDto dtos = (WatchDto) itr.next();
				if (dtos.getBrand().equals(brand)) {
					itr.remove();
					System.out.println("brand deleted");
					return true;
				}
				System.out.println("brand not found");

			}
			return false;

		}
		return false;
	}
	

}
