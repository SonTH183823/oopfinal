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

![image](https://user-images.githubusercontent.com/62825098/119699597-887c4600-be7c-11eb-88dc-03cdd7220cf4.png)

![image](https://user-images.githubusercontent.com/62825098/119699620-8d40fa00-be7c-11eb-9aa9-06556205649d.png)

![image](https://user-images.githubusercontent.com/62825098/119699654-96ca6200-be7c-11eb-8bcc-e04fd01df618.png)

![image](https://user-images.githubusercontent.com/62825098/119699720-a5187e00-be7c-11eb-8487-761a69f8b1ae.png)

![image](https://user-images.githubusercontent.com/62825098/119699745-ac3f8c00-be7c-11eb-8d64-00871aa4586f.png)

![image](https://user-images.githubusercontent.com/62825098/119699152-0db32b00-be7c-11eb-8871-709e838c726d.png)


