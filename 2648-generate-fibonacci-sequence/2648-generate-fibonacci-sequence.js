/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */

 var fibGenerator = function*() {
    let A = 0;
    let B = 1;

    while (true) {
        yield A;

        let C = A + B;
        A = B;
        B = C;
    }
};