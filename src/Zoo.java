public class Zoo {

    Animal[] animals;
    String name, city;
    int nbrAnimals;
    final int nbrCages = 25;  // Constant: The zoo can hold a maximum of 25 animals

    public Zoo() {
    }

    public Zoo(String name, String city,int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrAnimals = 0; 

    }
    public boolean addAnimal(Animal animal) {
        if (nbrAnimals >= nbrCages) {
            System.out.println("Cannot add animal. The zoo is full.");
            return false;
        }
        
        if (searchAnimal(animal) != -1) {
            System.out.println("Animal " + animal.name + " already exists in the zoo.");
            return false;
        }

        animals[nbrAnimals] = animal;  
        nbrAnimals++;  
        System.out.println("Animal " + animal.name + " added to the zoo.");
        return true;
    }


    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + nbrCages + " N° animals: " + nbrAnimals);
    } // Method to display all animals in the zoo
    public void displayAnimals() {
        System.out.println("Animals in " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }  // Method to search for an animal by its name
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;  
            }
        }
        return -1;  
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);  // Search for the animal by name
        if (index == -1) {
            System.out.println("Animal " + animal.name + " not found in the zoo.");
            return false;  // Return false if the animal is not found
        }

        // Shift the elements to the left to fill the gap
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        // Set the last slot to null after shifting
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;  // Decrease the number of animals
        System.out.println("Animal " + animal.name + " removed from the zoo.");
        return true;
    }
    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;  // Return true if zoo is full
    }
// Method to compare two zoos and return the one with the most animals
public static Zoo comparerZoo(Zoo z1, Zoo z2) {
    if (z1.nbrAnimals > z2.nbrAnimals) {
        return z1;
    } else if (z2.nbrAnimals > z1.nbrAnimals) {
        return z2;
    } else {
        System.out.println("Both zoos have the same number of animals.");
        return z1;  // In case of a tie, return the first zoo (could be any choice)
    }
}

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + nbrCages + " N° animals: " + nbrAnimals;
    }
}