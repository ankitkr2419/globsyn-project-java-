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
		tail=n;
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
	void insert_start()
	{
		node *temp=new node;
		temp->next =head;
		head = temp;
	}
	void insert_postion(int pos,int value)
	{
		node *curr = new node ;
		node *prev =new node ;
		node *temp =new node;
		for(i=1;i<n;i++)
		{
			prev=curr
			curr=curr->next;
		}
		tail->value=data;
		prev->next =temp;
		temp->next =curr;
	}
	void delete_first()
	{
		node *temp = new node;
		temp=head;
		head=head->next;
		delete temp;
	}
};
int main()
{
	linkedlist ls;
	ls.insert(1);
	ls.insert(2);
	ls.display();

}
