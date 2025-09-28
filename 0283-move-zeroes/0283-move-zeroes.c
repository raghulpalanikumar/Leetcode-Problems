void swap(int* a, int* b) {
    int t = *a;
    *a = *b;
    *b = t;
}

// Move all zeroes to the end, preserving order of non-zero elements
void moveZeroes(int* arr, int numsSize) {
    int nzi = 0; // Non-zero index

    for (int i = 0; i < numsSize; i++) {
        if (arr[i] != 0) {
            swap(&arr[i], &arr[nzi]);
            nzi++;
        }
    }
}