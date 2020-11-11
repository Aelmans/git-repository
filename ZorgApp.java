package com.company;
import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;

public class ZorgApp {
    boolean _zv;
    int _patnummer;
    //Att
    ProfileList _profileList;
    MedicijnList _medicijnList;
    GewichtList _gewichtList;

    //constructor
    public ZorgApp(int nr, boolean zv) {
        _zv = zv;
        _patnummer = nr;

        _medicijnList = new MedicijnList(true);
        _profileList = new ProfileList(_medicijnList);
        _gewichtList = new GewichtList();

    }

    //Nieuwe methode
    public void menu() {

        boolean next = true;
        while (next) {

            System.out.println("Geef uw keuze");
            System.out.println("[0] Scherm verlaten");
            System.out.println("[1] Gegevens inzien");
            System.out.println("[2] Gegevens wijzigen");
            System.out.println("[3] Medicijnen");
            System.out.println("[4] Gewicht grafiek inzien");

            Scanner scan = new Scanner(System.in);
            int ant = scan.nextInt();

            switch (ant) {
                case 0:
                    //System.out.println("Tot ziens!");
                    next = false;
                    break;

                case 1:
                    _profileList._patient.get(_patnummer).printPatient();
                    break;

                case 2:
                    _profileList._patient.get(_patnummer).bewerkenPatient(_zv);
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

    public void menuPatient() {

        boolean next = true;
        while (next) {

            System.out.println("Geef uw keuze");
            System.out.println("[0] Scherm verlaten");
            System.out.println("[1] Gegevens inzien");
            System.out.println("[2] Gegevens wijzigen");
            System.out.println("[3] Medicijnen");

            Scanner scan = new Scanner(System.in);
            int ant = scan.nextInt();

            switch (ant) {
                case 0:
                   //System.out.println("Tot ziens!");
                    next = false;
                    break;

                case 1:
                    _profileList._patient.get(_patnummer).printPatient();
                    _medicijnList._medicijn.get(_patnummer).printMedicijn();
                    break;

                case 2:
                    _profileList._patient.get(_patnummer).bewerkenPatientzelf();
                    break;

                case 3:
                    _medicijnList._medicijn.get(_patnummer).printMedicijn();
                    break;

                default:
                    break;
            }
        }
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
                System.out.println("[4] Weight chart");

                Scanner scan = new Scanner(System.in);
                int ant = scan.nextInt();

                switch (ant) {
                    case 0:
                       //System.out.println("Have a nice day!");
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
                            //System.out.println("Have a nice day!");
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




