import string

def isalpha(sb):
    if((sb >= 'A' and sb <= 'Z') or (sb >= 'a' and sb <= 'z')):
        return 1
    else:
        return 0

def isupper(sb):
    if (sb >= 'A' and sb <= 'Z'):
        return 1
    else:
        return 0

def en_text():
    print("문자는 최대 100자까지 입력이 가능합니다.")
    M = input('암호화 하려는 평문을 입력해주세요 : ')
    print("키는 최대 26까지 입력이 가능합니다.")
    key = input('키 값을 입력해주세요 : ')
    print("평문 : " + M);
    print("키 : " + str(key));
    print("암호문 : " + en_change(M, key));

def de_text():
    print("문자는 최대 100자까지 입력이 가능합니다.")
    C = input('복호화 하려는 암호문을 입력해주세요 : ')
    print("키는 최대 26까지 입력이 가능합니다.")
    key = input('키 값을 입력해주세요 : ')
    print("평문 : " + C);
    print("키 : " + str(key));
    print("암호문 : " + de_change(C, key));

def en_change(TEXT, key):
    lowerlist = list(string.ascii_lowercase)
    upperlist = list(string.ascii_uppercase)
    s = list(TEXT)
    for index, char in enumerate(s):
        if char in lowerlist:
            position = (lowerlist.index(char) + int(key)) % 26
            s[index] = lowerlist[position]
        elif char in upperlist:
            position = (upperlist.index(char) + int(key)) % 26
            s[index] = upperlist[position]
        else:
            pass
    return ''.join(s)



def de_change(TEXT, key):
    lowerlist = list(string.ascii_lowercase)
    upperlist = list(string.ascii_uppercase)
    s = list(TEXT)
    for index, char in enumerate(s):
        if char in lowerlist:
            position = (lowerlist.index(char) - int(key)) % 26
            s[index] = lowerlist[position]
        elif char in upperlist:
            position = (upperlist.index(char) - int(key)) % 26
            s[index] = upperlist[position]
        else:
            pass
    return ''.join(s)

print("===========[ 2019201189 김채규 ]===========")
print("1. 암호화")
print("2. 복호화")
sel = int(input('실행 하려는 프로그램 번호를 입력해주세요 : '))
if(sel == 1):
    en_text()
elif(sel == 2):
    de_text()