import java.util.Arrays;

public class DynamicArray {
   private int[] array;
   private int occupied;

    public DynamicArray(int arrayLength){
    this.array = new int[arrayLength];
    this.occupied = 0;

    }
    public void print(){
        System.out.println(Arrays.toString(this.array));
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
}
