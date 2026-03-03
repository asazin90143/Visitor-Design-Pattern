package VisitorPattern;

public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double price, int dataAllowance) {
        return String.format("%s offers a data allowance of %dGB for ₱%.2f per month.", telcoName, dataAllowance,
                price);
    }
}
