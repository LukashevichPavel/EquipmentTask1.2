package by.htp.dz5.putevka.entity;

public class Hotel {
	private String nameHotel; //�������� �����
	private int countStar; //���������� �����
	private String foodType; //������� RO - ��� �������, BB - ������ ��������, HB - ������� � ����, FB - ������� ���� � ���� 
	private double priceForDay; //��������� ���������� � �����

	public Hotel (){
		
	}
	
	public Hotel(String name, int star, String food, double price){
		this.nameHotel=name;
		this.countStar=star;
		this.foodType=food;
		this.priceForDay=price;
	}

	
	
	
	public Hotel randomHotel(){
	String []nameList1={"������", "������������","�����-�����", "���� ����", "������"};
	String []nameList2={"������","���", "�����", "�����", "�����", "�����"};
	String []foodList1={"RO", "BB", "HB", "FB"}; 
	int random1=(int)(Math.random()*nameList1.length);
	int random2=(int)(Math.random()*nameList2.length);
	String tempNameHotel= nameList1[random1]+" "+nameList2[random2];
	int tempStar=(int)(Math.random()*5+1); 
	int tempFood=(int)(Math.random()*foodList1.length);
	double tempPrice = Math.random()*100;
	Hotel hotel=new Hotel(tempNameHotel,tempStar,foodList1[tempFood],tempPrice);
	return hotel;	
	}
	
	public void print(){
	System.out.println(this.toString());	
	}
	
	@Override
	public String toString() {
		return "Hotel [nameHotel=" + nameHotel + ", countStar=" + countStar + ", foodType=" + foodType
				+ ", priceForDay=" + priceForDay + "]";
	}

	public String getNameHotel() {
		return nameHotel;
	}

	public void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}

	public int getCountStar() {
		return countStar;
	}

	public void setCountStar(int countStar) {
		this.countStar = countStar;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getPriceForDay() {
		return priceForDay;
	}

	public void setPriceForDay(double priceForDay) {
		this.priceForDay = priceForDay;
	} 


}

