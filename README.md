# Bài tập lớn Lập trình Hướng đối tượng
* Đề tài: Chương trình quản lý quán cafe

* Mô tả:
  - Phần mềm quản lý bao gồm các chức năng: bán hàng, quản lý nhân viên, quản lý khách hàng, quản lý hàng hóa, quản lý lương nhân viên và thống kê doanh thu bán hàng, thống kê lương chi trả nhân viên, thống kê mặt hàng bán chạy.
  - Bán hàng: là chức năng chính của phần mềm, đảm nhiệm vai trò bán hàng, tiếp nhận order của khách hàng, mở bàn, chuyển bàn nếu khách hàng có nhu cầu, chọn món, thanh toán, xuất hóa đơn cho khách hàng.
  - Quản lý nhân viên: lưu trữ thông tin của nhân viên bao gồm tên, giới tính, số điện thoại, mã đăng nhập, mật khẩu, địa chỉ, số điện thoại,…(cho phép thêm thông tin, sửa thông tin, xóa thông tin, lưu thông tin)
  - Quản lý khách hàng: lưu trữ thông tin của khách hàng bao gồm tên, địa chỉ liên hệ, điểm tích lũy, lịch sử giao dịch của khách hàng,…(cho phép thêm thông tin, sửa thông tin, xóa thông tin, lưu thông tin)
  - Quản lý hàng hóa: lưu thông tin tất cả hàng hóa theo loại hàng (cho phép thêm thông tin, sửa thông tin, xóa thông tin, lưu thông tin)
  - Quản lý lương nhân viên: lưu thông tin của tất cả các ca làm bao gồm giờ bắt đầu ca làm, giờ kết thúc ca làm, lương của 1 ca,… (cho phép thêm thông tin, sửa thông tin, xóa thông tin, lưu thông tin), tính lương theo từng nhân viên.
  - Thống kê doanh thu: thống kê doanh thu theo ngày, tháng, năm, tùy vào nhu cầu người sử dụng. Ngoài ra còn thống kê được sản phẩm nào đang bán chạy nhất.

* Hướng dẫn cài đặt:
  - Import CSDL trong thư mục database vào SQL Server
  - Set lại cấu hình trong class JDBCConnection.java nằm trong package DAO theo cấu hình SQL Server trên máy của bạn
  - Import các thư viện trong thư mục lib vào nếu gặp lỗi thiếu thư viện
  - Chạy QLBHoop16 trong thư mục dist, nếu gặp lỗi không đăng nhập được thì xóa file đi và vào Netbeans build lại và chạy.
* Một số hình ảnh chương trình demo:

![Capture](https://user-images.githubusercontent.com/62825098/119698729-bad97380-be7b-11eb-91f5-08388538ccb6.JPG)

![image](https://user-images.githubusercontent.com/62825098/119698849-d9d80580-be7b-11eb-9e28-c0d6bea68aec.png)

![image](https://user-images.githubusercontent.com/62825098/119698862-de9cb980-be7b-11eb-966f-5c3c6c0022cc.png)

![image](https://user-images.githubusercontent.com/62825098/119699034-fe33e200-be7b-11eb-9239-b6b9888d067e.png)

![image](https://user-images.githubusercontent.com/62825098/119699280-2e7b8080-be7c-11eb-95da-abbdfaab5a3d.png)

![image](https://user-images.githubusercontent.com/62825098/119699152-0db32b00-be7c-11eb-8871-709e838c726d.png)


