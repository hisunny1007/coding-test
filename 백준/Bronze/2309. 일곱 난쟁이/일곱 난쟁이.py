import sys
input = sys.stdin.readline

from itertools import combinations

#오름차순 출력? 리스트로 써야지
dwarfs = [int(input()) for _ in range(9)]
dwarfs.sort()

for dwarf in list(combinations(dwarfs, 7)):
  if sum(dwarf) == 100:
    for onetwo in dwarf:
      print(onetwo)
    break