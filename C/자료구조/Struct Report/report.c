#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#define null NULL
#define true 1
#define false 0

typedef struct Node { // ����ü ����
	int data; // ����ü�� ��
	struct Node* link; // ����ü�� ��ũ
}Node; // ����ü�� ȣ���

void Print(Node* head) // ��� �Լ�
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

void Insert(Node* head, int data) // ���� �Լ�
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

void Delete(Node* head, int data) // ���� �Լ�
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
	free(pre); // ������ �������� ��带 free�Լ��� �̿��� �޸� �����Ѵ�.
}

int main(void) // ���� �Լ�
{
	Node* head = (Node*)malloc(sizeof(Node)); //������ ���Ḯ��Ʈ�� head�� �����Ҵ� �Ѵ�.
	head->link = null; //head�� ���ḵũ�� null�� �����Ѵ�.
	int sel, send; //���ð�, ������ ���� ���� ������ �����Ѵ�.
	while (true) { // �����Ҷ����� ���� �ݺ��Ѵ�.
		printf("����������������������������������������������������������������\n");
		printf("��            1. ����           ��\n");
		printf("��                              ��\n");
		printf("��            2. ����           ��\n");
		printf("��                              ��\n");
		printf("��            3. ����           ��\n");
		printf("����������������������������������������������������������������\n\n");

		printf("�۾� >>> "); // �������̽�
		scanf("%d", &sel); // �۾��� �����Ͽ� sel������ �����Ѵ�.

		switch (sel) { // sel�� ���� ������ ���Ѵ�.
			case 1: // sel�� ���� 1�϶�
				printf("���� �� >>> ");
				scanf("%d", &send); // ���� �Է¹޾� send������ �����Ѵ�.
				Insert(head, send); // head�� send�� Insert �Լ��� ���� ȣ���Ѵ�.
				printf("\n");
				Print(head); // head�� Print �Լ��� ���� ȣ���Ѵ�.
				break; // switch���� ����������.
			case 2: // sel�� ���� 2�϶�
				printf("���� �� >>> ");
				scanf("%d", &send); // ���� �Է¹޾� send������ �����Ѵ�.
				Delete(head, send); // head�� send�� Delete �Լ��� ���� ȣ���Ѵ�.
				printf("\n");
				Print(head); // head�� Print �Լ��� ���� ȣ���Ѵ�.
				break; // switch���� ����������.
			case 3: // sel�� ���� 3�϶�
				return 0; // ���ϰ��� 0�� ��ȯ�ϰ� ���α׷��� �����Ѵ�.
			default: // sel�� ���� 1 or 2 or 3�� �ƴҶ�
				printf("�ٽ� �Է����ּ���.");
		}
	}
}