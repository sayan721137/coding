

#include <stdio.h>
#include <stdbool.h>
int main()
{
    int size=5;
    int i=0;
    int array[5];
    bool ex=true;
    
    void push(){
        if(i<size){
            printf("\nEnter %d  index Value: ",i);
            
            scanf("%d",&array[i]);
            printf("\n%d Push To the Stack\n",array[i]);
            //printf("\n");
            i++;
        }
        else{
        printf("\nStack Overflow\n\n");
    }
    }
    
    void pop(){
        if(i==0){
            printf("\nStack Underflow\n\n");
        }
        else{
            printf("%d Pop from the Stack\n",array[i-1]);
        i--;
        }
    }
    
    void display(){
        if(i==0){
            printf("\nStack Underflow\n\n");
        }
        else{
        for(int j=0;j<i;j++){
            printf("%d\t",array[j]);
        }
        printf("\n");
        }
       // printf("\n");
    }
    
    while(ex){
        printf("\nStack Menu\n");
        printf("\n1. Push\n");
        printf("2. Pop\n");
        printf("3. Display\n");
        printf("Type any other to exit\n");
        int ch;
        printf("Enter What Operation You Want to perform:");
        scanf("%d",&ch);
        printf("\n");
        switch(ch){
            case 1:
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                display();
                break;
                
            default:
                ex=false;
        }
        
    }

    return 0;
}
