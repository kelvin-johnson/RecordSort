lexer grammar DelimitedFileLexer;

TEXT:   ~[| ,\n\r]+;

PIPE:   '|';
SPACE:  ' ';
COMMA:  ',';

CR:     '\r';
NL:     '\n';
