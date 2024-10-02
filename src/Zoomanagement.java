public class Zoomanagement {

        public static void main(String[] args) {
            Animal lion = new Animal("Cats", "Simba", 8, true);
            Animal dog = new Animal("Canine", "Snoopy", 2, true);
            Animal elephant = new Animal("Elephantidae", "Dumbo", 5, true);
    
            Zoo myZoo = new Zoo("Wildlife Park", "Ariana", 3);  // Limit the number of cages to 3
    
            // Adding animals to the zoo
            myZoo.addAnimal(lion);
            myZoo.addAnimal(dog);
            myZoo.addAnimal(elephant);
    
            // Display the animals in the zoo
            myZoo.displayAnimals();
    
            // Search for an animal by name
            int index = myZoo.searchAnimal(lion);
            System.out.println("Lion found at index: " + index);
    
            // Create another identical animal and search for it
            Animal identicalLion = new Animal("Cats", "Simba", 8, true);
            int identicalLionIndex = myZoo.searchAnimal(identicalLion);
            System.out.println("Identical Lion found at index: " + identicalLionIndex);
        }
    }
    