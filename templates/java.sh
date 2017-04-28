# /base_java8/templates/jre.sh
export JRE_HOME={{ java8_top }}/{{ java8_name }}/jre
export JAVA_HOME={{ java8_top }}/{{ java8_name }}
export JDK_HOME=$JAVA_HOME
export PATH=$PATH:$JAVA_HOME/bin
