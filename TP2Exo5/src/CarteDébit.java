
public class CarteDébit extends CartePaiement {
	private Compte compteAssocie;
	
	public CarteDébit(Compte compteAssocie) {
		super();
		this.compteAssocie = new Compte(1000);
	}
	
	@Override
	public boolean autorisePaiement(double montant) {
		return compteAssocie.getSolde() >= montant;
	}
}
