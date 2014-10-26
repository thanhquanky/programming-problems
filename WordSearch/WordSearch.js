// Author: Thanh Ky Quan
// Leetcode problem: WordSearch

var wordSearch = function(board, word) {
    var totalRows = board.length;
    var totalCols = board[0].length;
    var wordLength = word.length;
    if (wordLength > totalCols * totalRows)
        return false;
    var findInitialPosition = function() {
        var targetChar = word[0];
        var positions = []
        for (var i=0; i<totalRows; i++) {
            for (var j=0; j<totalCols; j++) {
                if (board[i][j] == targetChar) {
                    positions.push({'row': i, 'col': j});
                }
            }
        }
        return positions;
    };

    var isMatch = function(index, row, col) {
        var deltaRow = [0, 0, 1, -1];
        var deltaCol = [1, -1, 0, 0];
        var i, r, c;
        if (index == wordLength)
            return true;
        if (index === 0) {
            var initialPositions = findInitialPosition();
            for (i=0; i<initialPositions.length; i++) {
                var position = initialPositions[i];
                r = position.row;
                c = position.col;
                marked[r][c] = true;
                if (isMatch(1, r, c)) {
                    return true;
                }
                marked[r][c] = false;
            };
            return false;
        }
        else {
            for (i=0; i<4; i++) {
                r = row + deltaRow[i];
                c = col + deltaCol[i];
                if (r >= 0 && c >= 0 && r < totalRows && c < totalCols && !marked[r][c])
                    if (board[r][c] == word[index]) {
                        marked[r][c] = true;
                        var result = isMatch(index+1, r, c);
                        if (result)
                            return true;
                        marked[r][c] = false;
                    }
            }
        }
    }

    var marked = [];
    var i, j;
    var row = [];
    for (j=0; j<totalCols; j++) {
        row.push(false);
    }
    for (i=0; i<totalRows; i++) {
        marked.push(row.slice());
    }
    return isMatch(0);
};