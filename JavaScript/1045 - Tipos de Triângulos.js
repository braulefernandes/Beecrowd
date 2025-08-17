var nums = require('fs').readFileSync('/dev/stdin', 'utf8').split(' ').map(Number).sort((a,b) => b-a);
var [A, B, C] = nums;

if (A >= B + C) {
    console.log("NAO FORMA TRIANGULO");
} else {
    if (A * A === B * B + C * C) console.log("TRIANGULO RETANGULO");
    if (A * A > B * B + C * C) console.log("TRIANGULO OBTUSANGULO");
    if (A * A < B * B + C * C) console.log("TRIANGULO ACUTANGULO");
    if (A === B && B === C) console.log("TRIANGULO EQUILATERO");
    else if (A === B || B === C || A === C) console.log("TRIANGULO ISOSCELES");
}