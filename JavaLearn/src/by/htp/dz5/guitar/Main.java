package by.htp.dz5.guitar;

public class Main {

	public static void main(String [] args) {
		System.out.println("�������  ������  ������ ������,  ���������  ����� ������, ����������.");
		System.out.println("������: ������, �����������, �������� ������.");
Struna [] komplektStrun; 
Struna str1= new Struna("DadDario", "Acustic", "E", 100 , "Silver", 100);  //������� ������ 
Struna str2= new Struna("DadDario", "Acustic", "A", 100 ,"Silver", 100);
Struna str3= new Struna("DadDario", "Acustic", "D", 99, "Silver", 100);
Struna str4= new Struna("DadDario", "Acustic", "G", 95, "Silver", 100);
Struna str5= new Struna("DadDario", "Acustic", "B", 98, "Silver", 100);
Struna str6= new Struna("DadDario", "Acustic", "E", 94, "Silver", 100);
komplektStrun = new Struna[6];//�������� �����
komplektStrun[0]=str1;
komplektStrun[1]=str2;
komplektStrun[2]=str3;
komplektStrun[3]=str4;
komplektStrun[4]=str5;
komplektStrun[5]=str6;
Skvorechnik baraban = new Skvorechnik("��� �������������", "�����", "������������");//������� �������
Guitar myClassicGuitar = new Guitar("Jay Turser", 6, "Acustic", baraban, komplektStrun);//������� ������
System.out.println(myClassicGuitar.toString());
System.out.println(baraban.toString());
myClassicGuitar.showStruns(); 
Struna str7= new Struna("Sonata", "Acustic", "D", 100, "Bronze", 100);	//������� ��� 1 ������ ��� ������
myClassicGuitar.changeStruns(3, str7);//������ 3 ������
System.out.println("");
myClassicGuitar.play(5,2); // ������ 5 ������ 2 ����
myClassicGuitar.play(1,1); // ������ 1 ������ 1 ���
myClassicGuitar.play(4,5); // ������ 4 ������ 5 ���
myClassicGuitar.play(2,3); // ������ 2 ������ 3 ����
myClassicGuitar.play(1,2); // ������ 1 ������ 2 ����
myClassicGuitar.showStruns();
myClassicGuitar.nastroika();//��������� ������
System.out.println("");
myClassicGuitar.showStruns();


	}

}
