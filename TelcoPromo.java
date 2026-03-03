package VisitorPattern;

import VisitorPattern.UnliCallOffer;
import VisitorPattern.UnliCallTextPackage;

public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription[] telcos = {
                new Telco("Smart", 500, 15, new UnliCallOffer(false)),
                new Telco("Globe", 450, 10, new UnliCallOffer(true)),
                new Telco("Ditto", 400, 8, new UnliCallOffer(true))
        };

        // single visitor type used for different behaviors
        TelcoVisitor promo = new TelcoAllowance();
        TelcoVisitor unli = new UnliCallTextPackage();

        for (TelcoSubscription telco : telcos) {
            System.out.println(telco.accept(promo));
        }

        System.out.println();

        for (TelcoSubscription telco : telcos) {
            System.out.println(telco.accept(unli));
        }
    }
}
