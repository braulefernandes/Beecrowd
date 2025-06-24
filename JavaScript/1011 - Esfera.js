var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var A = parseFloat(input[0]);

var volume = (4/3) * 3.14159 * Math.pow(A, 3);

console.log(`VOLUME = ${volume.toFixed(3)}`);