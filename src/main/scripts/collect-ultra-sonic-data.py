#!/usr/bin/python

import math
import time
import json
import requests
import argparse
import sys
from random import randint

#################### INPUTS ##########################

parser = argparse.ArgumentParser(description='Collect and send Ultra-Sonic sensor data to a server')
parser.add_argument('--url', dest='url', required=True)
parser.add_argument('--freq', dest='freq', type=float, required=True)
parser.add_argument('--test', dest='test')
args = parser.parse_args()

#################### SUBROUTINES ##########################


# Given a single value of sound data, post it to the website
def postToWebsite(sensorVal):
  postData = {
    "sensorName": "Ultra-Sonic Sensor",
    "sensorValue": sensorVal,
    "timestamp": int(round(time.time() * 1000))
  }
  postData = json.dumps(postData)
  headers = {'Content-type': 'application/json'}

  if (args.url == 'test'):
    print('Post Data:')
    print(postData)
    sys.stdout.flush()
  else:
    try:
      print('=======================')
      print('POST ' + args.url)
      print('Headers:')
      print(headers)
      print('Post Data:')
      print(postData)
      sys.stdout.flush()

      r = requests.post(args.url,data=postData,headers=headers)
      
    except requests.exceptions.RequestException as e:
      print('Post Error!')
      print(e)
      sys.stdout.flush()
      sys.exit(1)
  return

def generateTestData(i):
  return math.cos(i)


#################### MAIN ##########################

if (args.test == 'true'):
  print('#### TEST MODE ####')
  sys.stdout.flush()

i = 0

while True:
  if (args.test == 'true'):
      postToWebsite(generateTestData(i))
  else:
      postToWebsite(generateTestData(i))
  i = i + 0.39269908169
  time.sleep(args.freq)