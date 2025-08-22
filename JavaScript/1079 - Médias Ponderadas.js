var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');
var N = parseInt(input[0]);

for (let i = 1; i <= N; i++) {
    let [a, b, c] = input[i].split(' ').map(Number);
    let media = (a * 2 + b * 3 + c * 5) / 10;
    console.log(media.toFixed(1));
}