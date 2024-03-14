package org.example;

import org.example.searchlist.Node;

public class Nthelement {
    public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
searchnth(head,2);
    }
  public static void  searchnth(Node head,int loc){
if(head==null) return ;
Node  first=head;
      for (int i = 0; i < loc; i++) {
          if(first==null) return;
          first=first.next;
          
      }
      Node second=head;
      while (first!=null){
          second=second.next;
          first=first.next;
      }
      System.out.println(second.data);
    }
}
