package Tarea3.Models;

    public enum Jobs {
       programer("programador"), boss ("jefe");

        private final String description;

        Jobs(String description) {
            this.description = description;
        }

        public static Jobs fromIndex(int opt) {
            return Jobs.values()[opt];
        }

        public static void printMenu() {
            System.out.println("Elige una opción:");
            for (int i = 0; i < Jobs.values().length; i++) {
                System.out.println(i +"." + Jobs.values()[i].description);
            }
        }
    }

