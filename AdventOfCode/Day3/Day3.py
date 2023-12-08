# Advent of Code: Day 3
# Author: Laura Fry     Date: Dec 3, 2023

# Imports
import re

data = [
    "467..114..",
    "...*......",
    "..35..633.",
    "......#...",
    "617*......",
    ".....+.58.",
    "..592.....",
    "......755.",
    "...$.*....",
    ".664.598..",
]

regexSymbolSameLine = r'(\d+)([^.\d\s]+)|([^.\d\s]+)(\d+)'

Symbol = ['*', '#', '+', '$']

def calculateSum():
    sumPartNum = 0
    for line in data:
        # partNum = re.findall(regexSymbolSameLine, line)
        # if partNum:
        #     for group in partNum:
        #         for i in group:
        #             if i.isnumeric():
        #                 print(i)
        #                 sumPartNum += int(i)
        list = [i for i in line]
        print(list)
        for i in list:
            if (i.isnumeric()):
                print(i)
        
    # print(sumPartNum)

def main():
    print("Welcome to the Advent of Code: Day 2!")
    calculateSum()
    

if __name__ == '__main__':
    main()