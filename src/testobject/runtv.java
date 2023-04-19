package testobject;

public class runtv {

	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV();
		
		t1.setChannel(7);
		t1.setColor("Silver");
		t1.setPrice(1000000);
		t1.setProducer("LG전자");
		t1.setSize(70);
		
		t2.setChannel(0);
		t2.setColor("Black");
		t2.setPrice(700000);
		t2.setProducer("삼성전자");
		t2.setSize(60);
		
		t1.powerOn();
		t1.upChannel();
		t1.downChannel();
		t1.powerOff();
		
		t2.powerOn();
		t2.upChannel();
		t2.downChannel();
		t2.powerOff();
	}

}
