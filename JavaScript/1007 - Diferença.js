var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var A = parseInt(input[0]);
var B = parseInt(input[1]);
var C = parseInt(input[2]);
var D = parseInt(input[3]);

var DIFERENCA = (A * B) - (C * D);

console.log(`DIFERENCA = ${DIFERENCA}`);