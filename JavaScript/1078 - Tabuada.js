var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var N = parseInt(input);

for (let i = 1; i <= 10; i++) {
    console.log(`${i} x ${N} = ${i * N}`);
}