#include <iostream>
#include <vector>
#include <algorithm>

int getMaxValueSum(const std::vector<int>& encrypted_file, const std::vector<int>& binary, int k) {
    int n = encrypted_file.size();
    int max_sum = 0;
    int current_sum = 0;

    for (int i = 0; i < n; i++) {
      
       current_sum += encrypted_file[i];
        
        if (i >= k && binary[i - k] == 0) {
            current_sum -= encrypted_file[i - k];
        }

        max_sum = std::max(max_sum, current_sum);
    }

    return max_sum;
}

int main() {
    std::vector<int> encrypted_file = {7 , 4 , 3 , 5};
    std::vector<int> binary = {1 , 0 , 0 ,0};
    int k = 2;

    int result = getMaxValueSum(encrypted_file, binary, k);

    std::cout << "Maximum_possible_value_sum = " << result << std::endl;

    return 0;
}
