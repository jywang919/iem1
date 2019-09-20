#!/bin/sh
#jw -- WIP
xJAVA_OPTS=x"$JAVA_OPTS"
echo "xJAVA_OPTS: " $xJAVA_OPTS
if [ "$xJAVA_OPTS" != "x" ]; then
  export JAVA_OPTS="-Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,address=8787,server=y,suspend=n":$JAVA_OPTS
  echo "JAVA_OPTS add: " $JAVA_OPTS
fi
if [ "$xJAVA_OPTS" == "x" ]; then
  export JAVA_OPTS="-Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,address=8787,server=y,suspend=n"
  echo "JAVA_OPTS blank: " $JAVA_OPTS
fi