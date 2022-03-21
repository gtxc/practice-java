package com.gtxc.practice.hackerrank;

/*
    Created by gt at 2:23 PM on Tuesday, February 15, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.*;

class Studentt {
    private final int id;
    private final String name;
    private final double cgpa;

    public Studentt(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {
//    private List<Studentt> students;
    private final PriorityQueue<Studentt> studentQueue = new PriorityQueue<>(
            Comparator.comparing(Studentt::getCgpa).reversed()
            .thenComparing(Studentt::getName)
            .thenComparing(Studentt::getId));

    public List<Studentt> getStudents(List<String> events) {

        events.forEach(event -> {
            String[] studentInfo = event.split(" ");
            if (studentInfo[0].equals("SERVED")) {
                studentQueue.poll();
            } else if (studentInfo[0].equals("ENTER")){
                studentQueue.add(new Studentt(Integer.parseInt(studentInfo[3]), studentInfo[1], Double.parseDouble(studentInfo[2])));
            }
        });
        List<Studentt> studentts = new ArrayList<>();
        while (!studentQueue.isEmpty()) {
            studentts.add(studentQueue.poll());
        }
        return studentts;
    }

    // old way without Priority Queue
//    public List<Studentt> getStudents(List<String> events) {
//        while (events.size() > 0) {
//            String[] studentInfo = events.remove(0).split(" ");
//            String event = studentInfo[0];
//            String name = null;
//            double cgpa = .0;
//            int id = 0;
//            if (studentInfo.length == 4) {
//                name = studentInfo[1];
//                cgpa = Double.parseDouble(studentInfo[2]);
//                id = Integer.parseInt(studentInfo[3]);
//            }
//            if (event.equals("ENTER")) {
//                students.add(new Studentt(id, name, cgpa));
//            } else if (event.equals("SERVED") && students.size() > 0) {
//                students.sort((s1, s2) -> {
//                    if (s1.getCgpa() == s2.getCgpa()) {
//                        if (s1.getName().equals(s2.getName())) {
//                            return s1.getId() - s2.getId();
//                        } else {
//                            return s1.getName().compareTo(s2.getName());
//                        }
//                    } else {
//                        return String.valueOf(s2.getCgpa()).compareTo(String.valueOf(s1.getCgpa()));
//                    }
//                });
//                students.remove(0);
//            }
//        }
//        return this.students;
//    }
}


public class PriorityQueueMain {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Studentt> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Studentt st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
