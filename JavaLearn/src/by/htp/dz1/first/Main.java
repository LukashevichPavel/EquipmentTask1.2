package by.htp.dz1.first;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a=0, b=0, c=0, sum=0, max=0, indexI=0, indexJ=0, i=0, j=0, size=0; 
		boolean q=true;
		String z="",option="";
		
		Scanner sc = new  Scanner(System.in);
		Scanner sc2 = new  Scanner(System.in);
		System.out.print("������� ����� �������, �� 1 �� 14: ");
		switch (sc.nextInt()){
	
		case 1:{//Zadanie 1:
			System.out.println("�������: �������� ���������� ����������, ������� ������� �� ����� ������� �Hello World!�");
			System.out.println("");
			System.out.println("Hello world");
			break;}
	
		case 2:{//Zadanie 2:
			System.out.println("�������: ����������� �� ������ ��� ���. �������, ��� � �������� ������ ���������� �� ������ �������.");
			System.out.println("");
			System.out.println("Lukashevich");
			System.out.println("Pavel");
			System.out.println("Mikhailovich");
			break;}
		
		case 3:{//Zadanie 3:
			System.out.println("�������: �������� ���������, ������� ����� ���������� 2 ����� ���� int � �������� ��������� �� �����.");
			System.out.println("");
			System.out.println("������ ������� � � b c ����������? (�������� yes ����� ������ ����, ����� ����� ������� a = 6, b = 7)");
			option=sc2.nextLine();
			if (option.equals("yes")){
				System.out.print("a = ");
				a=sc.nextInt();
				System.out.println("");
				System.out.print("b = ");
				b=sc.nextInt();
				System.out.println("");
				sum = a + b;
				System.out.println("a + b = " + sum);
			}
			else{
				a=6; b=7; sum=a+b;
				System.out.println("a + b = " + sum);	
			} 
				
			break;}
		
		case 4:{//Zadanie 4:
			System.out.println("�������: ��������������� ������ 3 ��������� �������: ��������� ����������� � ���������� ���� ���� ����� ����� � ���� �������������� ��������.");
			System.out.println("��������� ��������� �������������� �������� ��� ��������� ������� � ��������� ������� �� �����. ");
			System.out.println("");
			System.out.print("a = ");
			a=sc.nextInt();	
			System.out.println("");
			System.out.print("b = ");
			b=sc.nextInt();	
			System.out.println("");
			System.out.print("������� ���� �������� (+,-,*,/): ");
			z=sc2.nextLine();
			switch(z){
				case "+":{System.out.println("a + b = "+(a+b)); break;}
				case "-":{System.out.println("a - b = "+(a-b)); break;}
				case "/":{System.out.println("a / b = "+(a/b)); break;}
				case "*":{System.out.println("a * b = "+(a*b)); break;}
				default:{System.out.print("������ ������������ ���� ��������");}
				}
			break;}
		
		case 5:{//Zadanie 5:
			System.out.println("�������: ������ � ���������� ����� �� 0 �� 9. ��������� ������ ������� �������� �����.");
			System.out.println("������� ����� �� 0 �� 9 ");
			a=sc.nextInt();	
			switch (a){
				case 0:{System.out.println("����"); break;}
				case 1:{System.out.println("����"); break;}
				case 2:{System.out.println("���"); break;}
				case 3:{System.out.println("���"); break;}
				case 4:{System.out.println("������"); break;}
				case 5:{System.out.println("����"); break;}
				case 6:{System.out.println("�����"); break;}
				case 7:{System.out.println("����"); break;}
				case 8:{System.out.println("������"); break;}
				case 9:{System.out.println("������"); break;}
				default:{System.out.print("������� ����� ������ 0 ��� ������ 9 ");}
				}
			break;}
		
		case 6:{//Zadanie 6: 	
			System.out.println("�������: ������ � ���������� ����� �� 0 �� 9. ���������� �������� �� �������� ����� ������.");
			System.out.println("������� ����� �� 0 �� 9 ");
			a=sc.nextInt();	
			if (a%2==0) {System.out.println("����� ������");} //���� ������� �� ������� �� 2 ����� 0 ������ ����� ������ 
			else {System.out.println("����� ��������");}
			break;}
		
		case 7:{//Zadanie 7: 		
			System.out.println("�������: ������ � ���������� ����� �� -9 �� 9. ���������� �������� �� �������� ����� ������ �������������.");
			System.out.println("������� ����� �� -9 �� 9 ");
			a=sc.nextInt();	
			if (a>0){System.out.println("����� �������������");}
			if (a<0){System.out.println("����� �������������");}
			if (a==0){System.out.println("����� ����� 0");}	
			break;}
		
		case 8:{
			//Zadanie 8: 
			System.out.println("�������: ������ � ���������� ������ �������� ������. ����������, � ������ ������ ���� ��������� ������ �����.");
			System.out.print("������� ������ �������� ������ (january,february,march,april,may,june,july,august,september,october,november,december): ");
			z=sc2.nextLine();	
			System.out.println(z);
			if ((z.equals("january"))||(z.equals("february"))||(z.equals("december"))){System.out.println("����� ����");}
			if ((z.equals("march"))||(z.equals("april"))||(z.equals("may"))){System.out.println("����� �����");}
			if ((z.equals("june"))||(z.equals("july"))||(z.equals("august"))){System.out.println("����� ����");}
			if ((z.equals("september"))||(z.equals("october"))||(z.equals("november"))){System.out.println("����� �����");}
			break;}
		
		case 9:{//Zadanie 9: 	
			System.out.println("�������: ��������� ����� ����� �� 0 �� 100.");
			sum = 0;
			for (i=0; i<=100; i++) sum = sum + i;
			System.out.println("����� ����� �� 0 �� 100 = " + sum);	
			break;}
		
		case 10:{//Zadanie 10: 			
			System.out.println("�������: �������� ��������� ���������� ����� �������� � �������� �� 3� �����.");
			System.out.print("a = ");
			a = sc.nextInt();
			System.out.print("b = ");
			b = sc.nextInt();
			System.out.print("c = ");
			c = sc.nextInt();
			if ((a>b)&&(a<c)||((a<b)&&(a>c))){System.out.println("����� ����������� � ����������� = "+(b+c));}
			if ((b>a)&&(b<c)||((b<a)&&(b>c))){System.out.println("����� ����������� � ����������� = "+(a+c));}
			if ((c>b)&&(c<a)||((c<b)&&(c>a))){System.out.println("����� ����������� � ����������� = "+(a+b));}
			if (a==b){System.out.println("����� ����������� � ����������� = "+(a+c));}
			else {
				if (a==c){System.out.println("����� ����������� � ����������� = "+(a+b));}
				else {
					if (c==b){System.out.println("����� ����������� � ����������� = "+(a+c));}
					}
				}
			break;}
		
		case 11:{//Zadanie 11:
			System.out.println("�������: ��������� ����������� ���� ��������, �� ��� ���, ���� ������������ �� ����� ������ �q�.");
			while (q){
				System.out.print("������� ������: ");
				z=sc2.nextLine();
				if (z.equals("q")) {q=false;}
				}
			System.out.println("������ ������ q");
			break;}
		
		case 12:{//Zadanie 12:	
			System.out.println("�������: ��������� ����������� ���� ����� ������. ���������� ���� �� ��� ���, ���� �� ����� ������� ����� �stop�.");
			q=true;
			while (q){
				System.out.print("������� ������: ");
				z=sc2.nextLine();
				if (z.equals("stop")) {q=false;}
				}
			System.out.println("������� ������ stop");
			break;}
		
		case 13:{
			System.out.println("�������: ����� ������������ ������� ������� � ������� �� ������� ��� ������ � �������, ��� ����������.");
			size=0; max=0;
			System.out.print("������� ��� ������� ����� ����������, �� ���� ����� ����� ����� ����� ��������. ������� ����������� �������: ");
			size=sc.nextInt();
			int[][] matrix= new int [size][size];
			for (i=0;i<size; i++){
				for (j=0;j<size; j++) matrix[i][j]=(int)(Math.random()*10); //��������� ������� ���������� �������	
				}
			max=matrix[0][0];
			for (i=0;i<size; i++)
				for (j=0;j<size; j++) 
					if (matrix[i][j]>max) {
					max = matrix[i][j];
					indexI=i;
					indexJ=j;
					}
			//������� ������� �� �����
			for (i=0;i<size; i++){
				for (j=0;j<size; j++)System.out.print(matrix[i][j]+" ");
				System.out.println("");
			}
			
			System.out.println("������������ ������� = matrix["+indexI+"]["+indexJ+"] = " + max);
			
			
			System.out.println("��� ������ ��� �� ������");
		break;}
		
		case 14:{//Zadanie 14:	
			System.out.println("�������: ������ ��� ������. ��������� ����������� ������ �������, ������������ ������ ������ � ����������.");
			System.out.println("����� ��������� ����������� ���� ��������� �������. ������������ ������ �������� � ����������.");
			System.out.println("��������� ������ ��������� ����� ��������� �� ��������� �������.");
			System.out.println("");
			size=0; 
			System.out.print("������� ��� ������� ����� ����������, �� ���� ����� ����� ����� ����� ��������. ������� ����������� �������: ");
			size=sc.nextInt();
			int[][] matrix= new int [size][size];
			System.out.print("�������� auto ����� ��������� ������� ���������� �������, ����� �������� ������ ���� ");
			option=sc2.nextLine();
			if (option.equals("auto")){
				System.out.println("������ �������������� �����, ������� ����� ��������� ���������� �������");
			for (i=0;i<size; i++){
				for (j=0;j<size; j++) matrix[i][j]=(int)(Math.random()*10); //��������� ������� ���������� �������	
				}
			}
			else {
				System.out.println("������ ������ �����");
				for (i=0;i<size; i++){
					for (j=0;j<size; j++){
						System.out.print("������� ������� ["+i+"]["+j+"] = ");//������ �������� �������
						matrix[i][j]=sc.nextInt();
					}
					System.out.println("");
					}
			}
			//������� ������� �� �����
			for (i=0;i<size; i++){
				for (j=0;j<size; j++)System.out.print(matrix[i][j]+" ");
				System.out.println("");
			}
			//������� ����� ��������� �� ���������
			sum=0;
			for (i=0;i<size; i++){sum=sum+matrix[i][i];}
			System.out.println("����� ��������� ����������� �� ��������� = " + sum);
			break;}
		}
		System.out.println("");
		System.out.println("��������� ���������");	
		sc.close();
		sc2.close();
	}	
	
}
