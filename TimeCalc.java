class TimeCalc {
    int hr, min, sec;

    // Constructor
    TimeCalc(int h, int m, int s) {
        hr = h;
        min = m;
        sec = s;
    }

    // Method to add two time objects
    void addTime(TimeCalc t) {
        sec += t.sec;
        min += t.min + (sec / 60);
        sec = sec % 60;

        hr += t.hr + (min / 60);
        min = min % 60;
    }

    // Display method
    void display() {
        System.out.println(hr + " hr " + min + " min " + sec + " sec");
    }

    public static void main(String[] args) {
        // Creating objects
        TimeCalc t1 = new TimeCalc(2, 50, 45);
        TimeCalc t2 = new TimeCalc(1, 20, 30);

        t1.addTime(t2);
        t1.display();
    }
}
