package AbstractionConept;

public class TestBank {

	public static void main(String[] args) {
		HDFC hb=new HDFC();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		
		    Bank b=new HDFC();
		    b.credit();
		    b.debit();
		    b.loan();
		    
		

	}

}
