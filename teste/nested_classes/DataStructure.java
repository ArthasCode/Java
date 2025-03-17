package nested_classes;
public class DataStructure {
    
    static final int ARRAY_LENGTH = 15;
    int[] arrayOfIntegers = new int[ARRAY_LENGTH];

    public DataStructure(){

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arrayOfIntegers[i]= i;
        }
    }

    public void showData(){
        DataStructureIterator iteratorList = new IteratorThroughLists();

        while (iteratorList.hasNext()) {
              System.out.println(iteratorList.next() + " ");
            
        }
    }
    interface DataStructureIterator extends java.util.Iterator<Integer>{}

    private class IteratorThroughLists implements DataStructureIterator{
        
        int nextIndex = 0;
        
        @Override
        public boolean hasNext(){

            return (nextIndex <= ARRAY_LENGTH - 1);
        }

        @Override
        public Integer next(){
            Integer retvalue = Integer.valueOf(arrayOfIntegers[nextIndex]);

            nextIndex += 2;
            return retvalue;
        }
    
        
}
        public static void main(String[] args) {
            DataStructure ds = new DataStructure();
            ds.showData();
        }
}

