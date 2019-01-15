#include<stdio.h>
#include<stdlib.h>
#include<string.h>
char* convert(char* s, int numRows);
int main(){
    char* s="PAYPALISHIRING";
    int numRows = 3;

    char* ans = convert(s,numRows);

    return(0);
}

char* convert(char* s, int numRows){
    if (numRows == 1) {
        printf("\n rows = 1 case %s\n",s);
        return s;
    }
    int len = strlen(s);
    char *buf = (char *) malloc(sizeof(char) * (len + 1));
    int i = 0;
    for (int row = 0; row < numRows; row++) {
        int step = (numRows - 1) * 2;
        int j = 0;
        while (j + row < len) {
            buf[i++] = s[j + row];
            printf("\n       while %d: %s\n",j+row,buf);
            j += step;
            if (row > 0 && row < numRows - 1 && j - row < len) {
                buf[i++] = s[j - row];
                printf("\n if in while %d: %s\n",j-row,buf);
            }
        }
    }
    buf[len] = '\0';
    printf("\n %s\n",buf);
    return buf;
}
