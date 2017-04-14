package by.htp.dz2.biblioteka;

public class Library {
	private PrintedEdition lib[]; //��������� ������ �������� ������ �������� ������� 
	private int size; //���������� ������������ ����������� ������ �������
	private int index; //���������� ��� ���������� ��������� �������

	
	public Library(int size){ //����������� ������ ����������. ������� �������� ���������� ������ ������������  ������� 
		lib = new PrintedEdition[size]; //������� ������ lib � ������� ����� �������� �������; 
		this.size=size;
		this.index = 0;	//������ ��������� �������� ������� ��� ����� �������
			//this.type = type;
			}
			
	public void addItem(int index, PrintedEdition printedEdition){//���������� ��������� ������� � ������ 
		this.lib[index]=printedEdition;
		}
	
	public PrintedEdition getItem(int index){//���������� �������� ������� ����������� � ������� � ������� index
		return(this.lib[index]);
		}
	public void printLibrary (){//������� ��� ����������
		for (int i=0; i<this.size; i++){
			System.out.print(this.lib[i].getType()+" * ");
			System.out.print(this.lib[i].getTitle()+" * ");
			System.out.println(this.lib[i].getPrice()+" * ");
			
			}
	}

	public int Size(){ //���������� ������ ����������
		return size;
	}

	}
