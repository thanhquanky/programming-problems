// Author: Thanh Ky Quan
describe('wordSearch', function(){
    describe('match horizontally', function() {
        it('should match entire row', function () {
            var board = ["ABCD", "SFCS", "ADEE"];
            expect(wordSearch(board, "ABCD")).to.equal(true);
        })

        it('should match row in reverse', function () {
            var board = ["ABCD", "SFCS", "ADEE"];
            expect(wordSearch(board, "SCFS")).to.equal(true);
        })

        it('should match partial row', function () {
            var board = ["ABCD", "SFCS", "ADEE"];
            expect(wordSearch(board, "AD")).to.equal(true);
        })
    })

    describe('match vertically', function() {

        it('should match column', function () {
            var board = ["ABCD", "SFCS", "ADEE", "FFFF"];
            var result = wordSearch(board, "ASAF");
            expect(result).to.equal(true);
        });

        it('should match column in reverse', function () {
            var board = ["ABCD", "SFCS", "ADEE", "FFFF"];
            expect(wordSearch(board, "FASA")).to.equal(true);
        });

        it('should match column partially', function () {
            var board = ["ABCD", "SFCS", "ADEE", "FFFF"];
            expect(wordSearch(board, "ASA")).to.equal(true);
        });
    })

    describe('match general cases', function() {
        it('should match mixed cases', function() {
            var board = [
                "ABCD",
                "SFCS",
                "ADEE",
                "FFFF"
            ];
            expect(wordSearch(board, "ASFCS")).to.equal(true);
            expect(wordSearch(board, "ABCDSCFS")).to.equal(true);
            expect(wordSearch(board, "FEEDA")).to.equal(true);
        })

        it('should match - large cases', function() {
            var board = ["AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"];
            var targetWord = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            expect(wordSearch(board, targetWord)).to.equal(true);
        })
    })

    describe('not match', function() {
        it('should not match new character', function() {
            var board = ["ABCD", "SFCS", "ADEE"];
            expect(wordSearch(board, "V")).to.equal(false);
        })

        it('should not match', function(){
            var board = ["ABCD", "SFCS", "ADEE"];
            expect(wordSearch(board, "ABCB")).to.equal(false);
            expect(wordSearch(board, "ZCZX")).to.equal(false);
        })

        it('should not match too long key', function() {
            var board = ["ABCD", "SFCS", "ADEE"];
            expect(wordSearch(board, "ABCDSCDSADEED")).to.equal(false);
        })
    });
})
