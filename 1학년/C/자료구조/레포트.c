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
		printf("┌──────────────────────────────┐\n");
		printf("│            1. 삽입           │\n");
		printf("│                              │\n");
		printf("│            2. 삭제           │\n");
		printf("│                              │\n");
		printf("│            3. 종료           │\n");
		printf("└──────────────────────────────┘\n\n");
		
		printf("작업 >>> ");
		scanf("%d", &sel);
		
		switch(sel) {
			case 1:
				printf("삽입 값 >>> ");
				scanf("%d", &send);
				Insert(send);
				printf("\n");
				break;
			case 2:
				printf("삭제 값 >>> ");
				scanf("%d", &send);
				printf("\n");
				break;
			case 3:
				return;
		}
	}
	free(head);
}
