var input = require('fs').readFileSync('/dev/stdin', 'utf8').trim().split('\n');
let caseNum = 1;
let idx = 0;

while (true) {
    let [N, Q] = input[idx++].split(' ').map(Number);
    if (N === 0 && Q === 0) break;

    let marbles = [];
    for (let i = 0; i < N; i++) marbles.push(parseInt(input[idx++]));
    marbles.sort((a, b) => a - b);

    console.log(`CASE# ${caseNum++}:`);
    for (let i = 0; i < Q; i++) {
        let query = parseInt(input[idx++]);
        let pos = marbles.indexOf(query);
        if (pos !== -1) {
            console.log(`${query} found at ${pos + 1}`);
        } else {
            console.log(`${query} not found`);
        }
    }
}