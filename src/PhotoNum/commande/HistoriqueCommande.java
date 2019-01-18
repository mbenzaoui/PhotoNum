package PhotoNum.commande;

public class HistoriqueCommande extends Commande {

	public HistoriqueCommande(int id, String date, ModeLivraison modeLiv, float prix, boolean paye) {
		super(id, date, modeLiv, prix, null, paye);
	}
	
	public HistoriqueCommande(Commande cmd ) {
		super(cmd.getId(),cmd.getDate(), cmd.getModeLivraison(), cmd.getPrixTotale(), null, cmd.estPaye());
	}

}
