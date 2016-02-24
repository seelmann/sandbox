SSL/TLS Debugging
=================

Test SSL/TLS handshake

    openssl s_client -showcerts -connect host:443 -CAfile /etc/ssl/certs/ca-certificates.crt


OpenSSL `s_client` documentation

    man s_client

