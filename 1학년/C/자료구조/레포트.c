#include <stdio.h>
#include <stdlib.h>
#define null NULL
#define true 1
#define false 0


typedef struct Node {
	int data;
	struct Stack *link;
}Node;

Node *head = null;

void Insert(int x) {
	Node *new = (Node*) malloc(sizeof(Node));
	head->link = new->link;
	new->data = x;
	head = head->link;
}

int main(void) {
	int sel, send;
	while (true) {
		printf("����������������������������������������������������������������\n");
		printf("��            1. ����           ��\n");
		printf("��                              ��\n");
		printf("��            2. ����           ��\n");
		printf("��                              ��\n");
		printf("��            3. ����           ��\n");
		printf("����������������������������������������������������������������\n\n");
		
		printf("�۾� >>> ");
		scanf("%d", &sel);
		
		switch(sel) {
			case 1:
				printf("���� �� >>> ");
				scanf("%d", &send);
				Insert(send);
				printf("\n");
				break;
			case 2:
				printf("���� �� >>> ");
				scanf("%d", &send);
				printf("\n");
				break;
			case 3:
				return;
		}
	}
	free(head);
}
