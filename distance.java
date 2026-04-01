class distance {
    int m, cm, mm;

    // Constructor
    distance(int m, int cm, int mm) {
        this.m = m;
        this.cm = cm;
        this.mm = mm;
    }

    // Method to add two distances
    void add(distance d) {
        mm += d.mm;
        cm += d.cm + (mm / 10);
        mm = mm % 10;

        m += d.m + (cm / 100);
        cm = cm % 100;
    }

    // Display result
    void display() {
        System.out.println(m + " m " + cm + " cm " + mm + " mm");
    }

    public static void main(String[] args) {
        distance d1 = new distance(1, 75, 8);
        distance d2 = new distance(2, 50, 6);

        d1.add(d2);
        d1.display();
    }
}
