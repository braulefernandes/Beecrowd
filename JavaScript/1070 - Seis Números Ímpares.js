var X = parseInt(require('fs').readFileSync('/dev/stdin', 'utf8'));
var count = 0;
while (count < 6) {
    if (X % 2 !== 0) {
        console.log(X);
        count++;
    }
    X++;
}