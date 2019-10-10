#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#define null NULL
#define true 1
#define false 0

typedef struct Node { // 구조체 선언
	int data; // 구조체의 값
	struct Node* link; // 구조체의 링크
}Node; // 구조체의 호출명

void Print(Node* head) // 출력 함수
{
	Node* round = head->link; 
	while (round != null) {
		if (round->link != null) {
			printf("%d -> ", round->data);
		}
		else {
			printf("%d", round->data);
		}
		round = round->link;
	}
	printf("\n");
}

void Insert(Node* head, int data) // 삽입 함수
{
	Node* round = head->link;
	Node* new = (Node*)malloc(sizeof(Node));
	Node* pre = (Node*)malloc(sizeof(Node));
	pre = null;

	new->data = data;
	while (head->link != null) {
		if (round != null && round->data < new->data) {
			pre = round;
			round = pre->link;
		}
		else {
			break;
		}
	}

	if (pre == null)
	{
		new->link = head->link;
		head->link = new;
	}
	else if (pre != null)
	{
		new->link = pre->link;
		pre->link = new;
	}
}

void Delete(Node* head, int data) // 삭제 함수
{
	Node* round = head->link;
	Node* temp = null;
	Node* pre = null;

	if (round->data == data) {
		temp = head->link;
		head->link = temp->link;
		return;
	}
	else {
		while (round != null && round->data != data) {
			temp = round;
			round = round->link;
		}
	}
	pre = temp->link;
	temp->link = pre->link;
	free(pre); // 삭제할 데이터의 노드를 free함수를 이용해 메모리 해제한다.
}

int main(void) // 메인 함수
{
	Node* head = (Node*)malloc(sizeof(Node)); //메인의 연결리스트인 head를 동적할당 한다.
	head->link = null; //head의 연결링크를 null로 선언한다.
	int sel, send; //선택과, 전송할 값을 담을 변수를 선언한다.
	while (true) { // 종료할때까지 무한 반복한다.
		printf("┌──────────────────────────────┐\n");
		printf("│            1. 삽입           │\n");
		printf("│                              │\n");
		printf("│            2. 삭제           │\n");
		printf("│                              │\n");
		printf("│            3. 종료           │\n");
		printf("└──────────────────────────────┘\n\n");

		printf("작업 >>> "); // 인터페이스
		scanf("%d", &sel); // 작업을 선택하여 sel변수에 대입한다.

		switch (sel) { // sel의 값을 가지고 비교한다.
			case 1: // sel의 값이 1일때
				printf("삽입 값 >>> ");
				scanf("%d", &send); // 값을 입력받아 send변수에 대입한다.
				Insert(head, send); // head와 send를 Insert 함수에 보내 호출한다.
				printf("\n");
				Print(head); // head를 Print 함수에 보내 호출한다.
				break; // switch문을 빠져나간다.
			case 2: // sel의 값이 2일때
				printf("삭제 값 >>> ");
				scanf("%d", &send); // 값을 입력받아 send변수에 대입한다.
				Delete(head, send); // head와 send를 Delete 함수에 보내 호출한다.
				printf("\n");
				Print(head); // head를 Print 함수에 보내 호출한다.
				break; // switch문을 빠져나간다.
			case 3: // sel의 값이 3일때
				return 0; // 리턴값을 0을 반환하고 프로그램을 종료한다.
			default: // sel의 값이 1 or 2 or 3이 아닐때
				printf("다시 입력해주세요.");
		}
	}
}