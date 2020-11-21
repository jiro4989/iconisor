#!/bin/bash

set -eux

os_name=linux
version=14.0.1

rm -rf jmods || true
mkdir -p jmods
curl -o jmods/jmods.zip -sSL https://download2.gluonhq.com/openjfx/${version}/openjfx-${version}_${os_name}-x64_bin-jmods.zip
cd jmods
unzip jmods.zip
