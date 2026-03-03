package VisitorPattern;

import VisitorPattern.UnliCallOffer;

public class Telco implements TelcoSubscription {
    private final String telcoName;
    private final double promoPrice;
    private final int dataAllowance;
    private final UnliCallOffer unliOffer;

    public Telco(String telcoName, double promoPrice, int dataAllowance, UnliCallOffer unliOffer) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliOffer = unliOffer;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public UnliCallOffer getUnliOffer() {
        return unliOffer;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    // visitor acceptors
    @Override
    public String accept(TelcoVisitor visitor) {
        return visitor.visit(this);
    }
}
