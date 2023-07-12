def count_substring(string, sub_string):
    if(string==sub_string):
        return 1

    string_len=len(string)
    sub_string_len=len(sub_string)
    count=0

    for i in range(0,string_len-sub_string_len+1):
        if(string[i:i+sub_string_len]==sub_string):
            count=count+1
    return count

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)