var input = require('fs').readFileSync('/dev/stdin', 'utf8').split(' ');
var a = parseInt(input[0]);
var b = parseInt(input[1]);
var c = parseInt(input[2]);

var maior = (a + b + Math.abs(a - b)) / 2;
maior = (maior + c + Math.abs(maior - c)) / 2;

console.log(`${maior} eh o maior`);