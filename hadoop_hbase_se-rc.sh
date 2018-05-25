#!/bin/bash

export JAVA_HOME=/usr/lib/jvm/java-7-openjdk-amd64
export HADOOP_CLASSPATH=${HADOOP_PREFIX}/hadoop-core-1.0.0.jar
export HADOOP_PREFIX=/proj/ucare/honglibu_3664/hadoop-1.0.0
export HADOOP_CONF_DIR=${HADOOP_PREFIX}/conf
export HADOOP_LOG_DIR=/tmp/hadoop-ucare/logs/hadoop
export YARN_LOG_DIR=/tmp/hadoop-ucare/logs/yarn
export HADOOP_MAPRED_LOG_DIR=/tmp/hadoop-ucare/logs/mapred
export HADOOP_HOME=${HADOOP_PREFIX}
export HBASE_HOME=/proj/ucare/honglibu_3664/hbase-0.90.1
 #Add Hadoop bin/ directory to PATH

export PATH=$PATH:$HADOOP_PREFIX/bin

alias h="history 25"
alias la="ls -a"
alias lf="ls -FA"
alias ll="ls -lA"

alias e="emacs"
alias hp="cd $HADOOP_PREFIX"
alias hconf="cd $HADOOP_CONF_DIR"
alias hlogs="cd /tmp/logs/yarn/userlogs/"
alias m="make"
alias mall="make all"
alias n0="ssh node-0"
alias mjl="mapred job -list"
alias mjs="mapred job -status"
alias hb="cd /proj/ucare/honglibu_3664/hbase-0.90.1"
alias hbconf="cd /proj/ucare/honglibu_3664/hbase-0.90.1/conf"
alias mf="cd /mnt/extra"
alias hname="cd /mnt/extra/dfs-ucare/dfs/name/current"
alias hdata="cd /mnt/extra/dfs-ucare/dfs/data/current"
alias yc="cd /proj/ucare/honglibu_3664/YCSB-0.1.4"
alias H3664="cd /proj/ucare/honglibu_3664/hbase-0.90.1/src/main/java/org/apache/hadoop/hbase/replication/regionserver"
alias cpcore="cp /proj/ucare/honglibu_3664/hadoop-1.0.0/hadoop-core-1.0.0.jar /proj/ucare/honglibu_3664/hbase-0.90.1/lib/"
alias cpcom="cp /proj/ucare/honglibu_3664/hadoop-1.0.0/lib/commons-configuration-1.6.jar /proj/ucare/honglibu_3664/hbase-0.90.1/lib/"
alias rmextra="rm -rf /mnt/extra/dfs-ucare /mnt/extra/zookeeper"
alias chm="sudo chown -R hsgucare:ucare /mnt/extra"
