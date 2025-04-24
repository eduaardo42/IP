package br.dev.eduardo.model;

public class Classeip {
	
	private String ip;
	private String classeip;
	private double mascara;
	
	public void setIp (String ip) {
		this.ip = ip;
	};
	public void getClasseIP (String classeip) {
		this.classeip = classeip;
		
	};
	
	public void setClasseIp (String classeip) {
		this.classeip = classeip;
	}
	
	public void setMascara (double mascara) {
		this.mascara = mascara;
	};
	
	public double getmascara () {
		return mascara;
	};
	
	
	public void definirClasseIp () {
		
		String primeirosnumeros = ip.substring(0, 3);
		int numerosiniciais = Integer.parseInt(primeirosnumeros);
		
		if ( numerosiniciais <= 127) {
			
			setClasseIp ("A");
			
		}
		else if ( numerosiniciais >= 128) {
			
			setClasseIp ("B");
			
		}
		else if ( numerosiniciais >= 192) {
			
			setClasseIp ("C");
			
		}
		
		
	}
	
	
}
