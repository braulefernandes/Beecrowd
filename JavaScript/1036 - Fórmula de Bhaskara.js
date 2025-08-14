var [A, B, C] = require('fs').readFileSync('/dev/stdin', 'utf8').split(' ').map(parseFloat);
var delta = B * B - 4 * A * C;

if (A === 0 || delta < 0) {
    console.log("Impossivel calcular");
} else {
    let r1 = (-B + Math.sqrt(delta)) / (2 * A);
    let r2 = (-B - Math.sqrt(delta)) / (2 * A);
    console.log(`R1 = ${r1.toFixed(5)}`);
    console.log(`R2 = ${r2.toFixed(5)}`);
}