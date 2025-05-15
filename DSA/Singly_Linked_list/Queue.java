package solve_problems.DSA.Singly_Linked_list;

class Queue {

    private int front=0;
    private int rear=-1;
    private int size=0;
    private int[] arr = new int[4];
    

    public void enqueue(int data) {
        rear++;
        arr[rear]=data;
        size++;
    }
    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
