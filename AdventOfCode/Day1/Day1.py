# Advent of Code: Day 1
# Author: Laura Fry     Date: Dec 1, 2023

# Imports
import re

regexes = [
    r"\d",
    r"(?=(\d|one|two|three|four|five|six|seven|eight|nine))",
]

textToNum = {
    'one': '1',
    'two': '2',
    'three': '3',
    'four': '4',
    'five': '5',
    'six': '6',
    'seven': '7',
    'eight': '8',
    'nine': '9'
}

def findSum():
    file = open("Day1Data.txt", "r")
    sumValues = [[] for x in regexes]
    for line in file.readlines():
        for i, regex in enumerate (regexes):
            matches = re.findall(regex, line)
            numMatches = [textToNum.get(match, match) for match in matches]
            value = ""
            if len(numMatches) == 1:
                stringValue = numMatches[0] + numMatches[0]
                value = int(stringValue)
            elif len(numMatches) ==2:
                stringValue = numMatches[0] + numMatches[1]
                value = int(stringValue)
            else:
                stringValue = numMatches[0] + numMatches[len(numMatches)-1]
                value = int(stringValue)
            sumValues[i].append(value)
    for i, sumValue in enumerate(sumValues):
        print(f"Sum of values {i}: {sum(sumValue)}")
    file.close()

def main():
    print("Welcome to the Advent of Code: Day 1!")
    findSum()

if __name__ == '__main__':
    main()