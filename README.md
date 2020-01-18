[![Galaxy](https://img.shields.io/badge/galaxy-dockpack.base__java8-blue.svg?style=flat)](https://galaxy.ansible.com/dockpack/base_java8)[![Build Status](https://api.travis-ci.org/dockpack/base_java8.svg)](https://travis-ci.org/dockpack/base_java8)

base_java8
=========

base_java8 is a just another vague acronym that other stuff depends on.
This is an ansible-role to install several Java versions on Centos or Ubuntu.

Requirements
------------

Centos 6 or 7. Ubuntu Xenial or Bionic.


Role Variables
--------------

These lists drive the installation of packages.

```yaml

  java8_packages:
    - 'java-1.8.0-openjdk-headless.x86_64'
    - 'java-1.8.0-openjdk-devel.x86_64'
  java9_packages: []
  java11_packages:
    - 'java-11-openjdk-headless.x86_64'
    - 'java-11-openjdk-devel.x86_64'
  java_latest_packages:
    - 'java-latest-openjdk-headless'
    - 'java-latest-openjdk-devel.x86_64'

```
To select the default with alternatives on RedHat:
`base_jdk: 'java-1.8.0'`

```yaml
  - 'java-1.8.0'
  - 'java-11'
  - 'java-13'
```

Dependencies
------------

none

Example Usage
----------------

```
    #!/usr/bin/env ansible-playbook

    - name: example playbook
      hosts: all
      become: yes

      roles:
        - { role: base_java8, tags: 'java8' }
```

License
-------

MIT

Author Information
------------------

Bas Meijer
@bbaassssiiee
