package day01;

public class List {
	int data;
	List next;
	List(int data){
		this.data=data;
	}
	static void show(List head) {
		if(head==null) {
			return;
		}
		List temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List n1=new List(10);
		List n2=new List(20);
		List n3=new List(30);
		
		List head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=null;
		show(head);

	}

}
