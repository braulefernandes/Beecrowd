var valores = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n').map(Number);
var positivos = valores.filter(v => v > 0).length;
console.log(`${positivos} valores positivos`);