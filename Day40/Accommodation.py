class Solution:
    def vacancy(n, room):
        count = 0
        for i in range(n):
            p = room[i][0]
            q = room[i][1]
            if (q-p) >= 2:
                count += 1

        return count

def main():
    n = int(input())
    room = [list(map(int, input().split())) for _ in range(n)]
    print(Solution.vacancy(n, room))


if __name__ == "__main__":
    main()