import java.util.Scanner;

public class Insert_Head_LL_4 {
 class Node{
     int data;
     Node next;
     Node(int data){
         this.data=data;
         next=null;
     }
    }Node head=null;
    Node insert_head(int data) {
        Node newnode=new Node(data);
        if(head==null)
            head=newnode;
        else {
            newnode.next=head;
            head = newnode;
        }
        return head;
    }
    void print(){
        if(head==null)
            System.out.println("List is Empty!!");
        else {
            Node temp = head;
            System.out.print("Linked list: ");
            while(temp!=null) {
                System.out.print(temp.data + " --> ");
                temp=temp.next;
            }
            System.out.print("null");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Insert_Head_LL_4 ob=new Insert_Head_LL_4();
        ob.print();
        System.out.print("Enter the number of elements to insert: ");
        int n=sc.nextInt();
        System.out.printf("Enter the %d elements to insert: ",n);
        for(int i=1;i<=n;i++){
            ob.insert_head(sc.nextInt());
        }
        ob.print();
    }
}
