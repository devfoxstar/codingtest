package com.devfoxstar.test;

import java.util.*;
import java.util.List;
import java.text.SimpleDateFormat;

public class CarRental {
    public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {
        Boolean returnVal = true;
        List<RentalTime> list = rentalTimes.stream().toList();

        for (int i=0; i<list.size(); i++) {
            for (int j=(i + 1); j<list.size() - 1; j++) {
                returnVal = list.get(i).getStart().before(list.get(j).getStart());
                if (returnVal == false) break;

                returnVal = list.get(i).getEnd().before(list.get(j).getEnd());
                if (returnVal == false) break;
            }
        }

        return returnVal;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        ArrayList<RentalTime> rentalTimes = new ArrayList<RentalTime>();
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 22:10"), sdf.parse("03/05/2020 22:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));

        System.out.println(CarRental.canScheduleAll(rentalTimes));
    }
}

class RentalTime {
    private Date start, end;

    public RentalTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}