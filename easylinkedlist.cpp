#include<iostream.h>
using namespace std;

struct node{
int data;
node *next;
};

class linkedlist{
node *head;
node *tail;

linkedlist()
{
	head=NULL;
	tail=NULL;
}
void insert(data){
	node *n = new node;
	n->data =data;
	n->next =NULL;
	if(head == NULL){
		head =n;
		tail =n;
		n=NULL;
	}
	else
	{
		tail->next = n;
		tail=n;//??
	}
	}
	void display()
	{
		node *temp =new node;
		temp = head;
		while(temp!=NULL)
		{
		cout<<temp->data<<endl;
		temp= temp->next;
		}
	}
};
int main()
{
	linkedlist ls;
	ls.insert(1);
	ls.insert(2);
	ls.display();

}
