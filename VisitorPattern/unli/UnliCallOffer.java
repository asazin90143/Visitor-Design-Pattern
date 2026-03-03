package VisitorPattern.unli;

public class UnliCallOffer {
    private final boolean hasUnlimited;

    public UnliCallOffer(boolean hasUnlimited) {
        this.hasUnlimited = hasUnlimited;
    }

    public boolean hasUnlimited() {
        return hasUnlimited;
    }
}
