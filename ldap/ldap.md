LDAP
====

Search anonymously

    ldapsearch -x -H ldap://host:389 -b "dc=example,dc=com"

Search RootDSE

    ldapsearch -x -LLL -H ldap://host:389 -b "" -s base "*" "+"

