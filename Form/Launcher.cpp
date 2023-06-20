#include <iostream>
using namespace std;

int main()
{
    string input;
    cout << "Do you want to see my GUI? Y or N" << endl;
    cin >> input;

    if (input == "Y")
    {
        system("java Form.java");

    }
    
    else{}
}