class Solution:
    def casechange(s):
        uc = 0
        lc = 0
        for i in range(len(s)):
            if (s[i].isalpha() and s[i].isupper()):
                uc += 1
            elif (s[i].isalpha() and s[i].islower()):
                lc += 1
        
        if (uc > lc):
            return s.upper()
        else:
            return s.lower()

if __name__ == "__main__":
    s = input()
    print(Solution.casechange(s))