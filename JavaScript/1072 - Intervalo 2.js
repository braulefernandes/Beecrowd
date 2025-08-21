var input = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
var N = parseInt(input[0]);
var valores = input.slice(1).map(Number);

var dentro = valores.filter(v => v >= 10 && v <= 20).length;
var fora = N - dentro;

console.log(`${dentro} in`);
console.log(`${fora} out`);