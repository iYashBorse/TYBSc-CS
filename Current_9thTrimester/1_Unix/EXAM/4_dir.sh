#!/bin/bash

mkdir demodir;cd demodir ; touch file1 file2 file3 ; cd .. ; mv demodir newdir ; cd newdir ; rm file2 ; cd .. ;  ls -l ; rm -r newdir ; ls -l
