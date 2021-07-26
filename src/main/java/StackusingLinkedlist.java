public class StackusingLinkedlist {
    class Node {
        int value;
        Node next;
    }
    Node topPointer;
    StackusingLinkedlist(){
        this.topPointer=null;
    }
    void pushOperation(int a){
        Node tempVariable = new Node();
//        if(tempVariable==null) {
//            System.out.println("UnderFlow");
//        }
        tempVariable.value=a;
        tempVariable.next=topPointer;
        topPointer= tempVariable;
    }
    void popOperation(){
        if(topPointer==null){
            System.out.println("Stack is Empty");
        } else{
            topPointer= topPointer.next;
            System.out.println(topPointer.value);
            }
        }


    void display(){
        Node tempVariable2 = new Node();
        while (tempVariable2!=null){
            System.out.println(tempVariable2.value);
            tempVariable2=tempVariable2.next;
        }
    }

}
