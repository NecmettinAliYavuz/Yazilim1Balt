void main() {

    double vize1 = 60.0 / 4;
    double vize2 = 70.0 / 4;
    double final1 = 75.0 / 2;
    double ort = vize1 + vize2 + final1;
    System.out.println(ort);



    if (ort >= 85) {
        System.out.println("Takdir Aldınız");
    }

    else if (ort >= 75 && ort <= 84) {
        System.out.println("Teşekkür Aldınız");
    }

    else if (ort >= 50 && ort <= 74) {
        System.out.println("Geçtiniz");
    }

    else if (ort<=50) {
        System.out.println("Kaldınız");
    }


}