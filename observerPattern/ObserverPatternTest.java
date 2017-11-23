package mytest.myexample.designpattern.observerPattern;


public class ObserverPatternTest {

	public static void main(String[] args) {
	
		JorunalismGoAhead jorunalismGoAhead = new JorunalismGoAhead();
		
		Observer gurgaonPrintingPress_1 = new GurgaonPrintingPress("GurgaonPrintingPress_1");
		Observer gurgaonPrintingPress_2 = new GurgaonPrintingPress("GurgaonPrintingPress_2");
		Observer gurgaonPrintingPress_3 = new GurgaonPrintingPress("GurgaonPrintingPress_3");
		Observer noidaPrintingPress_1 = new NoidaPrintingPress("NoidaPrintingPress_1");
		Observer noidaPrintingPress_2 = new NoidaPrintingPress("NoidaPrintingPress_2");
		Observer noidaPrintingPress_3 = new NoidaPrintingPress("NoidaPrintingPress_3");
		Observer delhiPrintingPress_1 = new NoidaPrintingPress("DelhiPrintingPress_1");
		Observer delhiPrintingPress_2 = new NoidaPrintingPress("DelhiPrintingPress_2");
		Observer delhiPrintingPress_3 = new NoidaPrintingPress("DelhiPrintingPress_3");
		
		//registering observers to the subject
		jorunalismGoAhead.register(gurgaonPrintingPress_1);
		jorunalismGoAhead.register(gurgaonPrintingPress_2);
		jorunalismGoAhead.register(gurgaonPrintingPress_3);
		jorunalismGoAhead.register(noidaPrintingPress_1);
		jorunalismGoAhead.register(noidaPrintingPress_2);
		jorunalismGoAhead.register(noidaPrintingPress_3);
		jorunalismGoAhead.register(delhiPrintingPress_1);
		jorunalismGoAhead.register(delhiPrintingPress_2);
		jorunalismGoAhead.register(delhiPrintingPress_3);
		
		//attaching observer to the subject
		gurgaonPrintingPress_1.setSubject(jorunalismGoAhead);
		gurgaonPrintingPress_2.setSubject(jorunalismGoAhead);
		gurgaonPrintingPress_3.setSubject(jorunalismGoAhead);
		noidaPrintingPress_1.setSubject(jorunalismGoAhead);
		noidaPrintingPress_2.setSubject(jorunalismGoAhead);
		noidaPrintingPress_3.setSubject(jorunalismGoAhead);
		delhiPrintingPress_1.setSubject(jorunalismGoAhead);
		delhiPrintingPress_2.setSubject(jorunalismGoAhead);
		delhiPrintingPress_3.setSubject(jorunalismGoAhead);
		
		//check if any update is available
		gurgaonPrintingPress_1.update();
		jorunalismGoAhead.postMessage("Approval from Journalism is done, So printing started in different regions");
	}

}
