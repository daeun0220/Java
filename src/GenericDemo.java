public class GenericDemo {
}

class box<T> {
    T item;

    void setItem(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }
}
