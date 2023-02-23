#!/usr/bin/env bash

green='\033[0;32m'
white='\033[0;37m' 
yellow='\033[0;33m'
red='\033[0;31m'


printf "${white}Checking if selenium server exist\n"

if ! [ -e selenium-server.jar ]; then
    printf "${red}Selenium doesn't exist\n"  
    printf "${yellow}Downloading selenium..\n"
    curl -L -o ./selenium-server.jar https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.8.0/selenium-server-4.8.1.jar  # selenium-server-standalone-3.11.0.jar #
else
  printf "${green}selenium server exist, skipping download\n"
fi

echo ""

if type -p java; then
    printf "${green}found java executable in PATH\n${white}"
else
#  for mac uncomment line 13 & 14
#   brew update
#   brew cask install java 

# for linux & windows
# Please download it manually https://www.java.com/en/download/
    echo 'Please install java'
fi

echo ""

if type -p mvn; then
    printf "${green}found maven executable in PATH\n${white}"
else
#  for mac uncomment line 25 & 26
#   brew update
#   brew cask install maven
# Please download it manually https://maven.apache.org/install.html
    echo "Please install maven"
fi


printf "${green}Running selenium hub\n${white}"

java -jar selenium-server.jar hub
