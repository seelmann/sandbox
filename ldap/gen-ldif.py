#!/usr/bin/env python
# -*- coding: utf-8 -*-


ou_template = '''\
dn: {ou_dn}
objectClass: organizationalUnit
ou: {ou}
'''

user_template = '''\
dn: {user_dn}
objectClass: inetOrgPerson
sn: {sn}
cn: {cn}
'''

group_template = '''\
dn: {group_dn}
objectClass: groupOfNames
cn: {cn}
'''

def base_dn():
    return 'dc=example,dc=com'

def ou_dn(name):
    return 'ou={0},{1}'.format(name, base_dn())

def user_ou_dn():
    return ou_dn('users')

def user_ou():
    return ou_template.format(ou_dn=user_ou_dn(), ou='users')

def user_dn(cn):
    return 'cn={0},{1}'.format(cn, user_ou_dn())

def user(name):
    return user_template.format(user_dn=user_dn(name), sn=name, cn=name)

def group_ou_dn():
    return ou_dn('groups')

def group_ou():
    return ou_template.format(ou_dn=group_ou_dn(), ou='groups')

def group_dn(cn):
    return 'cn={0},{1}'.format(cn, group_ou_dn())

def group(name, member_dns):
    group = group_template.format(group_dn=group_dn(name), cn=name)
    members = '\n'.join('member: {0}'.format(member_dn) for member_dn in member_dns)
    return group+members+'\n'


print(user_ou())
for i in range(1000, 10000):
    print(user('user{0}'.format(i)))
print(group_ou())
print(group('group1', [user_dn('user{0}'.format(i)) for i in range(1000, 2000)]))
print(group('group2', [user_dn('user{0}'.format(i)) for i in range(1000, 3000)]))
print(group('group4', [user_dn('user{0}'.format(i)) for i in range(1000, 5000)]))
print(group('group9', [user_dn('user{0}'.format(i)) for i in range(1000, 10000)]))

