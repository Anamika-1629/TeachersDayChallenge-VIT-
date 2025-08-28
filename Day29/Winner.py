class Solution:
    def winner(s):
        cA = 0
        cD = 0
        for i in range(len(s)):
            if s[i] == "A":
                cA += 1
            else:
                cD += 1
        
        if (cA > cD):
            return "Anton"
        elif (cD > cA):
            return "Danik"
        else:
            return "Friendship"

if __name__ == "__main__":
    n = int(input())     
    s = input().strip() 
    print(Solution.winner(s))