package by.htp.dz5.guitar;

public class Struna {
private String produce;	//������������� (DadDario, Sonata, Ernie, Elixir)
private String type; //��� ������ (��� �������������, ������������� ������, ���� ������)
private String note; //���� 
private int accuracy; //������������ ��������� ����, �� ���� ������������� 100 - ���������, 0 - ��������� �� ������������� 
private String material; //�������� ������ (Metal, Neylon, Silver,Bronze, Phosphor-bronze)
private double iznos; //����� ������

public Struna (String produce, String type, String note,int accuracy, String material, double iznos){
	this.produce=produce;
	this.type=type;
	this.note=note;
	this.accuracy=accuracy;
	this.material=material;
	this.iznos=iznos;
}

public int getAccuracy() {
	return accuracy;
}

public void setAccuracy(int accuracy) {
	this.accuracy = accuracy;
}

public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public double getIznos() {
	return iznos;
}
public void setIznos(double iznos) {
	this.iznos = iznos;
}
@Override
public String toString() {
	return " [�������������]:" + produce + ", [���]:" + type + ", [��������]:" + material + ", [����]:" + note + "[�������������]" + accuracy + ", [�����]:"
			+ iznos;
}




}