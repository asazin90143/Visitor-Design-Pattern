package VisitorPattern;

import java.util.Map;
import java.util.HashMap;

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

    /**
     * Return a map of this telco's basic properties. Useful for clients
     * that prefer a generic lookup rather than calling getters individually.
     */
    public java.util.Map<String, Object> getAttributes() {
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("name", telcoName);
        map.put("price", promoPrice);
        map.put("allowance", dataAllowance);
        map.put("unliOffer", unliOffer);
        return map;
    }

    // visitor acceptors
    @Override
    public String accept(TelcoVisitor visitor) {
        return visitor.visit(this);
    }
}
