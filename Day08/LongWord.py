class Solution:
    def word(l):
        for i in range(len(l)):
            temp = l[i]
            if len(temp) > 10:
                new_word = temp[0] + str(len(temp) - 2) + temp[-1]
                l[i] = new_word
        return l

def main():
    n = int(input("Enter number of words: "))
    words = [input() for _ in range(n)]
    
    result = Solution.word(words)
    for w in result:
        print(w)

if __name__ == "__main__":
    main()
