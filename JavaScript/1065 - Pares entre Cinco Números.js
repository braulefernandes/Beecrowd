var valores = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n').map(Number);
var pares = valores.filter(v => v % 2 === 0).length;
console.log(`${pares} valores pares`);