package it.unibs;

public class Categoria {
	
	private static final String lineSeparator="\n";
	
	private String nome;
	private String descrizione;
	private Campo[] campiBase;
	
	
	public Categoria(String _nome, String _descrizione, Campo[] _campiBase) {
		campiBase = new Campo[12];
		campiBase = _campiBase;
		nome=_nome;
		descrizione=_descrizione;
	}

	public String getNome() {
		return nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	
	public Campo[] getCampiBase() {
		return campiBase;
	}
	
	public String getDescrizioneCampi() {
		StringBuffer s = new StringBuffer();
		for(int i=0; i < campiBase.length; i++) { 
			s.append("   " + campiBase[i].toString());
			s.append(lineSeparator);
		}
		return s.toString();
		
	}
	
	public String toString() {
		
		String S= nome + "\n" + descrizione + "\n" + getDescrizioneCampi();
		
		return S;
	}
	
	
}
