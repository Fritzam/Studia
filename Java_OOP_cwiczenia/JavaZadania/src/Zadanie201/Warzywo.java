package Zadanie201;

class Warzywo {
    private String nazwa;

    public Warzywo(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return nazwa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Warzywo warzywo = (Warzywo) o;
        return nazwa.equals(warzywo.nazwa);
    }

    @Override
    public int hashCode() {
        return nazwa.hashCode();
    }
}
