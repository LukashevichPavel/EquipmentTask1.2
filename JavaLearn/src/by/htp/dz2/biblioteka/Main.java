package by.htp.dz2.biblioteka;

public class Main {

	public static void main(String[] args) {
		System.out.println("�������: 1.������� ������ ����� � ������, � ����� ����������� ����� �������� �������, ������� ����� �������� ��� ��� ������������");
		System.out.println("2.������� ����� ����������, � �������� ���� �������� ������ �������� �������");
		System.out.println("3.�������� ����� ���������� ������ ��������� �������."); 
		System.out.println("4.�������� ����� ��������� �������� ������� (����� �� �����)");
		System.out.println("���������� �������� ������� � ���������� �� ����������."); 
		System.out.println("");
		
		//������� 2 ������� ������ ����� � 3 ������� ������ ������
		Book book = new Book("Book","50 ottenkov serogo", 105.3);
		Book book2 = new Book("Book", "Maugli", 103.75);
		Magazine magazine = new Magazine ("Magazine","Playboy",220.25);
		Magazine magazine2 = new Magazine ("Magazine","Java for student",325.55);
		Magazine magazine3 = new Magazine ("Magazine","The secret of Universe",103.15);
		
				
		Library lib = new Library(5); //������� ���������� � �������� � 5 �������� �������
		lib.addItem(0, book); //��������� ����������
		lib.addItem(1, book2);
		lib.addItem(2, magazine);
		lib.addItem(3, magazine2);
		lib.addItem(4, magazine3);
		
		lib.printLibrary();// ������ ����������
		//System.out.println(lib.Size()); 
	}

}
