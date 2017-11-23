package mytest.myexample.designpattern.observerPattern;


public class GurgaonPrintingPress implements Observer {
	
	private String name;
	private Subject topic;
	
	public GurgaonPrintingPress(String name){
		this.name=name;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No approval yet");
		}else
			System.out.println(name+"::Action taken :: Printing started @ " + name );
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic=sub;
	}
	
	

}