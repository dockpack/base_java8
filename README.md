=========

base_java8 is a just another vague acronym that other base roles depend on.

Requirements
------------

RHEL-like , Ubuntu, or Debian.


Role Variables
--------------

java8_maj: 8
java8_min: 0
java8_ser: 111
java8_patch: b14

Dependencies
------------

none

Example Usage
----------------

\#!/usr/bin/env ansible-playbook

- name: example playbook
  hosts: all
  become: yes

  roles:
    - { role: base_java8, tags: 'java8' }

License
-------

MIT

Author Information
------------------

Bas Meijer
@bbaassssiiee
