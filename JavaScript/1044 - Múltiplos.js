var [A, B] = require('fs').readFileSync('/dev/stdin', 'utf8').split(' ').map(Number);

if (A % B === 0 || B % A === 0) {
    console.log("Sao Multiplos");
} else {
    console.log("Nao sao Multiplos");
}