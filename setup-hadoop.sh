#!/bin/bash

# download necessary tools
echo "Installing requirement..."
sudo apt-get update
sudo apt-get install -y wget git


# download hadoop binary
echo "Downloading hadoop base binary..."
wget https://archive.apache.org/dist/hadoop/common/hadoop-0.20.205.0/hadoop-0.20.205.0.tar.gz
tar -xvzf hadoop-0.20.205.0.tar.gz
rm hadoop-0.20.205.0.tar.gz
echo "==============================="
