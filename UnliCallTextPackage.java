package VisitorPattern;

public class UnliCallTextPackage implements TelcoVisitor {

    @Override
    public String visit(TelcoSubscription telco) {
        boolean unli = telco.hasUnliCallText();
        String telcoName = telco.getTelcoName();

        if (!unli) {
            return "No unlimited calls and texts. They do not offer any free calls or texts, and you will be charged per use.";
        }

        switch (telcoName) {
            case "Smart":
                return "Unlimited calls and texts.";
            case "Globe":
                return "Unlimited calls and texts. This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.";
            case "Ditto":
                return "Unlimited calls and texts. This plan includes unlimited calls and texts to all networks within the country.";
            default:
                return "Unknown Telco";
        }
    }
}
