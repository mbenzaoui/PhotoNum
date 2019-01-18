package PhotoNum.commande;

import java.util.ArrayList;

import PhotoNum.article.Article;

public class Commande {
	
	private int id ;
	private String date; // a changer en Date 
	private ModeLivraison modeLivraison ;
	private float prixTotale ;
	private StatusCmd status ;
	private boolean estPaye ;
	private ArrayList<Article> articles = new ArrayList<Article>();
	

	// Constructeur --------------------------------------------------------------

		// Constructeur sans articles en attente d'ajout d'articles
	public Commande(int id , String date , ModeLivraison modeLiv ,float prix , StatusCmd s , boolean paye ) {
		this.id = id;
		this.date = date ;
		this.modeLivraison = modeLiv;
		this.prixTotale = prix ;
		this.status = s ;
		this.estPaye = paye ;
	}
		// Constructeur avec un seul article 
	public Commande(int id , String date , ModeLivraison modeLiv ,float prix , StatusCmd s , boolean paye , Article article ) {
		this.id = id;
		this.date = date ;
		this.modeLivraison = modeLiv;
		this.prixTotale = prix ;
		this.status = s ;
		this.estPaye = paye ;
		this.articles.add(article);
	}
		// Constructeur avec des articles
	public Commande(int id , String date , ModeLivraison modeLiv ,float prix , StatusCmd s , boolean paye , ArrayList<Article> articles ) {
		this.id = id;
		this.date = date ;
		this.modeLivraison = modeLiv;
		this.prixTotale = prix ;
		this.status = s ;
		this.estPaye = paye ;
		this.articles = articles ;
	}

	// Setters & Getters --------------------------------------------------------------

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public ModeLivraison getModeLivraison() {
		return modeLivraison;
	}

	public void setModeLivraison(ModeLivraison modeLivraison) {
		this.modeLivraison = modeLivraison;
	}

	public float getPrixTotale() {
		return prixTotale;
	}

	public void setPrixTotale(float prixTotale) {
		this.prixTotale = prixTotale;
	}

	public StatusCmd getStatus() {
		return status;
	}

	public void setStatus(StatusCmd status) {
		this.status = status;
	}

	public boolean estPaye() {
		return estPaye;
	}

	public void setEstPaye(boolean estPaye) {
		this.estPaye = estPaye;
	}
	
	

	
}
