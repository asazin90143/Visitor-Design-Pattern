package VisitorPattern;

public interface TelcoSubscription {
    String accept(TelcoVisitor visitor);
}
