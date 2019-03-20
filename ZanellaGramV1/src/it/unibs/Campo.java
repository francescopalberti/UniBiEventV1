package it.unibs;

public class Campo<T>  {

	private String nome;
	private String descrizione;
	private boolean obbligatorietà;
	private T valore;
	
	public Campo(String _nome, String _descrizione, boolean _obbligatorietà){
		nome=_nome;
		descrizione=_descrizione;
		obbligatorietà=_obbligatorietà;
		valore=null;
	}

	public boolean isObbligatorio() {
		return obbligatorietà;
	}

	public void setObbligatorietà(boolean obbligatorietà) {
		this.obbligatorietà = obbligatorietà;
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
		if (obbligatorietà) {
			S = nome + "* : " + descrizione;
			}
		else {
			S = nome + " : " + descrizione;
		}
		return S;
	}
}
