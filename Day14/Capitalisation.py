class Solution:
    def capital(s):
        s = s.capitalize()
        return s

def main():
    s = input().strip()  
    result = Solution.capital(s)
    print(result)

if __name__ == "__main__":  
    main()
