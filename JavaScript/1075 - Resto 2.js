var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var N = parseInt(input);

for (let i = 1; i < 10000; i++) {
    if (i % N === 2) {
        console.log(i);
    }
}