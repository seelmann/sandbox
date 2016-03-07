Password
========

Crypt MD5 $1$ password:

    openssl passwd -1 -salt salt


Crypt SHA-512 $6$ password:

    python3 -c "import crypt,getpass;print(crypt.crypt(getpass.getpass('PW:'),crypt.mksalt(crypt.METHOD_SHA512)+'\$'))"
    python3 -c "import crypt,getpass;print(crypt.crypt(getpass.getpass('PW:'),'\$6\$'+getpass.getpass('ST:')+'\$'))"

