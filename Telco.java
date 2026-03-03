package VisitorPattern;

public class Telco implements TelcoSubscription {
    private final String telcoName;
    private final double promoPrice;
    private final int dataAllowance;
    private final boolean unliCallText;

    public Telco(String telcoName, double promoPrice, int dataAllowance, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public boolean hasUnliCallText() {
        return unliCallText;
    }

    @Override
    public int getDataAllowance() {
        return dataAllowance;
    }

    // visitor acceptors
    @Override
    public String accept(TelcoVisitor visitor) {
        return visitor.visit(this);
    }
}
