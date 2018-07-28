// Portable Test and Stimulus Standard (PSS) v1.0

grammar PSS;
@header {
package io.github.hongping;
}

// Start rule
model
    : portable_stimulus_desc
    ;

portable_stimulus_desc
    : component_declaration
    ;

// B.5 Component declarations
component_declaration
    : 'component' component_identifier (':' component_super_spec)? '{' (component_body_item)* '}' (';')?
    ;

component_super_spec
    : ':' Simple_identifier
    ;

component_body_item
    : Simple_identifier
    ;

component_identifier
    : Simple_identifier
    ;

Simple_identifier
    : [a-zA-Z_] [a-zA-Z_$]*
    ;

// whitespaces
Whitespace
    : [ \t\n\r] + -> channel (HIDDEN)
    ;