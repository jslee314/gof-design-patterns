package NameRepository;

public class NameRepository implements Container {

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public NameIterator getIterator() {
        return new MyNameIterator();
    }


    private class MyNameIterator implements NameIterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}