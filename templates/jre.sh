
{% if ansible_os_family == 'Debian' %}
# Debian
JAVA_HOME: "/usr/lib/jvm/{{ java8_name }}"
# jdk1.8.0_111
{% endif %}


{% if ansible_os_family == 'RedHat' %}
# RedHat
export JAVA_HOME=/usr/java/{{ java8_name }}

{% endif %}

export PATH="$PATH:${JAVA_HOME}/bin"
