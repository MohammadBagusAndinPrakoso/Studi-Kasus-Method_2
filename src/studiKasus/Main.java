/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studiKasus;

/**
 *
 * @author MOKLET1
 */
public class Main {
    public static void main(String[] args) {
        //Membuat objek baru untuk memanggil method yang ada di class "NonVoid"
        NonVoid operator = new NonVoid();
        //Memanggil method yang ada di class "NonVoid"
        System.out.println(operator.nama);
        System.out.println(operator.usia);
        System.out.println(operator.alamat);
        System.out.println(operator.sekolah);
        System.out.println(operator.kelas);
        System.out.println(operator.absen);
        System.out.println(operator.telp);
    }
}
