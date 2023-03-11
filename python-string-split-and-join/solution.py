def split_and_join(line:str):
    line_array=line.split(" ")
    result=line_array[0]
    if(len(line_array)>1):
        for i in range(1,len(line_array)):
            result=result+"-"+line_array[i]
    else:
        return line
    return result

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)