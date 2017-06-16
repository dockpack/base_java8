# /base_java8/templates/jre.sh
export JRE_HOME={{ java8_home }}/jre
export JAVA_HOME={{ java8_home }}
export JDK_HOME=$JAVA_HOME
export PATH=$PATH:$JAVA_HOME/bin
