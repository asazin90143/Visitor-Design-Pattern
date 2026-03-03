package VisitorPattern;

import java.util.Map;
import java.util.HashMap;

public class UnliCallTextPackage implements TelcoVisitor {

    // cache formatted descriptions by telco name
    private final Map<String, String> cache = new HashMap<>();
    // static mapping of telco names to messages when unlimited is available
    private static final Map<String, String> descriptions = new HashMap<>();
    static {
        descriptions.put("Smart", "Unlimited calls and texts.");
        descriptions.put("Globe",
                "Unlimited calls and texts. This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        descriptions.put("Ditto",
                "Unlimited calls and texts. This plan includes unlimited calls and texts to all networks within the country.");
    }

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
            result = descriptions.getOrDefault(telcoName, "Unknown Telco");
        }

        cache.put(telcoName, result);
        return result;
    }
}
