# Unit Testing

## Count Unique

| Test case           | Case   | Return |
| ---                 | ---    | ---      |
| Empty list    | [ ] | 0 |
| Null | Null  | IllegalArgumentException  |
| One size | ["a"]   | 1 |
| Many size | ["a","a","b","c"]     | 3 |
| Multiple type | ["a","a",3,3,4]     | 3 |
| Add null in list  | ["a","a",null]     | 2 |

## Binary Search

| Test case           | Case   | Return |
| ---                 | ---    | ---      |
| Binary search    | ["a","b","c","d"] search "c" | 2 |
| Sort binary search | ["z","a","d","b"] search "z" | 3  |
| Incorrect binary search | ["a","b","c"]  search "mint" | -1 |
| Null | ["a","a","b","c"]  search null  | throw IllegalArgumentException |
| Huge list | [1,2,3,4,5,...,100000]  search 50000  | 50000 |
