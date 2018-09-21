#include <iostream>
using namespace std;

int main(){
	cout << "---following are the consecutive powers of two---" << endl;
	unsigned int t = 1;
	for(int i=1; i<=100; i++){
		t*=2;
		cout << t << " power: " << i << endl;
	}
return 0;
}