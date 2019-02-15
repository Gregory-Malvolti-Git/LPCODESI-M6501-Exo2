
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarteCredit ccredit = new CarteCredit(6000, 5000);
		System.out.println("Carte Crédit autorise Paiement (200) : " + ccredit.autorisePaiement(200));
		Compte compteassoc = new Compte(1000);
		CarteDébit cdebit = new CarteDébit(compteassoc);
		System.out.println("Carte Débit autorise Paiement (200) : " + cdebit.autorisePaiement(200));
		
	}

}
