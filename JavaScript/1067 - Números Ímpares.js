var X = parseInt(require('fs').readFileSync('/dev/stdin', 'utf8'));
for (let i = 1; i <= X; i += 2) {
    console.log(i);
}