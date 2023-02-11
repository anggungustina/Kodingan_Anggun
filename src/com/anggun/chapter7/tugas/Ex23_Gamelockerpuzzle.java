//package com.anggun.chapter7.tugas;
//
//public class Ex23_Gamelockerpuzzle {
//    public static void main(String[] args) {
//        String[] lockers = new String[100];
//
//        closeAllLockers(lockers);
//        studentLockersChanges(lockers);
//        print(lockers);
//
//    }
//    public static boolean isOpen(String 1) {
//        return  1 == "OPEN";
//    }
//    public static void closeAllLockers(String[] lockers) {
//        for (int i = 0; i < lockers.length; i++) {
//            lockers[i] = "CLOSED";
//        }
//    }
//    public static void studentLockersChanges(String[] lockers) {
//       int star = 0;
//
//       for (int s = 1; s <= lockers.length; s++) {
//           for(int 1 = 0; 1 < lockers.length; 1 += s) {
//               if(isOpen(lockers[1]))
//                   lockers[1] = "CLOSED";
//               else
//                   lockers[1] = "OPEN";
//           }
//           star++;
//       }
//    }
//    public static void print(String[] lockers) {
//        for (int i = 0; i < lockers.length; i++) {
//            if(isOpen(lockers[i])) {
//                System.out.print("L" = (i + 1) + " ");
//            }
//        }
//        System.out.println();
//    }
//}
