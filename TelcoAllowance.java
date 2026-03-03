package VisitorPattern;

public class TelcoAllowance implements TelcoVisitor {

    // cache of formatted strings per telco so we don't recompute every time
    private final java.util.Map<String, String> cache = new java.util.HashMap<>();

    @Override
    public String visit(Telco telco) {
        String name = telco.getTelcoName();
        if (cache.containsKey(name)) {
            return cache.get(name);
        }
        String msg = String.format("%s offers a data allowance of %dGB for ₱%.2f per month.",
                name, telco.getDataAllowance(), telco.getPromoPrice());
        cache.put(name, msg);
        return msg;
    }
}
