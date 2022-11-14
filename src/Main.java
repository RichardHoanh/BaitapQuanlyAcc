import manager.ManagerAccount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ManagerAccount managerAccount = new ManagerAccount();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("QUAN LY TAI KHOAN");
            System.out.println("1. Them tai khoan");
            System.out.println("2. Sua tai khoan theo id");
            System.out.println("3. Xoa tai khoan theo id");
            System.out.println("4. Hien thi tai khoan");
            System.out.println("5. Tim tai khoan bang ten dang nhap");
            System.out.println("6. Thoat");
            System.out.println("NHAP LUA CHON CUA BAN");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerAccount.addAcc();
                    break;
                case 2:
                    System.out.print("Nhap id\t");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    managerAccount.edit(idEdit);
                    break;
                case 3:
                    System.out.print("Nhap id\t");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    managerAccount.delete(idDelete);
                    break;
                case 4:
                    managerAccount.display();
                    break;
                case 5:
                    System.out.print("Nhap ten:\t");
                    String ten = scanner.nextLine();
                    managerAccount.findAccByUsername(ten);
                    break;
                case 6:
                    System.exit(0);
                    break;


            }

        }


    }


}
