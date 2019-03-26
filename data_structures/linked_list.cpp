#include <iostream>
using namespace std;

namespace {

  struct Node {
    int m_data;
    Node *next;
  };
  class LinkedList
  {
    public:
    Node *head, *curr, *temp;
    LinkedList(){
      head = curr = temp = NULL;
    }
    void insert(int num){
      Node *n = new Node;
      n->next = NULL;
      n->m_data = num;

      if(head != NULL){
        curr = head;
        while(curr->next != NULL){
          curr = curr->next;
        }
        curr->next = n;
      } else {
        head = n;
      }
    }
    void print() const {
      // print out everything in the list
      Node *n = head;

      while(n != NULL){
        cout<<n->m_data<<endl;
        n=n->next;
      }
    }
    void reverse() {
    }
    void insert(int at, int num){

      int count = 0;

      if(at == 0){
        Node *n = new Node;
        n->next = head;
        head = n;
        n->m_data = num;
      } else if(at > 0 && at <= 10) {
        Node *n = new Node;
        Node *tr = head;
        while(count < at - 1){
          tr=tr->next;
          count++;
        }
      n->next = tr->next;
      tr->next = n;
      n->m_data = num;
      } else {
        cout<<"Invalid add"<<endl;
      }

    }
    void remove(int num){
    }
  };
}

// To execute C++, please define "int main()"
int main() {
  LinkedList list;
  for(int num = 0; num < 10; ++num)
  {
    list.insert(num);
  }
  list.insert(10, 999);
  list.insert(3333);
  list.insert(10, 999);
  list.print();
  /*list.reverse();
  list.print();
  list.remove(999);*/

  return 0;
}
