
public class CarteD�bit extends CartePaiement {
	private Compte compteAssocie;
	
	public CarteD�bit(Compte compteAssocie) {
		super();
		this.compteAssocie = compteAssocie;
	}
	
	@Override
	public boolean autorisePaiement(double montant) {
		return compteAssocie.getSolde() >= montant;
	}
}
