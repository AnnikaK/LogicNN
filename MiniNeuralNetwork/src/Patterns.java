import java.util.HashMap;

public class Patterns {
	
	private HashMap<Integer,Integer> xor = new HashMap<Integer,Integer>();
	private HashMap<Integer,Integer> or = new HashMap<Integer,Integer>();
	private HashMap<Integer,Integer> and = new HashMap<Integer,Integer>();
	private HashMap<Integer,Integer> implies = new HashMap<Integer,Integer>();
	private HashMap<Integer,Integer> equivalence = new HashMap<Integer,Integer>();
	
	
	public Patterns() {
		initXOR();
		initOR();
		initAND();
		initIMPLIES();
		initEQUIVALENCE();
	}
	
	
	
	public void initXOR() {
		xor.put(10, 1);
		xor.put(01, 1);
		xor.put(11, 0);
		xor.put(00, 0);
		
	}
	
	public void initOR() {
		or.put(10, 1);
		or.put(01, 1);
		or.put(11, 1);
		or.put(00, 0);
		
	}
	
	public void initAND() {
		and.put(10, 0);
		and.put(01, 0);
		and.put(11, 1);
		and.put(00, 0);
		
	}
	
	public void initIMPLIES() {
		implies.put(10, 0);
		implies.put(01, 1);
		implies.put(11, 1);
		implies.put(00, 1);
		
	}
	
	public void initEQUIVALENCE() {
		equivalence.put(10, 0);
		equivalence.put(01, 0);
		equivalence.put(11, 1);
		equivalence.put(00, 1);
		
		
	}
	


	public HashMap<Integer, Integer> getXor() {
		return xor;
	}



	public HashMap<Integer, Integer> getOr() {
		return or;
	}



	public HashMap<Integer, Integer> getAnd() {
		return and;
	}



	public HashMap<Integer, Integer> getImplies() {
		return implies;
	}



	public HashMap<Integer, Integer> getEquivalence() {
		return equivalence;
	}



}
