# write bash script create file myfile.txt, append text, print size in bytes:

my_file=myfile.txt
touch $my_file
echo "Some text" >> $my_file
stat --format="%s" $my_file