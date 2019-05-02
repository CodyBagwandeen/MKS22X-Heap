public class MyHeap{

  private static void pushDown(int[]data, int size, int index){

    if(2 * index +1 > data.length){ // if it has no children
      return;
    }

    int left = 2 * index +1;
    int right = 2 * index +2;

    if(data[index] > data[left] && data[index] > data[right]){
      return;
    }

  }

  private static void pushUp(int[]data, int size, int index){

  }

  public static void heapify(int[]data){

  }

  public static void heapsort(int[]data){
    heapify(data);
    int size = data.length -1;

    while(size > 0){
      int val = data[0]; // swap max and the last index
      data[0] = data[size];
      data[size] = val;

      pushDown(data,size,0); // push down to re-Heap
      size--;
    }
  }

}
