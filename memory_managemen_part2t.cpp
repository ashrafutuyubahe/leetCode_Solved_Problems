#include<iostream>
#include<string>
#include<algorithm>
#include<cctype>  

using namespace std;

// Function to get names from the user and store them in the array
void printNames(int size, string *userInputNames) {
    for(int a = 0; a < size; a++) {
        cout << "Enter name " << a+1 << ": ";
        getline(cin, userInputNames[a]);
    }

    cout << "\nHere are your input names:" << endl;

    for(int a = 0; a < size; a++) {
        cout << userInputNames[a] << endl;
    }
}

// Function to reallocate memory for the string array
string* reAllocateMemory(int newSize, string *userInputNames, int formerSize) {
    // Allocate new memory for the larger array
    string *newUserInputNames = new string[newSize];

    // Copy the old data to the new array
    for(int i = 0; i < formerSize; i++) {
        newUserInputNames[i] = userInputNames[i];
    }

    // Delete the old array to free memory
    delete[] userInputNames;

    return newUserInputNames;
}

int main() {
    cout << "\nHello! We are going to make an amazing program." << endl;

    int UserInputLimit;
    cout << "Enter the limit of the name array: ";
    cin >> UserInputLimit;
    cin.ignore(); // To clear the newline character after cin

    // Allocate memory for the initial array
    string *userInputNames = new string[UserInputLimit];

    // Input names
    printNames(UserInputLimit, userInputNames);

    string userConfirm;
    cout << "Would you like to increase the size? (yes, no): ";
    getline(cin, userConfirm);

    // Convert the confirmation string to lowercase
    transform(userConfirm.begin(), userConfirm.end(), userConfirm.begin(), ::tolower);

    if(userConfirm == "yes") {
        int newSize;
        cout << "Enter the new total size of the name array: ";
        cin >> newSize;
        cin.ignore();  // To clear the newline character after cin

        // Reallocate memory to the new size
        userInputNames = reAllocateMemory(newSize, userInputNames, UserInputLimit);

        // Input additional names
        printNames(newSize, userInputNames);
    }

    // Free dynamically allocated memory
    delete[] userInputNames;

    return 0;
}
