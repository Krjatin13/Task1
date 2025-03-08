import java.util.*;

class Room {
    int number;
    boolean available = true;

    Room(int number) {
        this.number = number;
    }
}

class Hotel {
    List<Room> rooms = new ArrayList<>();

    Hotel(int totalRooms) {
        for (int i = 1; i <= totalRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    void showAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.available) {
                System.out.println("Room " + room.number);
            }
        }
    }

    void bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.number == roomNumber && room.available) {
                room.available = false;
                System.out.println("Room " + roomNumber + " booked successfully!");
                return;
            }
        }
        System.out.println("Room not available or does not exist.");
    }
}

public class HotelSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(5);

        while (true) {
            System.out.println("\n1. Show Available Rooms\n2. Book Room\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                hotel.showAvailableRooms();
            } else if (choice == 2) {
                System.out.print("Enter Room Number: ");
                int roomNumber = scanner.nextInt();
                hotel.bookRoom(roomNumber);
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
