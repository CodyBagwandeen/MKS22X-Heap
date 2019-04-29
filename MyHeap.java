public class MyHeap{

  private static void pushDown(int[]data, int size, int index){

    if(2 * index +1 > data.length){
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

  }

}
