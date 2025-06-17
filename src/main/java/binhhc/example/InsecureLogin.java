package binhhc.example;

import java.util.logging.Logger;

public class InsecureLogin {

    private static final Logger logger = Logger.getLogger(InsecureLogin.class.getName());
    private static final String ADMIN_USER = "admin";

    public static void login(String username, String password) {
        if (username.equals(ADMIN_USER) && password.equals(System.getenv("ADMIN_PASSWORD"))) {
            logger.info("Login successful");
        } else {
            logger.warning("Login failed");
        }
    }

    public void printUserInfo(String user) {
        if (user != null && !user.isEmpty()) {
            logger.info("User: " + user);
        }
    }
    // Xoá phương thức không dùng nếu không cần
}


