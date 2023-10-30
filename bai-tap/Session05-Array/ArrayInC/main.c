#include <stdio.h>
#include <stdlib.h>

// Lưu thông tin về lượng mưa
int main(int argc, char *argv[]) {
	
	/*
		Khai báo lẻ
	*/
	float vol1 = 0, vol2 = 0, vol3 = 50, vol4, vol5;
	vol1 = 6868;
	printf("%.1f | %.1f | %.1f\n", vol1, vol2, vol5);
		// Những phần tử chưa được gán giá trị
		// sẽ mang giá trị rác
		
	/*
		Khai báo sỉ - hàng loạt (mảng)
		Cách 1 - khai báo kích thước trước, gán giá trị sau
	*/
	float vol[365]; // Đã có sẵn 365 biến float,
					// ta chỉ việc sử dụng
	vol[0] = 0;
	vol[1] = 1;
	vol[2] = 2;
	// Những phần tử chưa được gán giá trị sẽ mang giá trị rác
	vol[364] = 50;
	
	// In theo kiểu "cày chay"
	printf("\nThe array has values of:\n");
	printf("vol[0]: %.1f | vol[1]: %.1f | vol[2]: %.1f\n", vol[0], vol[1], vol[2]);

	// In nhanh bằng vòng lặp for
	printf("\nThe array has values of: \n");
	for (int i = 0; i < 365; i++)
		printf("%.1f  ", vol[i]);
	
	/*
		Khai báo sỉ - hàng loạt (mảng)
		Cách 2 - không cần báo kích thước, chỉ cần gán giá trị
	*/
	// 7 biến float đã có luôn giá trị
//	float v[] = {0, 5, 10, 15, 20, 25, 30};

	/*
		Khai báo sỉ - hàng loạt (mảng)
		Cách 3 - khai báo kích thước song song với gán giá trị
	*/
	float v[100] = {0, 5, 10, 15, 20, 25, 30};
	v[0] = 6868;
	v[99] = 6868;
	v[100] = 6868;

	printf("\n\nThe array has values of: \n");
	for (int i = 0; i < 105; i++)
		printf("%.1f  ", v[i]);

	/*
		Mảng động - xin 7 vùng RAM để chứa 7 phần tử,
					mỗi vùng có kích thước là số Byte của float
	*/   
//	float* arr = malloc(28);
//	float* arr = malloc(7 * 4);
//	float* arr = malloc(7 * sizeof(float));
	float* arr = calloc(7, sizeof(float));
//	Biến con trỏ | new Object()

	arr[0] = 39;
	arr[1] = 79;
	arr[2] = 6868;
	arr[3] = 2204;
	// Những phần tử còn lại chưa gán giá trị sẽ là 0
	
	printf("\n\nThe dynamic array has values of: \n");
	for (int i = 0; i < 7; i++)
		printf("%.1f  ", arr[i]);
		
	return 0;
}