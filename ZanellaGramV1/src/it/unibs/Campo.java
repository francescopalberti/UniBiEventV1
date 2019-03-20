package it.unibs;

public class Campo<T>  {

	private String nome;
	private String descrizione;
	private boolean obbligatoriet�;
	private T valore;
	
	public Campo(String _nome, String _descrizione, boolean _obbligatoriet�){
		nome=_nome;
		descrizione=_descrizione;
		obbligatoriet�=_obbligatoriet�;
		valore=null;
	}

	public boolean isObbligatorio() {
		return obbligatoriet�;
	}

	public void setObbligatoriet�(boolean obbligatoriet�) {
		this.obbligatoriet� = obbligatoriet�;
	}

	public T getValore() {
		return valore;
	}

	public void setValore(T valore) {
		this.valore = valore;
	}
	
	public String toStringValore() {
		return nome + ": " + valore;
	}
	
	public String toString() {
		String S;
		if (obbligatoriet�) {
			S = nome + "* : " + descrizione;
			}
		else {
			S = nome + " : " + descrizione;
		}
		return S;
	}
}
