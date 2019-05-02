import java.util.*;
public class MyHeap{

  private static void pushDown(int[]data, int size, int index){

    int parent = index;
    index = 2 * index + 1;

    while( index < size){ // if a child exists
      int left = data[index];
      int max = left;

      if( size > index +1){ // see if the other chuld exists
        int right = data[index+1];

        if(left < right){
          max = right; // the biggest is now the right and the index must change to reflect that
          index++;
        }
      }

      if( data[parent] < max){
        swap(data,parent,index); // swaps the parent and the superior child
        parent = index; // now the child is the one being looked at
      } else {
        return; // if the parent is the biggest there is no need to keep going
      }

      index = 2 * index + 1;

    }

  }

  private static void pushUp(int[]data, int size, int index){

  }

  public static void heapify(int[]data){
    for(int i = data.length -1; i >= 0; i--){
      pushDown(data, data.length, i); // start from the bottom and push down
    }
  }

  public static void heapsort(int[]data){
    heapify(data);
    int size = data.length -1;

    while(size > 0){

      swap(data,0,size); // swap the max and the last

      pushDown(data,size,0); // push down to re-Heap
      size--;
    }
  }

  public static void swap(int[]data, int i, int j){
    int temp = data[i];
    data[i] = data[j];
    data[j] = temp;
  }

  public static void main(String[] args){
    int[] data =  {5,1,2,6,123};

    System.out.println(Arrays.toString(data));

    heapify(data);

    System.out.println(Arrays.toString(data));
    System.out.println("Should be [123, 6, 2, 5, 1]");
    int[] data1 =  {5,1,2,6,123,12,15,13,18,999};
    int[] data2 =  {5,1,2,6,123,12,15,13,18,999};

    Arrays.sort(data1);

    heapsort(data2);

    System.out.println(Arrays.toString(data1));
    System.out.println(Arrays.toString(data2));


  }
}
