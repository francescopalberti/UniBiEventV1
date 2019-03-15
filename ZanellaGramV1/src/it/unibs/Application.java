package it.unibs;

import java.util.Arrays;

public class Application {

	private static final int TITOLO=0;
	private static final int NUMERO_PARTECIPANTI=1;
	private static final int TERMINE_ISCRIZIONI=2;
	private static final int LUOGO=3;
	private static final int DATA=4;
	private static final int ORA=5;
	private static final int DURATA=6;
	private static final int QUOTA=7;
	private static final int COMPRESO_IN_QUOTA=8;
	private static final int DATA_CONCLUSIVA=9;
	private static final int ORA_CONCLUSIVA=10;
	private static final int NOTE=11;
	
	private static final int GENERE=12;
	private static final int FASCIA_DI_ETA=13;
	
	private String[] categorie = {"Partite di calcio"};
	private Campo[] campi;
	
	public Application() {
		initObjects();
	}
	
	private void initObjects() {
		campi = new Campo[14];
		assegnaPartitaDiCalcio();
	}
	
	public void runApplication() {
		vediCategorie();
		PartitaDiCalcio unaPartita = new PartitaDiCalcio(Arrays.copyOfRange(campi, 0, 11), Arrays.copyOfRange(campi, 12, 13));
		System.out.print(unaPartita);
	}
	
	public void assegnaCampiBase() 
	{
		campi[TITOLO]= new Campo<String>("Titolo","Titolo dell'evento",false);
		campi[NUMERO_PARTECIPANTI]=new Campo<Integer>("Numero partecipanti","Indica il numero massimo di partecipanti",true);
		campi[TERMINE_ISCRIZIONI]=new Campo<Data>("Data termine iscrizione","Indica la data limite entro cui iscriversi",true);
		campi[LUOGO]=new Campo<String>("Luogo","Indica il luogo dell'evento",true);
		campi[DATA]=new Campo<Data>("Data","Indica la data di svolgimento dell'evento",true);
		campi[ORA]=new Campo<Ora>("Ora","Indica l'ora di inizio dell'evento",true);
		campi[DURATA]=new Campo<Ora>("Durata","Indica la durata dell'evento",false);
		campi[QUOTA]=new Campo<Integer>("Quota iscrizione","Indica la spesa da sostenere per partecipare all'evento",true);
		campi[COMPRESO_IN_QUOTA]=new Campo<String>("Compreso in quota","Indica le voci di spesa comprese nella quota",false);
		campi[DATA_CONCLUSIVA]=new Campo<Data>("Data conclusiva","Indica la data di conclusione dell'evento",false);
		campi[ORA_CONCLUSIVA]=new Campo<Ora>("Ora conclusiva","Indica l'ora conclusiva dell'evento",false);
		campi[NOTE]=new Campo<String>("Note","Informazioni aggiuntive",false);		
	}
	
	public void assegnaPartitaDiCalcio() {
		assegnaCampiBase();
		campi[GENERE]=new Campo<String>("Genere","Indica il genere dei giocatori",true);
		campi[FASCIA_DI_ETA]=new Campo<FasciaDiEta>("Fascia di età","Indica la fascia di età dei giocatori",true);
		
	}
	
	public void vediCategorie() {
		for (int i = 0; i < categorie.length; i++) {
			System.out.println(i+1 + ") " + categorie[i]);
		}
	}
}
