var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var N = parseInt(input);

for (let i = 2; i <= N; i += 2) {
    console.log(`${i}^2 = ${i * i}`);
}