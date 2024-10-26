import java.util.ArrayList;

public class DynamicArray {
   private int[] array;
   private int occupied;

    public DynamicArray(int arrayLength){
    this.array = new int[arrayLength];
    this.occupied = 0;

    }
    public void print(){
    for(int i =0; i <this.occupied; i++){
        System.out.println(this.array[i]);
    }
    }
    public void insert(int element){
        if(this.occupied == this.array.length){
            int [] cloned = this.array.clone();
            this.array = new int[this.array.length * 2];
            for(int i =0; i<= cloned.length-1;i++){
                this.array[i] = cloned[i];
            }
            this.array[this.occupied++] = element;
            return;
        }
        this.array[this.occupied++] = element;
    }

    public void removeAt(int index){
        if (index < 0 || index >= this.occupied){
            throw new IllegalArgumentException("Supply a valid index for the deletion");
        }
        for(int i=index; i<=this.occupied-1; i++){
            this.array[i] = this.array[i+1];
        }
        this.occupied -= 1;
    }

    public int indexOf(int element){
        for(int i =0; i<= occupied -1; i++){
            if(this.array[i] == element){
                return i;
            }
        }
        return -1;
    }

    public int max(){
        int maximum = 0;
        for(int i =0; i < this.occupied; i++){
            if(this.array[i]> maximum){
                maximum = this.array[i];
            }
        }
        return maximum;
    }

    public ArrayList<Integer> intersect(int [] sampleArray){
        ArrayList<Integer> solutionArray  = new ArrayList<>(1);
        for (int dynamicArrayIndex =0; dynamicArrayIndex < this.occupied; dynamicArrayIndex++){
            int dynamicElement = this.array[dynamicArrayIndex];
            for (int sampleArrayIndex = 0; sampleArrayIndex < sampleArray.length; sampleArrayIndex++ ){
                if(sampleArray[sampleArrayIndex] == dynamicElement){
                    if(!solutionArray.contains(dynamicElement)){
                        solutionArray.add(dynamicElement);
                    }
                }
            }
        }
        return solutionArray;
    }
}
