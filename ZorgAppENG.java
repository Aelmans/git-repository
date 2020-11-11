package com.company;

import java.util.Scanner;

public class ZorgAppENG {
    boolean _zv;
    int _patnummer;
    //Att
    ProfileList _profileList;
    MedicijnList _medicijnList;
    GewichtList _gewichtList;

    //constructor
    public ZorgAppENG(int nr, boolean zv) {
        _zv = zv;
        _patnummer = nr;

        _medicijnList = new MedicijnList(true);
        _profileList = new ProfileList(_medicijnList);
        _gewichtList = new GewichtList();

    }

    //////////////////////////////////
    public void menuENG () {

        boolean next = true;
        while (next) {

            System.out.println("Choice");
            System.out.println("[0] Exit");
            System.out.println("[1] Data");
            System.out.println("[2] Change Data");
            System.out.println("[3] Medicens");
            System.out.println("[4] Weight cart");

            Scanner scan = new Scanner(System.in);
            int ant = scan.nextInt();

            switch (ant) {
                case 0:
                    System.out.println("Have a nice day!");
                    next = false;
                    break;

                case 1:
                    _profileList._patient.get(_patnummer).printPatientENG();
                    break;

                case 2:
                    _profileList._patient.get(_patnummer).bewerkenPatientENG(_zv);
                    break;

                case 3:
                    _medicijnList._medicijn.get(_patnummer).printMedicijn();
                    break;

                case 4:
                    _gewichtList.Gewicht.get(_patnummer).printgGrafiek();

                default:
                    break;
            }
        }
    }

    public void menuPatientENG () {

        boolean next = true;
        while (next) {

            System.out.println("Choice");
            System.out.println("[0] Exit");
            System.out.println("[1] Data");
            System.out.println("[2] Change Data");
            System.out.println("[3] Medicens");


            Scanner scan = new Scanner(System.in);
            int ant = scan.nextInt();

            switch (ant) {
                case 0:
                    System.out.println("Have a nice day!");
                    next = false;
                    break;

                case 1:
                    _profileList._patient.get(_patnummer).printPatientENG();
                    _medicijnList._medicijn.get(_patnummer).printMedicijn();
                    break;

                case 2:
                    _profileList._patient.get(_patnummer).bewerkenPatientzelfENG();
                    break;

                case 3:
                    _medicijnList._medicijn.get(_patnummer).printMedicijn();
                    break;

                default:
                    System.out.println("Oops!");
                    next = false;
                    break;
            }
        }
    }
}




