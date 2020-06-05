public class Food {
    class Bakery extends Food {}

    class Cake extends Bakery {}

    class Pie extends Bakery {}

    class Tart extends Bakery {}

    interface Box<T> {
        public void put(T item);
        public T get();
    }

    class Packer {

        public void repackage (Box<? super Bakery> to, Box<? extends Bakery> from) {
            to.put(from.get());
        }
    }

}

