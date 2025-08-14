class Solution:
    @staticmethod
    def task(word):
        vowels = "aoyeui"
        res = []
        for ch in word:
            c = ch.lower()
            if c not in vowels:
                res.append('.')
                res.append(c)
        return ''.join(res)


def main():
    word = input().strip()
    result = Solution.task(word)
    print(result)


if __name__ == "__main__":
    main()
