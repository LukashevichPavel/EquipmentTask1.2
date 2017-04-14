package by.htp.dz5.autosalon;
import java.io.*;
public class Main {

	public static void main(String[] args)throws Exception {
/*		
System.out.println("�������: �87, ������� �, ������������ �8 Car");
System.out.println("1.������� ������ � ������������ �� �������������.");
System.out.println("2.���������� ������������ � ������ Set/Get, toString");
System.out.println("3.���������� ������������� ������ � ������, ��������� ������ ��������.");
System.out.println("������ �������� ������ ������ � ������� ��� ������ �� �������.");
System.out.println("� ������ ������, ���������� �����������, ������ ���� ��������� ��������� �������������.");
System.out.println("������������ Car: id, �����, ������, ��� �������, ����, ����, ��������������� �����.");
System.out.println("������� ������ ��������. �������:");
System.out.println("(a) ������ ����������� �������� �����;");
System.out.println("(b) ������ ����������� �������� ������, ������� ��������������� ������ n ���;");
System.out.println("(c) ������ ����������� ��������� ���� �������, ���� ������� ������ ���������.");
System.out.println("");
*/

boolean in=true, out=true, in2=true;
Auto [] salonBase= new Auto[11];//���������� ����������
Auto [] salonBaseTemp= new Auto[11];
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
System.out.println("������ ������ ���������");
while (out){
System.out.println("������� ����� ������� ������������� ������� ������ ���� (1,2,3,4,5,6,7)");
System.out.println("����:1.������� ������ ���� 2.������� ������ ���� 3.������� ��� ���� 4.����� ���� 5.���������� 6.��������� ������� ���� ���� 7.�����");
String s=reader.readLine();
if (tryParseInt(s)==null){ s="default";}
else{
int option = Integer.parseInt(s);
switch (option){
	case 1:{//���������� ������ ��������
		in = true;
		while (in){
			int s0=0; 
			if (salonBase[0]==null) s0=1;
			else {
				for (int i=0; i<salonBase.length;i++) 
					if (salonBase[i]==null) s0=i+1; 
			}
			
			System.out.print("������� ����� ����������: ");
			String s1=reader.readLine();
			System.out.print("������: ");
			String s2=reader.readLine();
			System.out.print("��� �������: ");
			int s3=Integer.parseInt(reader.readLine());
			System.out.print("����: ");
			String s4=reader.readLine();
			System.out.print("����: ");
			int s5=Integer.parseInt(reader.readLine());
			System.out.print("��������������� �����: ");
			String s6=reader.readLine();
			Auto autoTemp = new Auto(s0,s1,s2,s3,s4,s5,s6);
			System.out.println("�� �����: "); 
			autoTemp.printAuto(); 
			System.out.print("�������� � ���� ����������? (yes - ��������, ����� �����): ");
			String option2=reader.readLine();
			if (option2.equals("yes")){
			    
				Auto salonBaseTemp2[] = new Auto[s0+1];
			    for (int i=0; i<s0;i++) salonBaseTemp2[i]=salonBase[i]; //�������� ������ ������ � ����� 
			    salonBaseTemp2[s0-1]=autoTemp;
			    salonBase=salonBaseTemp2;
				System.out.println("������ ���������");
				System.out.print("�������� ��������� ������? (yes - ��������, ����� ���� ������������) ");
				option2=reader.readLine();
				if (!option2.equals("yes")) in=false; 
			}
			else {
				System.out.print("��������� ���� ������? (yes - ������, ����� ���� ������������)");
				option2=reader.readLine();
				if (!option2.equals("yes")) in=false; 
			}
		}
		
	break;}
	case 2:{
		in2=true;
		if (salonBase[0]==null) {System.out.println("���� ������ �����"); break;}
		else{
			int count=0;
					for (int i=0; i<salonBase.length;i++) if (salonBase[i]!=null) count++;//������������ �� ������ �������� � �������
					System.out.println("� ���� ������� " + count + " �������");
					for (int i=0; i<salonBase.length;i++) if (salonBase[i]!=null)salonBase[i].printAuto();
					System.out.println("");
			System.out.println("������� id ������ ������� �� ������ �������: ");
			while (in2){
			String option3=reader.readLine();
			if (option3.equals("q")) in2=false;
			if (option3.equals("print")) {}
			if (tryParseInt(option3)==null){System.out.println("������ ������� �����������, ������� id ������ ������� ������� �������, print ��� ���������� ������ ���� ���� ��� q ��� ������");}
			else{ 
				//for (int i=0; i<salonBase.length;i++) if (salonBase[i].getId()==Integer.parseInt(option3)){//���� id �������� ������� ������� �������
					
				//}
				}
			
			}
		
		}
		
		break;}
	case 3:{//����� ���� ����
		if (salonBase[0]==null) System.out.println("���� ������ �����");
		else {
			int count=0;
			for (int i=0; i<salonBase.length;i++) if (salonBase[i]!=null) count++;//������������ �� ������ �������� � �������
			System.out.println("� ���� ������� " + count + " �������");
			for (int i=0; i<salonBase.length;i++) if (salonBase[i]!=null)salonBase[i].printAuto();
			System.out.println("");
			}
		break;
		}
	case 4:{
		if (salonBase[0]==null) System.out.println("���� ������ �����");
		else {
			boolean in3=true;
			while (in3){
				System.out.println("1.������� ��� ����");
				System.out.println("2.����� ���� �� �����");
				System.out.println("3.����� ���� �� ������, ������� ��������������� ������ n ���");
				System.out.println("4.C����� ����������� ��������� ���� �������, ���� ������� ������ ���������");
				System.out.println("5.����� �� ������");
				int option4=Integer.parseInt(reader.readLine());
				switch (option4){
					case 1:{//����� ���� ����
						int count=0;
						for (int i=0; i<salonBase.length;i++) if (salonBase[i]!=null) count++;//������������ �� ������ �������� � �������
						System.out.println("� ���� ������� " + count + " �������");
						for (int i=0; i<salonBase.length;i++) if (salonBase[i]!=null)salonBase[i].printAuto();
						System.out.println("");
						break;
					}
					case 2:{//����� ��� ���� ������������ �����
					System.out.print("�� ������� ����� �� �����. ������� ����� ������� ����� ������: ");
					String option5=reader.readLine();
					for (int i=0; i<salonBase.length;i++) if ((salonBase[i]!=null)&&(salonBase[i].getMarka().equals(option5))) salonBase[i].printAuto();
					break;
					}
					case 3:{//����� ���� �� ������, ������� ��������������� ������ n ���
					System.out.println("�� ������� ����� �� ������ ������� ��������������� ������ n ���");
					System.out.print("������� ������: ");
					String option6=reader.readLine();
					System.out.print("������� ���������� ���: ");
					int option7=Integer.parseInt(reader.readLine());
					int temp=0;
					for (int i=0; i<salonBase.length;i++) if ((salonBase[i]!=null)&&(salonBase[i].getModel().equals(option6))&&(2017-salonBase[i].getYear()>option7)) {
						salonBase[i].printAuto();
						temp++; 
					}
					if (temp>0) System.out.println("�� �������� ���������� ������� "+temp+" �������");
					else System.out.println("�� �������� ���������� ������� �� �������");
					break;
					}
					case 4:{//C����� ����������� ��������� ���� �������, ���� ������� ������ ���������"
						System.out.println("�� ������� ����� �� ���� �� ���� ������� ���� ������� ������ ���������?");
						System.out.print("������� ������: ");
					}
					
					case 5:{
						in3=false; 
						break;
					}
					default:{
						System.out.println("�������� ���� �� ������� ��� ������� 6 ��� ������ � ���������� ����");
					}
				}
			}
		}
		
		break;}
	case 5:{break;}
	case 6:{
		System.out.println("���� ������ ������� � ������������, ������� 10 ����");
		Auto auto1 = new Auto (1,"Hyundai","Solaris",2014,"Gray",12500,"7435 ��-7");
		Auto auto2 = new Auto (2,"Hyundai","SantaFe",2015,"Black",31200,"7777 ��-7");
		Auto auto3 = new Auto (3,"Hyundai","Ix 35",2015,"Red",18700,"5435 ��-7");
		Auto auto4 = new Auto (4,"Opel","Insignia",2012,"Gray",15500,"6633 IP-7");
		Auto auto5 = new Auto (5,"Opel","Vectra",2010,"Blue",9500,"8835 OM-5");
		Auto auto6 = new Auto (6,"Opel","Astra",1997,"Blue",1000,"2754 OM-7");
		Auto auto7 = new Auto (7,"Mersedes","ML-350",2001,"Silver",32500,"6112 OC-7");
		Auto auto8 = new Auto (8,"Lamborgini","Diablo",2001,"Red",682500,"7777 ��-7");
		Auto auto9 = new Auto (9,"Lada","Vesta",2015,"Black",12500,"1111 OC-7");
		Auto auto10 = new Auto (10,"Shefrolet","Niva",2003,"Green",10000,"8812 OC-7");
			salonBaseTemp[0] = auto1;
			salonBaseTemp[1] = auto2;
			salonBaseTemp[2] = auto3;
			salonBaseTemp[3] = auto4;
			salonBaseTemp[4] = auto5;
			salonBaseTemp[5] = auto6;
			salonBaseTemp[6] = auto7;
			salonBaseTemp[7] = auto8;
			salonBaseTemp[8] = auto9;
			salonBaseTemp[9] = auto10;
			salonBaseTemp[10] = null;
			salonBase=salonBaseTemp;
			
		
		for (int i=0; i<salonBase.length-1;i++) salonBase[i].printAuto();
		System.out.println("");
		break;
	}
	case 7:{
		out=false;
		System.out.println("������ ��������� ���������");
		break;
	}
	default:{System.out.println("������� ����� ������ ����, ������� ����� ��������� (1,2,3,4,5,6,7)");}
}
}
}






	}
	public static Integer tryParseInt(String s) {
	    try {
	        return new Integer(s);
	    } catch (NumberFormatException e) {
	        return null; // ��-�, �� int
	    }
	}
}
