package org.example;

public class Main {

    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        System.out.println("create Linked List by adding 30 and 56 to 70");
        MyLinkList<Integer> myLinkList = new MyLinkList<>();
        myLinkList.append(myFirstNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myThirdNode);
        myLinkList.printMyNodes();
       // myLinkList.pop();
        myLinkList.printMyNodes();
        System.out.println(" found at index : "+myLinkList.index(70));
        if (myLinkList.search(50)){
            System.out.println("element found at index :");
        }
        else {
            System.out.println("element not found ");
        }
        myLinkList.printMyNodes();
        System.out.println("size="+myLinkList.getSize());

    }
}
