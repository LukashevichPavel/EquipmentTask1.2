package by.htp.dz5.putevka.entity;

public abstract class Tur {
	private String name;
	private String country; //������ ����������
	private String city; //�����
	private String typeOfTransport;//��� ����������: �������, �������, ������� � �.�.
	private boolean hotelTrue;// �������� ���������� ��� ���. � �������� ��� ���
	private Hotel namehotel; //�������� �����
	private int countDay; //����������������� � ����
	private double price;
	private String about; //��������� �������� ����
	
	public void print(){
		System.out.println(this.getName());	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTypeOfTransport() {
		return typeOfTransport;
	}
	public void setTypeOfTransport(String typeOfTransport) {
		this.typeOfTransport = typeOfTransport;
	}
	public boolean isHotelTrue() {
		return hotelTrue;
	}
	public void setHotelTrue(boolean hotelTrue) {
		this.hotelTrue = hotelTrue;
	}
	public Hotel getNamehotel() {
		return namehotel;
	}
	public void setNamehotel(Hotel namehotel) {
		this.namehotel = namehotel;
	}
	public int getCountDay() {
		return countDay;
	}
	public void setCountDay(int countDay) {
		this.countDay = countDay;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	
}
