class Solution:
    @staticmethod
    def caps(s: str) -> str:
        if s.isupper():
            return s.lower()
        elif len(s) > 1 and s[0].islower() and s[1:].isupper():
            return s[0].upper() + s[1:].lower()
        else:
            return s


def main():
    s = input()
    print(Solution.caps(s))


if __name__ == "__main__":
    main()
