class Box<T> {
    частное значение T;

    public void set(T value) {
        это.значение = значение;
    }

    public T get() {
        возвращаемое значение;
    }
}

class NumericBox<T extends Number> {
    частный номер T;

    public void set(T number) {
        this.number = number;
    }

    public T get() {
        номер возврата;
    }
}

class Pair<K, V> {
    закрытый ключ K;
    частное значение V;

    public Pair(K key, V value) {
        this.key = key;
        это.значение = значение;
    }

    public K getKey() {
        клавиша возврата;
    }

    public V getValue() {
        возвращаемое значение;
    }
}

class ComparableBox<T extends Comparable<T>> {
    частное значение T;

    public ComparableBox(T value) {
        это.значение = значение;
    }

    public boolean isGreaterThan(T other) {
        return value.compareTo(other) > 0;
    }
}

класс Utils {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

class WildcardDemo {
    public static void showBox(Box<?> box) {
        System.out.println("Box contains: " + box.get());
    }
}

class BoundedWildcardDemo {
    public static void sumNumbers(NumericBox<? extends Number> box) {
        System.out.println("Число: " + box.get());
    }
}
