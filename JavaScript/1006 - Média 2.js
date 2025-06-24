var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var A = parseFloat(input[0]);
var B = parseFloat(input[1]);
var C = parseFloat(input[2]);

var MEDIA = (A * 2 + B * 3 + C * 5) / 10;

console.log(`MEDIA = ${MEDIA.toFixed(1)}`);