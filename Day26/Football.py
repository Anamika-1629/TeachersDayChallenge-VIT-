class Solution:
    def football(s):
        count = 1
        for i in range(len(s)-1):
            if (s[i] == s[i+1]):
                count += 1
                if count == 7:
                    return "YES"
            else:
                count = 1
        
        return "NO"

if __name__ == "__main__":
    s = input().strip()
    print(Solution.football(s))