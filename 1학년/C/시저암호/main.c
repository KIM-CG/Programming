#include <stdio.h>
#include <string.h>
#define MAX_TEXT 100


int main(void) {
	
	int sel;
	
	printf("===========[ 2019201189 김채규 ]===========\n");
	printf("1. 암호화\n");
	printf("2. 복호화\n");
	printf("실행 하려는 프로그램 번호를 입력해주세요 : ");
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
	
	printf("\n문자는 최대 100자까지 입력이 가능합니다.");
	printf("\n암호화 하려는 평문을 입력해주세요 : ");
	scanf("%s", &M);
	printf("\n키는 최대 26까지 입력이 가능합니다.");
	printf("\n키 값을 입력해주세요 : ");
	scanf("%d", &key);
	en_change(&M, key);
	
}

de_text() {
	char C[MAX_TEXT];
	int key;
	
	printf("\n문자는 최대 100자까지 입력이 가능합니다.");
	printf("\n복호화 하려는 암호문을 입력해주세요 : ");
	scanf("%s", &C);
	printf("\n키는 최대 26까지 입력이 가능합니다.");
	printf("\n키 값을 입력해주세요 : ");
	scanf("%d", &key);
	de_change(&C, key);
}

en_change(char TEXT[], int key) {
	int index, size, len = strlen(TEXT);
	char clip;
	printf("평문 : %s\n", TEXT);
	printf("키 : %d\n", key);
	printf("암호문 : ");
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
	printf("암호문 : %s\n", TEXT);
	printf("키 : %d\n", key);
	printf("평문 : ");
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








