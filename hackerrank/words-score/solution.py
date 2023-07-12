def is_vowel(letter):
    return letter in ['a', 'e', 'i', 'o', 'u', 'y']

def score_words(words):
    score = 0
    temp = 0

    for i in range (0,len(words)):
        for j in range(0,len(words[i])):
            if(is_vowel(words[i][j])):
                temp=temp+1
        if(temp%2==0):
            score=score+2
        else:
            score=score+1
        temp=0
    return score


n = int(input())
words = input().split()
print(score_words(words))