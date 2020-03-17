/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import model.Employee;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import model.Branch;

/**
 *
 * @author rondw
 */
public class ShareHelper {

    /**
     * Ảnh biểu tượng của ứng dụng, xuất hiện trên mọi cửa sổ
     */
    public static final ImageIcon APP_ICON;
    public static String status = null;

    static {
        // Tải biểu tượng ứng dụng
        APP_ICON = new ImageIcon("src\\icon\\logo.png");
    }

    /**
     * Sao chép file logo chuyên đề vào thư mục logo
     *
     * @param file là đối tượng file ảnh
     * @return chép được hay không
     */
    public static boolean saveLogo(File file) {
        File dir = new File("icon");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File newFile = new File(dir, file.getName());
        try {
            // Copy vào thư mục logos (đè nếu đã tồn tại)
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static ImageIcon readLogo(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
    /**
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static Employee USER = null;
    public static Branch Branch = null;
    public static JFrame frame = null;

    public static String getStatus() {
        return ShareHelper.USER.getEmployeeID() + " - " + DateHelper.now().toString() + " - " + ShareHelper.status;
    }
    
    public static String getUserPosition() {
         if (ShareHelper.USER.isRole() && (ShareHelper.USER.getStoreID() == null || ShareHelper.USER.getStoreID().length() == 0)) {
                   return "Boss";
                } else if (ShareHelper.USER.isRole() && (ShareHelper.USER.getStoreID().length() > 0)) {
                    return "Manager";
                } else {
                    return "Pharmacist";
                }
    }

    /**
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void logoff() {
        ShareHelper.USER = null;
    }

    /**
     * Kiểm tra xem đăng nhập hay chưa
     *
     * @return đăng nhập hay chưa
     */
    public static boolean authenticated() {
        return ShareHelper.USER != null;
    }
}
