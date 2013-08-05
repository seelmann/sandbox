var calculator = process.env['CALCULATOR_COV'] ? require("../lib-cov/calculator.js") : require("../lib/calculator.js");
var assert = require("assert")

describe('calculator', function(){

  it('should add positive numbers', function(done){
    var result = calculator.add(1, 2);
    assert.equal(3, result)
    done();
  });

  it('should add negative numbers', function(done){
    var result = calculator.add(-1, -2);
    assert.equal(-3, result)
    done();
  });

});

