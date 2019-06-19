#include<iostream.h>

struct node{
public:
	int data;
	node *left;
	node *right;
	node(int data)
	{
		this->data = data;
		left =right=NULL;
	}
};
class bst{
		private:
			node *root;
		void insertPrivate(int data,node *&root){
			if(root == NULL)
			{
				root =new node(data);
			}
			else if(data< root->data)
			{
				insertPrivate(data,root->left);
			}
			else if(data> root->data)
			{
				insertPrivate(data,root->right);
			}
			else
			{
					root->right =new node(data);
			}
		}
		// remove the node
			void removePrivate(int data,Node *&root)
			{
				if(root == NULL)
					return;
				else if(data< root->data)
				{
					removePrivate(data,root->left);
				}
				else if(data> root->data)
				{
					removePrivate(data,root->right);
				}
				// we have found the node in case of two node
				else{
						if(root->left == NULL && root->right == NULL)
						{
							delete root;
							root =NULL;
						}
						else if(root->left == NULL)
						{
							node *temp =root;
							root =root->right;
							delete temp;
						}
						else if(root->right ==NULL)
						{
							node *temp =root;
							root =root->left;
							delete temp;
						}
						else
						{
							node *temp =findMin(root->right);
							root->data = temp->data;
							removePrivate(temp->data,root->data);
						}
					}
				
			}	
		public:
			bst(){
				root =NULL;
			}
		void insert(int data)
			{
				insertPrivate(data,root);
			}
		void remove(int data)
			{
				removePrivate(data,root);
			}
		node* findMin(node* root)
			{
				while(root->left!=NULL)
				{
					root =root->left;
					return root;
				}
			}
	
}
};
int main()
{}