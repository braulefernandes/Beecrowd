var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var A = parseFloat(input[0]);
var B = parseFloat(input[1]);

var MEDIA = (3.5 * A + 7.5 * B) / 11.0;

console.log(`MEDIA = ${MEDIA.toFixed(5)}`);