package by.htp.dz4.massiv.entity;

public class Massiv {
private Element[] mas; 
private int size;
private int nElement;

public Massiv(int size){
mas = new Element[size];
nElement=0;
}	

public int Size(){
	return size;
}

public void addItem (int i, int val){ //����� ������� ��������� ������� � ������
mas[nElement] = new Element(i,val);
nElement++;
}

public int getItem (int i){ //����� ������� ���������� �������� i -�� ��������
return mas[i].getElement();
}

public void setItem (int i, int count){ //����� ������� �������� �������� i -�� �������� �� ��������� �������� count
mas[i].setElement(i,count);
}



public void masPrint(){
	for (int i=0; i<nElement; i++){ //����� ������� �������� ������ 
		mas[i].printElement();
	}
}

public int maxItem(){ //����� ������� ���������� ������ ������������� �������� � �������
	int max=0;
	int index=0;
	for (int i=0; i<nElement; i++){
		if (mas[i].getElement() > max) {max = mas[i].getElement(); index = i;}
	}
	return index;
}

public int minItem(){ //����� ������� ���������� ������ ������������� �������� � �������
	int min=mas[0].getElement();
	int index=0;
	for (int i=0; i<nElement; i++){
		if (mas[i].getElement() < min) {min = mas[i].getElement(); index = i;}
	}
	return index;
}

public boolean isEmpty(){
//����� ����������� �� ������ �� ������
	boolean b=true;
	if (nElement==0) b=false;
	return b;
}


public Massiv copyMas(Massiv mas){
//������ ����� ��� ����������� ������� 
	Massiv masNew;
	size=nElement;
	masNew = new Massiv(size);
	for (int i=0; i<size;i++) masNew.addItem(i, mas.getItem(i));  
	return masNew;
}

public Sorted convertMas(Massiv mas){ 
//����������� ������ ������ Massiv � ������ ������ Sorted ��� ����������� ����������, ����� ��������� ������ ��������� ���������� 
	Sorted masNew;
	size=nElement;
	masNew = new Sorted(size);
	for (int i=0; i<size;i++) masNew.add(mas.getItem(i));  
	return masNew;
}


}
