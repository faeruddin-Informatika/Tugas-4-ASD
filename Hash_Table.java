import java.util.Enumeration;
import java.util.Hashtable;

public class Hash_Table {

	public static void main(String[] args) {
		  // Create a hash map
	      Hashtable balance = new Hashtable();
	      Enumeration names;
	      String str;
	      double bal;

	      balance.put("Dabo", new Double(2222.44));
	      balance.put("Manzer", new Double(567.40));
	      balance.put("Dadu", new Double(2341.10));
	      balance.put("Isla", new Double(82.80));
	      balance.put("Qian", new Double(-12.28));

	      // Show all balances in hash table.
	      names = balance.keys();
	      while(names.hasMoreElements()) {
	         str = (String) names.nextElement();
	         System.out.println(str + ": " +
	         balance.get(str));
	      }
	      System.out.println();
	      // Deposit 1,000 into Zara's account
	      bal = ((Double)balance.get("Dabo")).doubleValue();
	      balance.put("Dabo", new Double(bal+1000));
	      System.out.println("Dabo's new balance: " +
	      balance.get("Dabo"));
	   }
	    
	

	}


