package Zadanie303;

interface MyList<E> {
    void add(E e);
    E get(int i);
    void remove(int i);
    int size();
    default String toStringLike() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size(); i++) {
            sb.append(get(i).toString());
            if(i < size() - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
