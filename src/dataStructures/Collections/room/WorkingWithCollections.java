package dataStructures.Collections.room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WorkingWithCollections {
    public static void main(String[] args) {
        Room ucr = new Room("ucr", "Premier", 5, 175);
        Room utn = new Room("utn", "Premier", 5, 125);
        Room una = new Room("una", "Premier", 5, 150);

        Collection<Room> rooms = new ArrayList<>(List.of(ucr, utn, una));
        System.out.println(getRevenue(rooms));
    }

    private static double getRevenue(Collection<Room> rooms){
        return rooms.stream().mapToDouble(r -> r.getRate()).sum();
    }

}
