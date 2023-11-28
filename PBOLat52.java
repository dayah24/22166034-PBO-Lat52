/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166034.pbo.lat52;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class PBOLat52 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bagian untuk informasi Dosen
        System.out.println("==== Informasi Dosen ====");
        System.out.print("NIP DOSEN: ");
        String nipDosen = input.nextLine();
        System.out.println("Saya Dosen");
        System.out.print("Masukkan Nama Anda: ");
        String namaDosen = input.nextLine();
        System.out.print("Masukkan Umur Anda: ");
        int umurDosen = input.nextInt();
        input.nextLine(); // Menangani newline character
        System.out.print("Mengajar Matakuliah: ");
        String matakuliahDosen = input.nextLine();

        // Menampilkan hasil informasi Dosen
        System.out.println("Saya " + namaDosen + " umur " + umurDosen + " tahun sedang mengajar matakuliah " + matakuliahDosen);

        // Bagian untuk informasi Mahasiswa
        System.out.println("\n==== Informasi Mahasiswa ====");
        System.out.print("NIM MAHASISWA: ");
        String nimMahasiswa = input.nextLine();
        System.out.println("Saya Mahasiswa");
        System.out.print("Masukkan Nama Anda: ");
        String namaMahasiswa = input.nextLine();
        System.out.print("Masukkan Umur Anda: ");
        int umurMahasiswa = input.nextInt();
        input.nextLine(); // Menangani newline character
        System.out.print("Belajar di Kelas: ");
        String kelasMahasiswa = input.nextLine();

        // Menampilkan hasil informasi Mahasiswa
        System.out.println("Saya " + namaMahasiswa + " umur " + umurMahasiswa + " tahun sedang belajar di kelas " + kelasMahasiswa);
    }
}