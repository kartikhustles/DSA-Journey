#include<iostream>
using namespace std;
class stack{
    int top;
    int arr[5];
    public: stack(){
        top=-1;
            for(int i=0;i<5;i++){
                arr[i]=0;
                }
            }
            bool isempty(){
                if(top==-1){
                    return true;
                }
                else{
                    return false;
                }
            }
            bool isfull(){
                if(top==4){
                    cout<<"the stack is full "<<endl; return true;
                } 
                else{
                    cout<<"the stack is not full "<<endl;
                    return false;
                }
            }
            void push(int a){
                if(isfull()){
                    cout<<"stack overflow "<<endl;
                } else{
                    top++;
                    arr[top]=a;
                    cout<<"the push value is "<<arr[top]<<" at the position "<<top<<endl;
                } 
            }
            void pop(){
                if(isempty()){
                    cout<<"stack underflow "<<endl;
                }
                else{
                    int temp= arr[top];
                    arr[top]=0;
                    cout<<" the value is poped at position "<<top<<endl; top--;
                } 
            }
            void count(){
                cout<<"the number of elements in the stack is "<<top+1<<endl;
            }
            void peek(int a){
                if(isempty()){
                    cout<<" stack is empty "<<endl;
                }
                else{
                    cout<<" the value u want to peek is "<<arr[a]<<endl;
                }
            }
            void change(int a, int pos){
                int temp1= arr[pos];
                arr[pos]= a;
                cout<<"the value is changed from "<<temp1<<"to "<<arr[pos]<<endl;
            }
            void display(){
                for(int i=0;i<5;i++) {
                    cout<<"the elements of the stack at "<<i<<"th position is "<<arr[i]<<endl;
                }
            }
    };
    int main(){ 
            cout<<"************************************"<<endl;
            cout<<" Kartik Agarwal- 21BCE3418"<<endl;
            cout<<"************************************"<<endl; stack s1;
            s1.pop();
            s1.push(5);
            s1.pop(); 
            s1.push(8); 
            s1.push(9); 
            s1.count(); 
            s1.change(5,1); 
            s1.push(3); 
            s1.push(8); 
            s1.push(77); 
            s1.display(); 
            s1.count();

            return 0;
        }
