package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String principalfirstname;
    private String principallastname;

    public Principal(String principalfirstname, String principallastname) {
        this.principalfirstname = principalfirstname;
        this.principallastname = principallastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(principalfirstname, principal.principalfirstname) &&
                Objects.equals(principallastname, principal.principallastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalfirstname, principallastname);
    }

    public String getPrincipalfirstname(){
        return principalfirstname;
    }

    public String getPrincipallastname(){
        return principallastname;
    }
}
