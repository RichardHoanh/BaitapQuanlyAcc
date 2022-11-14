package manager;

import model.Account;

import java.util.Scanner;

public class ManagerAccount {
    Account[] accounts = new Account[0];
    Scanner scanner = new Scanner(System.in);

    //* Lưu ý: Đối vơi hàm "Create" thì kiểu của nó luôn là class cha, vì ở đây ta sẽ tạo ra một mảng là đối tượng của class cha
    public Account createAcc() {
        System.out.print("Nhap id:\t");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap username:\t");
        String username = scanner.nextLine();
        System.out.print("Nhap password:\t");
        String password = scanner.nextLine();
        System.out.print("Nhap sdt:\t");
        String phone = scanner.nextLine();
        System.out.print("Nhap ngay sinh:\t");
        String date = scanner.nextLine();
        return new Account(id, username, password, phone, date);
    }

    public void add(Account array) {
        Account[] newArr = new Account[accounts.length + 1];
        for (int i = 0; i < accounts.length; i++) {
            newArr[i] = accounts[i];
        }
        newArr[newArr.length - 1] = array;
        accounts = newArr;
    }

    public void addAcc() {
        Account arr = createAcc();
        add(arr);
    }

    public int findIndexById(int id) {
        for (int i = 0; i < accounts.length; i++) {
            if (id == (accounts[i].getId())) {
                return i;
            }
        }
        return -1;
    }

    public void edit(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            Account arrEdit = createAcc();
            accounts[index] = arrEdit;
        }
    }

    public void delete(int id) {
        int index = findIndexById(id);
        if (index != -1) {
            Account[] arrDelete = new Account[accounts.length - 1];
            for (int i = 0; i < arrDelete.length; i++) {
                if (index < i) {
                    arrDelete[i] = accounts[i];
                } else {
                    arrDelete[i] = accounts[i + 1];
                }
            }
            accounts = arrDelete;
        }
    }

    public void display() {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].toString());
        }
    }

    public void findAccByUsername(String name) {

        for (int i = 0; i < accounts.length; i++) {
            if (name.equals(accounts[i].getUserName())) {
                System.out.println("Tai khoan can tim co thong tin nhu sau:");
                System.out.println(accounts[i].toString());
            }

        }
        System.out.println("Tai khoan khong ton tai");

    }

}


