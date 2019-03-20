package it.unibs;

public class PartitaDiCalcio extends Categoria {
	
	private static final String descrizione = "Descrizione: Una partita di calcio";
	private static final String nome = "Nome: Partita di Calcio";
	private Campo[] campiSpecifici;
	
	private static final String lineSeparator="\n";

	public PartitaDiCalcio(Campo[] _campiGenerici, Campo[] _campiSpecifici) {
		super(nome, descrizione, _campiGenerici);
		campiSpecifici = _campiSpecifici;
	}

	public Campo[] getCampiSpecifici() {
		return campiSpecifici;
	}
	
	
	public String getDescrizioneCampi()
	{
		StringBuffer s = new StringBuffer();
		s.append(super.getDescrizioneCampi());
		for(int j=0; j<campiSpecifici.length; j++) {
			s.append("   " + campiSpecifici[j].toString());
			s.append(lineSeparator);
		}
		return s.toString();
	}	

}
