package xxx;

public class xxx {
	//�������
	//final double PI = 3.14;
	//private static final double PI = 3.14;
	//pirvate final double PI = 3.14;
	// �⺻������ ��ü ����!!!
	//�ʱ� ���� �ѷ��� ���̸� ����ϰ� ����غ���!!
	//inRadius
	//AreaCircle ���� ����
	//SizeofCircle ���� �ѷ�
	//���� �ѷ��� ���̰� ������1�� ������ ���� ��� ����ϱ�
	private final double PI = 3.14;
	private int radius = 1;
	
	public xxx() {
	}
	
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius() {
		this.radius = radius;
	}
	
	public void AreaCircle() {
		double area = getPI() * getRadius() * getRadius();
		System.out.println("���� ���̴� : " + area);
	}
	public void SizeofCircle() {
		double size = getRadius() * getPI() * 2; //������ * 2 * 3.14
		System.out.println("���� �ѷ��� : " + size);
	}
	public void inRadius() {
		radius++;
	}
}
