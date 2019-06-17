class binaryminheap{
	
	private:
		int getLeftchild(int index)
		{
			return 2*index+1;
		}
		int getRightchild(int index)
		{
			return 2*index+2; 
		}
		int getParent(int index)
		{
			return (index-1)/2;
		}
		void swap(int i, intj)
		{
			int temp =heap[i];
			heap[i] = heap[j];
			heap[j] =temp;
		}
		bool hasLeft(int index)
		{
			return getLeftchild(index)<heapSize;
		}
		bool hasRight(int right)
		{
			return getRightchild(index)<heapSize;
		}
	public:
	int *heap;
	int heapSize;
	int arraySize;
		void heapifyUp(int index)
		{
			if(index ! =0)
			{
				int parent = getParent(index);
				if(heap[parent]>heap[index])
				{
					swap(parent,index);
					heapifyUp(parent);
				}
			}
		}
		void binaryminheap(int size)
		{
			heap =new int[size];
			heapSize =0;
			arraySize = size;
		}
		void insert(int data)
		{
			if(heapSize == arraySize)
			{
				return;
			}
			else
			{
				heapSize++;
				heap[heapSize -1] =data;
				heapifyUp(heapSize-1);		
			}
		}
};
