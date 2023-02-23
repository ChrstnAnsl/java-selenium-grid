#!/usr/bin/env bash

TARGET="target"

if [ -d "target" ]; then
  rm -rf target
fi

mvn test
