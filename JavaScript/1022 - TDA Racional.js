var input = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
var N = parseInt(input[0]);

function mdc(a, b) {
    return b === 0 ? a : mdc(b, a % b);
}

for (let i = 1; i <= N; i++) {
    let [n1, , d1, op, n2, , d2] = input[i].split(' ');
    n1 = parseInt(n1);
    d1 = parseInt(d1);
    n2 = parseInt(n2);
    d2 = parseInt(d2);

    let nr, dr;
    if (op === '+') {
        nr = n1 * d2 + n2 * d1;
        dr = d1 * d2;
    } else if (op === '-') {
        nr = n1 * d2 - n2 * d1;
        dr = d1 * d2;
    } else if (op === '*') {
        nr = n1 * n2;
        dr = d1 * d2;
    } else {
        nr = n1 * d2;
        dr = n2 * d1;
    }

    let div = Math.abs(mdc(nr, dr));
    console.log(`${nr}/${dr} = ${nr / div}/${dr / div}`);
}