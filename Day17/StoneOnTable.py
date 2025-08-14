class Solution:
    def stone(s):
        count = 0
        for i in range(len(s)-1):
            if s[i] == s[i+1]:
                count += 1
        
        return count
    
def main():
    n = int(input().strip())  
    s = input().strip()       
    print(Solution.stone(s))


if __name__ == "__main__":
    main()
