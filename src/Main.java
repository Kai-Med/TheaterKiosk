void main() {
    System.out.print("Please enter your age: ");
    Scanner in = new Scanner(System.in);
    int kiosk = in.nextInt();
    if (kiosk >= 21) {
        System .out.println("Your age: " + kiosk);
        System.out.println("You get a wrist band");
    }


}