
public abstract class CartePaiement {
	public void payeAchat(double montant) {
		System.out.println("Vous avez payez : "+ montant);
	}
	
	public abstract boolean autorisePaiement(double montant);

};
