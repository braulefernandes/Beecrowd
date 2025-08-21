var [X, Y] = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n').map(Number);
if (X > Y) [X, Y] = [Y, X];
var soma = 0;
for (let i = X + 1; i < Y; i++) {
    if (i % 2 !== 0) soma += i;
}
console.log(soma);