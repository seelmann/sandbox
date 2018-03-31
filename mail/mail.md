Mail
====

Send mail via telnet:

    $ telnet server.example.com 25
    EHLO test.example.com
    MAIL FROM: test@example.com
    RCPT TO: test@example.com
    DATA
    Subject: Test
    (empty line)
    This is a test.
    (empty line)
    .
    QUIT


