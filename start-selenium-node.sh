#!/usr/bin/env bash

green='\033[0;32m'
white='\033[0;37m' 
yellow='\033[0;33m'
red='\033[0;31m'

status=\"$(curl -L -s -o /dev/null -I -w %{http_code} http://localhost:4444/)\"


if [[ ${status//\"/} != "200" ]]; then
    printf "${red}Selenium hub is not working!\n Please restart\n"
else
    printf "${green}Starting selenium node as default..\n${white}"

fi

java -jar selenium-server-4.8.1.jar node --detect-drivers true
