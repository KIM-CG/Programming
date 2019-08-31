#include <stdio.h>
#include <string.h>
#define MAX_TEXT 100


int main(void) {
	
	int sel;
	
	printf("===========[ 2019201189 ��ä�� ]===========\n");
	printf("1. ��ȣȭ\n");
	printf("2. ��ȣȭ\n");
	printf("���� �Ϸ��� ���α׷� ��ȣ�� �Է����ּ��� : ");
	scanf("%d", &sel);
	
	switch(sel) {
		case 1:
			en_text();
			break;
		case 2:
			de_text();
			break;
	}
	
	return 0;
}

en_text() {
	char M[MAX_TEXT];
	int key;
	
	printf("\n���ڴ� �ִ� 100�ڱ��� �Է��� �����մϴ�.");
	printf("\n��ȣȭ �Ϸ��� ���� �Է����ּ��� : ");
	scanf("%s", &M);
	printf("\nŰ�� �ִ� 26���� �Է��� �����մϴ�.");
	printf("\nŰ ���� �Է����ּ��� : ");
	scanf("%d", &key);
	en_change(&M, key);
	
}

de_text() {
	char C[MAX_TEXT];
	int key;
	
	printf("\n���ڴ� �ִ� 100�ڱ��� �Է��� �����մϴ�.");
	printf("\n��ȣȭ �Ϸ��� ��ȣ���� �Է����ּ��� : ");
	scanf("%s", &C);
	printf("\nŰ�� �ִ� 26���� �Է��� �����մϴ�.");
	printf("\nŰ ���� �Է����ּ��� : ");
	scanf("%d", &key);
	de_change(&C, key);
}

en_change(char TEXT[], int key) {
	int index, size, len = strlen(TEXT);
	char clip;
	printf("�� : %s\n", TEXT);
	printf("Ű : %d\n", key);
	printf("��ȣ�� : ");
	for(index = 0; index < len; index++)
	{
		clip = TEXT[index];
		if(isalpha(clip)) {
			size = clip;
			size += key;
			if((isupper(clip) && size > 'Z')||(!isupper(clip) && size > 'z')) {
				size -= 26;
			}
			printf("%c", size);
		}
		else {
			printf("%c", clip);
		}
	}
}

de_change(char TEXT[], int key) {
	int index, size, len = strlen(TEXT);
	char clip;
	printf("��ȣ�� : %s\n", TEXT);
	printf("Ű : %d\n", key);
	printf("�� : ");
	for(index = 0; index < len; index++)
	{
		clip = TEXT[index];
		if(isalpha(clip)) {
			size = clip;
			size -= key;
			if((isupper(clip) && size > 'A')||(!isupper(clip) && size > 'a')) {
				size += 26;
			}
			printf("%c", size);
		}
		else {
			printf("%c", clip);
		}
	}
}

int isalpha(char sb) {
	if((sb >= 'A' && sb <= 'Z')||(sb >= 'a' && sb <= 'z')) {
		return 1;
	} else {
		return 0;
	}
}

int isupper(char sb) {
	if(sb >= 'A' && sb <= 'Z') {
		return 1;
	} else {
		return 0;
	}
}








