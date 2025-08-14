class Solution:
    def capital(s):
        return s[0].upper() + s[1:]

def main():
    s = input().strip()  
    result = Solution.capital(s)
    print(result)

if __name__ == "__main__":  
    main()
