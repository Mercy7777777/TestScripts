import csv
import os
from bs4 import BeautifulSoup

file_dir = os.getcwd()
dir_list = os.listdir(file_dir)
for cur_file in dir_list:
    path = os.path.join(file_dir,cur_file)
    if os.path.isdir(path):
        file_path = os.path.join(path, 'target/site/jacoco-ut/index.html')
        with open(file_path) as file:
            html = file.read() 
            bs = BeautifulSoup(html,"html.parser")

            info = ['instructions coverage: ', 'branch coverage: ']
            cnt = 0
            print("project: " + cur_file)
            for item in bs.tfoot.tr.find_all("td"):
                if cnt < 2 and item.attrs != {} and item['class'] == ['ctr2']:
                    print(info[cnt] + item.string)
                    cnt += 1            
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