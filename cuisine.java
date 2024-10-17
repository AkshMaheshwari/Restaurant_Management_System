class cuisine {
    int discount;

    public void appetizer() {
        // Empty method to be overridden
    }

    public void Main_course() {
        // Empty method to be overridden
    }

    public void Dessert() {
        // Empty method to be overridden
    }

    public String getAppetizerName(int index) {
        return "";
    }

    public int getAppetizerPrice(int index) {
        return 0;
    }

    public String getMainCourseName(int index) {
        return "";
    }

    public int getMainCoursePrice(int index) {
        return 0;
    }

    public String getDessertName(int index) {
        return "";
    }

    public int getDessertPrice(int index) {
        return 0;
    }
}

class Rajasthani extends cuisine {
    String appetizers[] = {"Pyaaz ki Kachori", "Panchamel Sabji"};
    int price_A[] = {150, 200};
    String Main_course[] = {"Dal Banjara", "Tej laung pulav", "Missi Roti", "Laal Maas"};
    int price_M[] = {200, 250, 100, 400};
    String Dessert[] = {"Churma Ladoo"};
    int price_D[] = {100};

    @Override
    public void appetizer() {
        System.out.println("\nAppetizers for Rajasthani are as follows:");
        for (int i = 0; i < price_A.length; i++) {
            System.out.println((i + 1) + ". " + appetizers[i] + "______________________________________" + price_A[i]);
        }
    }

    @Override
    public void Main_course() {
        System.out.println("\nMain Course for Rajasthani are as follows:");
        for (int i = 0; i < price_M.length; i++) {
            System.out.println((i + 1) + ". " + Main_course[i] + "______________________________________" + price_M[i]);
        }
    }

    @Override
    public void Dessert() {
        System.out.println("\nDessert for Rajasthani are as follows:");
        for (int i = 0; i < price_D.length; i++) {
            System.out.println((i + 1) + ". " + Dessert[i] + "______________________________________" + price_D[i]);
        }
    }

    @Override
    public String getAppetizerName(int index) {
        return appetizers[index - 1];
    }

    @Override
    public int getAppetizerPrice(int index) {
        return price_A[index - 1];
    }

    @Override
    public String getMainCourseName(int index) {
        return Main_course[index - 1];
    }

    @Override
    public int getMainCoursePrice(int index) {
        return price_M[index - 1];
    }

    @Override
    public String getDessertName(int index) {
        return Dessert[index - 1];
    }

    @Override
    public int getDessertPrice(int index) {
        return price_D[index - 1];
    }
}

class TamilNadu extends cuisine {
    String appetizers[] = {"Dal Vadai", "Beans Poriyal"};
    int price_A[] = {150, 200};
    String Main_course[] = {"Pulli Shadam", "Rassam", "Parotta", "Chicken Chettinad"};
    int price_M[] = {250, 200, 150, 350};
    String Dessert[] = {"Sewai Payasam"};
    int price_D[] = {100};

    @Override
    public void appetizer() {
        System.out.println("\nAppetizers for Tamil Nadu are as follows:");
        for (int i = 0; i < price_A.length; i++) {
            System.out.println((i + 1) + ". " + appetizers[i] + "______________________________________" + price_A[i]);
        }
    }

    @Override
    public void Main_course() {
        System.out.println("\nMain Course for Tamil Nadu are as follows:");
        for (int i = 0; i < price_M.length; i++) {
            System.out.println((i + 1) + ". " + Main_course[i] + "______________________________________" + price_M[i]);
        }
    }

    @Override
    public void Dessert() {
        System.out.println("\nDessert for Tamil Nadu are as follows:");
        for (int i = 0; i < price_D.length; i++) {
            System.out.println((i + 1) + ". " + Dessert[i] + "______________________________________" + price_D[i]);
        }
    }

    @Override
    public String getAppetizerName(int index) {
        return appetizers[index - 1];
    }

    @Override
    public int getAppetizerPrice(int index) {
        return price_A[index - 1];
    }

    @Override
    public String getMainCourseName(int index) {
        return Main_course[index - 1];
    }

    @Override
    public int getMainCoursePrice(int index) {
        return price_M[index - 1];
    }

    @Override
    public String getDessertName(int index) {
        return Dessert[index - 1];
    }

    @Override
    public int getDessertPrice(int index) {
        return price_D[index - 1];
    }
}

class Maharastran extends cuisine {
    String appetizers[] = {"Kothimir Vadi", "Khamag Kakdi"};
    int price_A[] = {150, 100};
    String Main_course[] = {"Bharli wangi", "Masale Bhat", "Puri", "Malvani Chicken Curry"};
    int price_M[] = {150, 150, 150, 350};
    String Dessert[] = {"Shrikand"};
    int price_D[] = {100};

    @Override
    public void appetizer() {
        System.out.println("\nAppetizers for Maharashtran are as follows:");
        for (int i = 0; i < price_A.length; i++) {
            System.out.println((i + 1) + ". " + appetizers[i] + "______________________________________" + price_A[i]);
        }
    }

    @Override
    public void Main_course() {
        System.out.println("\nMain Course for Maharashtran are as follows:");
        for (int i = 0; i < price_M.length; i++) {
            System.out.println((i + 1) + ". " + Main_course[i] + "______________________________________" + price_M[i]);
        }
    }

    @Override
    public void Dessert() {
        System.out.println("\nDessert for Maharashtran are as follows:");
        for (int i = 0; i < price_D.length; i++) {
            System.out.println((i + 1) + ". " + Dessert[i] + "______________________________________" + price_D[i]);
        }
    }

    @Override
    public String getAppetizerName(int index) {
        return appetizers[index - 1];
    }

    @Override
    public int getAppetizerPrice(int index) {
        return price_A[index - 1];
    }

    @Override
    public String getMainCourseName(int index) {
        return Main_course[index - 1];
    }

    @Override
    public int getMainCoursePrice(int index) {
        return price_M[index - 1];
    }

    @Override
    public String getDessertName(int index) {
        return Dessert[index - 1];
    }

    @Override
    public int getDessertPrice(int index) {
        return price_D[index - 1];
    }
}

class Punjabi extends cuisine {
    String appetizers[] = {"Hara Bhara Kebab", "Paneer Makhani"};
    int price_A[] = {200, 300};
    String Main_course[] = {"Dal Makhni", "Pudina Paratha", "Jeera Rice", "Murgh Makhni"};
    int price_M[] = {250, 150, 200, 450};
    String Dessert[] = {"Lauki da Halwa"};
    int price_D[] = {150};

    @Override
    public void appetizer() {
        System.out.println("\nAppetizers for Punjabi are as follows:");
        for (int i = 0; i < price_A.length; i++) {
            System.out.println((i + 1) + ". " + appetizers[i] + "______________________________________" + price_A[i]);
        }
    }

    @Override
    public void Main_course() {
        System.out.println("\nMain Course for Punjabi are as follows:");
        for (int i = 0; i < price_M.length; i++) {
            System.out.println((i + 1) + ". " + Main_course[i] + "______________________________________" + price_M[i]);
        }
    }

    @Override
    public void Dessert() {
        System.out.println("\nDessert for Punjabi are as follows:");
        for (int i = 0; i < price_D.length; i++) {
            System.out.println((i + 1) + ". " + Dessert[i] + "______________________________________" + price_D[i]);
        }
    }

    @Override
    public String getAppetizerName(int index) {
        return appetizers[index - 1];
    }

    @Override
    public int getAppetizerPrice(int index) {
        return price_A[index - 1];
    }

    @Override
    public String getMainCourseName(int index) {
        return Main_course[index - 1];
    }

    @Override
    public int getMainCoursePrice(int index) {
        return price_M[index - 1];
    }

    @Override
    public String getDessertName(int index) {
        return Dessert[index - 1];
    }

    @Override
    public int getDessertPrice(int index) {
        return price_D[index - 1];
    }
}
