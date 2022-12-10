import csv
import os
from itertools import groupby
import matplotlib.pyplot as plt
import re

file_dir = os.getcwd()
dir_list = os.listdir(file_dir)
for cur_file in dir_list:
    path = os.path.join(file_dir,cur_file)
    if os.path.isdir(path):
        numbers = [0] * 10
        try:
            for f in os.listdir(path + '/.evosuite'):
                if re.match(r'tmp_2022*', f):
                    npath = path + '/.evosuite/' + f + '/reports'
                    print(npath)
                    for p in os.listdir(npath):
                        file_path = npath + '/' + p + '/statistics.csv'
                        with open(file_path) as file:
                            reader = csv.reader(file)
                            result = list(reader)[1:]
                            for line in result:
                                size = int(line[8])
                                index = size % 10
                                if index < 10:
                                    numbers[index] = numbers[index] + 1
                                else:
                                    numbers[10] = numbers[10] + 1
            print(numbers)
        except:
            pass
        plt.bar(range(0, 100, 10), numbers)
        plt.title(cur_file + ", " + "number of tests")
        plt.show()


        """        
        file_path = os.path.join(path, 'target/site/jacoco-ut/jacoco.csv')
        try:
            with open(file_path) as file:
                reader = csv.reader(file)
                result = list(reader)[1:]
                print("project: " + cur_file)

                instruction = []
                branch = []
                lin = []

                for line in result:
                    INSTRUCTION_MISSED = int(line[3])
                    INSTRUCTION_COVERED = int(line[4])
                    instruction_coverage = 100.0 * INSTRUCTION_COVERED / (INSTRUCTION_MISSED + INSTRUCTION_COVERED)
                    instruction.append(instruction_coverage)

                    BRANCH_MISSED = int(line[5])
                    BRANCH_COVERED = int(line[6])
                    if BRANCH_MISSED + BRANCH_COVERED != 0:
                        branch_coverage = 100.0 * BRANCH_COVERED / (BRANCH_MISSED + BRANCH_COVERED)
                        branch.append(branch_coverage)

                    LINE_MISSED = int(line[7])
                    LINE_COVERED = int(line[8])
                    if LINE_MISSED + LINE_COVERED != 0:
                        line_coverage = 100.0 * LINE_COVERED / (LINE_MISSED + LINE_COVERED)
                        lin.append(line_coverage)

                step = 10

                insRes = [0] * 10
                for k, g in groupby(sorted(instruction), key=lambda x: x//step):
                    # print('{}, {}'.format(k, len(list(g))))
                    num = len(list(g))
                    if k < 10:
                        insRes[int(k)] += num
                    else:
                        insRes[9] += num
                print(insRes)
                plt.bar(range(0, 100, 10), insRes)
                plt.title(cur_file + ", " + "instruction coverage")
                plt.show()

                branRes = [0] * 10
                for k, g in groupby(sorted(branch), key=lambda x: x//step):
                    # print('{}, {}'.format(k, len(list(g))))
                    num = len(list(g))
                    if k < 10:
                        branRes[int(k)] += num
                    else:
                        branRes[9] += num
                print(branRes)
                plt.bar(range(0, 100, 10), branRes)
                plt.title(cur_file + ", " + "branch coverage")
                plt.show()

                lineRes = [0] * 10
                for k, g in groupby(sorted(lin), key=lambda x: x//step):
                    # print('{}, {}'.format(k, len(list(g))))
                    num = len(list(g))
                    if k < 10:
                        lineRes[int(k)] += num
                    else:
                        lineRes[9] += num
                print(lineRes)
                plt.bar(range(0, 100, 10), lineRes)
                plt.title(cur_file + ", " + "line coverage")
                plt.show()
        except:
            pass
"""

"""
file = open('/home/cxwang/JavaForGit/TestScripts/EvoSuite/tools/target/site/jacoco-ut/index.html')
html = file.read() 
bs = BeautifulSoup(html,"html.parser")

info = ['instructions coverage: ', 'branch coverage: ']
cnt = 0
for item in bs.tfoot.tr.find_all("td"):
    if cnt < 2 and item.attrs != {} and item['class'] == ['ctr2']:
        print(info[cnt] + item.string)
        cnt += 1
"""