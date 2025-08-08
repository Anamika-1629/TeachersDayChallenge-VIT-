class Solution:
    def task(word):
        temp = list(word)
        new_l = []

        for i in range(len(temp)):
            if temp[i] not in "aeiou":
                new_l.append(temp[i])

        res = []
        for ch in new_l:
            res.append('.')
            res.append(ch.lower())

        word = ''.join(res)
        return word

def main():
    word = input().strip()  
    result = Solution.task(word)
    print(result)


if __name__ == "__main__":
    main()