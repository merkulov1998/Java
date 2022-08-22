package oop;

import java.util.Date;

public class Child extends Human{

    private String sr;

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }

    @Override
    public String getDocument() {
        return super.getDocument()+sr;
    }
}
