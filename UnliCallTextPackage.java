package VisitorPattern;

import java.util.Map;
import java.util.HashMap;

public class UnliCallTextPackage implements TelcoVisitor {

    // cache formatted descriptions by telco name
    private final Map<String, String> cache = new HashMap<>();

    @Override
    public String visit(Telco telco) {
        String telcoName = telco.getTelcoName();
        // if we already computed message, return cached copy
        if (cache.containsKey(telcoName)) {
            return cache.get(telcoName);
        }

        boolean unli = telco.getUnliOffer().hasUnlimited();
        String result;

        if (!unli) {
            result = "No unlimited calls and texts. They do not offer any free calls or texts, and you will be charged per use.";
        } else {
            switch (telcoName) {
                case "Smart":
                    result = "Unlimited calls and texts.";
                    break;
                case "Globe":
                    result = "Unlimited calls and texts. This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.";
                    break;
                case "Ditto":
                    result = "Unlimited calls and texts. This plan includes unlimited calls and texts to all networks within the country.";
                    break;
                default:
                    result = "Unknown Telco";
                    break;
            }
        }

        cache.put(telcoName, result);
        return result;
    }
}
