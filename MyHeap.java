public class MyHeap{

  private static void pushDown(int[]data, int size, int index){

    if(2 * index +1 > data.length){ // if it has no children
      return;
    }

    int left = 2 * index +1;
    int right = 2 * index +2;

    if(data[index] > data[left] && data[index] > data[right]){ // if is bigger than its children
      return;
    }

    if( data[left] > data[right]) { // left child is the biggest of the 3
      swap(data, left, index);
      pushDown(data, data.length, left);
    } else {
      swap(data,right,index);
      pushDown(data, data.length,right);
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

}
