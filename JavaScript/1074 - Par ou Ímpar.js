var input = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');
var N = parseInt(input[0]);

for (let i = 1; i <= N; i++) {
    let x = parseInt(input[i]);
    if (x === 0) {
        console.log("NULL");
    } else {
        let par = (x % 2 === 0) ? "EVEN" : "ODD";
        let pos = (x > 0) ? "POSITIVE" : "NEGATIVE";
        console.log(`${par} ${pos}`);
    }
}