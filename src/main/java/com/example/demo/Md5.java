package com.example.demo;

import java.security.MessageDigest;

public class Md5 {
    public static void main(String[] args) {
        Encrypt("admin");
    }

    public static void Encrypt(String s) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5"); // create hash func
            byte[] inputByte = md.digest(s.getBytes()); // hash input string byte
            StringBuilder sb = new StringBuilder();
            for (byte b : inputByte) {
                sb.append(String.format("%02x", b));
            }
            System.out.println("MD5: " + sb.toString());

        } catch (Exception e) {
            e.getMessage();
        }
    }
    // Trả lời câu hỏi
    // 1. Tại sao ko lưu pass của user nhập luôn mà phải mã hoá chi cho mắc công
    // Nếu không mã hóa thì khi hacker tấn công, hacker sẽ thấy toàn bộ mật khẩu
    // hoặc những người quản lý tài khoản thấy được
    // , dẫn đến rủi ro mất dữ liệu, không đảm bảo tính an toàn của dữ liệu
    // 2. Salt đóng vai trò gì?
    // Salt là đoạn văn thêm vào làm thay đổi giá trị khi hash, khiến cho cùng 1 mật
    // khẩu giống nhau
    // nhưng người dùng khác nhau thì kết quả khác nhau.
    // 3. Thuật toán md5 có giải mã được hay ko
    // MD5 là thuật toán 1 chiều nên không giải mã được, nhưng hacker vẫn có thể
    // đoán ra được nếu
    // không có salt
    // 4. Làm sao để check dc user đăng nhập pass đúng hay ko
    // khi người dùng đăng nhập thì client sẽ gửi mật khẩu lên server, server sẽ
    // thêm alt rồi hash, xong đối chiếu với mật khẩu đã lưu trong db. Nếu mã hash
    // mà khớp là đăng nhập đúng
}
