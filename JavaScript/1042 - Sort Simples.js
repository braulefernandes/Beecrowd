var nums = require('fs').readFileSync('/dev/stdin', 'utf8').split(' ').map(Number);
var sorted = [...nums].sort((a, b) => a - b);

for (let n of sorted) console.log(n);
console.log();
for (let n of nums) console.log(n);