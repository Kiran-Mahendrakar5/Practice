package com.xworkz.pen.dao;

import com.xworkz.pen.dto.PenDto;

public class PenDao extends AbstractDao {
	PenDto[] dtos = new PenDto[5];

	@Override
	public PenDto save(PenDto dto) {
		if (dto != null) {
			if (dto.getName() != null) {
				for (int i = 0; i < dtos.length; i++) {
					if (dtos[i] == null) {
						dtos[i] = dto;
						System.out.println("name saved");
						return dtos[i];
					}

				}
				System.out.println("array have no space");
				return null;
			}
			System.out.println("get is null");
			return null;
		}
		System.out.println("dto is null");
		return null;
	}

	@Override
	public PenDto[] readAll() {

		return dtos;
	}

	@Override
	public boolean updateNameBytype(String type, String name) {
		if (name != null && type != null) {
			for (int i = 0; i < dtos.length; i++) {
				if (dtos[i] != null) {
					dtos[i].getType().equals(type);
					dtos[i].setType(name);
					System.out.println("updated name");
					return true;
				}

			}
			System.out.println("name is not found");
			return false;
		}
		System.out.println("name is null");
		return false;
	}

	public boolean deleteIndexByName(int index) {
		
			for (int i = 0; i < dtos.length; i++) {
				if (dtos[i].getName() != null) {
					if (dtos[i] !=null) {
						dtos[i]=null;
						System.out.println("Index deleted");
						return true;
					
				}
			}
			return false;

		}
		System.out.println("name is not found");
		return false;
	}

}
