
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarteCredit ccredit = new CarteCredit(6000, 5000);
		System.out.println("Carte Cr�dit autorise Paiement : " + ccredit.autorisePaiement(200));
		Compte compteassoc = new Compte(1000);
		CarteD�bit cdebit = new CarteD�bit(compteassoc);
		System.out.println("Carte D�bit autorise Paiement" + cdebit.autorisePaiement(200));
		
	}

}
