package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.utils.ValidationUtil;

public class ValidationApp {

    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("", null);

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Data tidak valid: " + e.getMessage());
        } finally {
            System.out.println("Eksekusi berakhir dan selalu di jalankan");
        }
//        catch (NullPointerException e) {
//            System.out.println("Data Null: " + e.getMessage());
//        }

        LoginRequest loginRequest2 = new LoginRequest("", null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Success");

    }

}
