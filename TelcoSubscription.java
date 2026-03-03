package VisitorPattern;

public interface TelcoSubscription {
    String accept(UsagePromo promo);
    String accept(UnliCallsTextOffer unliPackage);
    
    String getTelcoName();
    double getPromoPrice();
    boolean hasUnliCallText();
    int getDataAllowance();
}
