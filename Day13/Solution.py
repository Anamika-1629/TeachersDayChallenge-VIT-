class Solution:
    def processString(s):
        temp = []
        for i in range(len(s)):
            if s[i].isdigit():
                temp.append(s[i])
        
        temp.sort() 
        
        res = "+".join(temp)
        return res

def main():
    s = input().strip()  
    result = Solution.processString(s)
    print(result)

if __name__ == "__main__":
    main()
