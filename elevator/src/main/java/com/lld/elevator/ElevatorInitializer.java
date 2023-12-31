package com.lld.elevator;

import com.lld.elevator.entities.Building;
import com.lld.elevator.entities.Floor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ElevatorInitializer {

    /**
     * Method to initialize elevator
     */
    public ElevatorInitializer() {
        List<Floor> floorList = new ArrayList<>();
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        Floor floor3 = new Floor(3);
        Floor floor4 = new Floor(4);
        Floor floor5 = new Floor(5);
        floorList.add(floor1);
        floorList.add(floor2);
        floorList.add(floor3);
        floorList.add(floor4);
        floorList.add(floor5);

        Building building = new Building(floorList);

    }

}
