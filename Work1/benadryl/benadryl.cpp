#include <iostream>
#include <string>
#include <math.h>

using namespace std;

int main(){

int x;
cin >> x;
if (x == 7){
cout << "You are a Failure you can Never make it!   \n \n \n" ;
}else if  (x == 10 ){
    cout << "There's a 10% chance of success for your endeavors" ;
}else if (x <= 5){
    cout << "Hmmmm   A Villager i See !";
}
 int arr [10] = { 1, 2, 3, 4, 5,
                  6, 7, 8, 9, 10 };

    cout << arr[0];


    return 0;
}