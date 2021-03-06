package by.htp.dz6.equipment.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Skis extends Equipment {
	private String[] catListSkis = { "Fischer", "Guru", "RC4" };
	private String[] acsListSkis = { "Skis Helmet", "Skis Bag", "Skis Mask", "Skis Skirt" };

	public Skis() {
		super();
	}

	public Skis(int id, String cat, String title, boolean isAvlble, double rentPrice, double lostPrice) {
		super.setId(id);
		super.setCategory(cat);
		super.setTitle(title);
		super.setAvialible(isAvlble);
		super.setRentPrice(rentPrice);
		super.setLostPrice(lostPrice);
	}

	public void print() {
		String infoEquipment="";
		infoEquipment="[id:"+getId()+"]"+getCategory()+", "+getTitle() +", ";
		if (!isAvialible())	infoEquipment+="����������";	
		else  infoEquipment+="��������";
		infoEquipment+=", ���� ������: "+getRentPrice()+", ���� �����/������: "+getLostPrice();
		System.out.println(infoEquipment);
	}

}
