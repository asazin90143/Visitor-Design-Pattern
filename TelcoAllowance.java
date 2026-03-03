package VisitorPattern;

public class TelcoAllowance implements TelcoVisitor {
    @Override
    public String visit(Telco telco) {
        return String.format("%s offers a data allowance of %dGB for ₱%.2f per month.",
                telco.getTelcoName(), telco.getDataAllowance(), telco.getPromoPrice());
    }
}
