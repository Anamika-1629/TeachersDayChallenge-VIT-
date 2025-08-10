class Solution:
    def gender(s):
        temp = ""
        for i in range(len(s)):
            if s[i] not in temp:
                temp += s[i]
        
        if len(temp)%2 == 0:
            return "CHAT WITH HER"
        else:
            return "IGNORE HIM"
        
def main():
    s = input().strip()
    result = Solution.gender(s)
    print(result)

if __name__ == "__main__":
    main()