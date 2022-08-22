package oop;

import java.util.Arrays;
import java.util.Date;

public class Adult extends Human{
    private Passport passport;
    private Child[] kids;

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Child[] getKids() {
        return kids;
    }

    public void setKids(Child[] kids) {
        this.kids = kids;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Adult{");
        sb.append("passport=").append(passport);
        sb.append(", kids=").append(Arrays.toString(kids));
        sb.append('}');
        return sb.toString();
    }
}
