package VisitorPattern;

public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription[] telcos = {
            new Telco("Smart", 500, 15, false),
            new Telco("Globe", 450, 10, true),
            new Telco("Ditto", 400, 8, true)
        };

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        for (TelcoSubscription telco : telcos) {
            System.out.println(telco.getTelcoName() + " Data Usage Offer and price: " + 
                promo.showAllowance(telco.getTelcoName(), telco.getPromoPrice(), telco.getDataAllowance()));
        }
        
        System.out.println();

        for (TelcoSubscription telco : telcos) {
            System.out.println(telco.getTelcoName() + " unlimited calls and text package: " + 
                unli.showUnliCallsTextOffer(telco.getTelcoName(), telco.hasUnliCallText()));
        }
    }
}
