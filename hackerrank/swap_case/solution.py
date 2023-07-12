def swap_case(s:str):
    result=""
    for i in range(len(s)):
        if(s[i]==s[i].upper()):
            result=result+s[i].lower()
        else:
            result=result+s[i].upper()
    return result

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)