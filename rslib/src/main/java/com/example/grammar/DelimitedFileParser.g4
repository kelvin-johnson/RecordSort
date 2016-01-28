parser grammar DelimitedFileParser;

options { tokenVocab = DelimitedFileLexer; }

file:       row*;
row:        (rowc | rowp | rows) CR? NL?;
rowc:       field (COMMA field)*;
rowp:       field (PIPE field)*;
rows:       field (SPACE field)*;

field:      TEXT;