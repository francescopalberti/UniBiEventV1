package it.unibs;

public class Categoria {
	
	private static final String lineSeparator="\n";
	
	private String nome;
	private String descrizione;
	private Campo[] campiBase;
	
	
	public Categoria(String _nome, String _descrizione, Campo[] _campiBase) {
		campiBase = _campiBase;
		nome=_nome;
		descrizione=_descrizione;
	}

	public Campo[] getCampiBase() {
		return campiBase;
	}
	
	public String toString() {
		String S= nome + "\n" + descrizione + "\n" + getDescrizioneCampi();
		return S;
	}
	
	public String getDescrizioneCampi() {
		StringBuffer s = new StringBuffer();
		for(int i=0; i < campiBase.length; i++) { 
			s.append("   " + campiBase[i].toString());
			s.append(lineSeparator);
		}
		return s.toString();
	}
	
	public String getValoreCampi() {
		StringBuffer s = new StringBuffer();
		for(int i=0; i < campiBase.length; i++) { 
			s.append("   " + campiBase[i].toStringValore());
			s.append(lineSeparator);
		}
		return s.toString();
	}
}
