package VisitorPattern;

public interface TelcoSubscription {
    String accept(TelcoVisitor visitor);

    String getTelcoName();

    double getPromoPrice();

    boolean hasUnliCallText();

    int getDataAllowance();
}
