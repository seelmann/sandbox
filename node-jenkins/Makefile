
test:
	@node_modules/.bin/mocha -R xunit > test-results.xml
	@node_modules/.bin/mocha -R tap > test-results.tap

coverage:
	@node_modules/.bin/jscoverage --no-highlight lib lib-cov
	@CALCULATOR_COV=1 node_modules/.bin/mocha -R html-cov > coverage.html
	@rm -rf lib-cov

violations:
	@node_modules/.bin/jshint --reporter jslint lib/calculator.js > jshint-violations.xml; test $$? -gt -1 


.PHONY: test
