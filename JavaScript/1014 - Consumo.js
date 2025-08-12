var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');
var X = parseInt(input[0]);
var Y = parseFloat(input[1]);

console.log(`${(X / Y).toFixed(3)} km/l`);