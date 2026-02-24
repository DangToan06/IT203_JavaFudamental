
void main() {
//    Bài01
//    Circle c1 = new Circle();
//
//    c1.setRadius(3);
//
//    System.out.println("Chu vi hình tròn là: " + c1.getPerimeter());
//    System.out.println("Diện tích hình tròn là: " + c1.getArea());
//
//    Rectangle r1 = new Rectangle();
//
//    r1.setHeight(8);
//    r1.setWidth(5);
//
//    System.out.println("Chu vi hình chữ nhật là: " + r1.getPerimeter());
//    System.out.println("Diện tích hình chữ nhật là: " + r1.getArea());


//    Bài02
//    Car car = new Car("Toyota");
//
//    System.out.println(car.getBrand() + " Di chuyển bằng: " + car.move());
//
//    Bicycle bicycle = new Bicycle("Thống Nhất");
//    System.out.println(bicycle.getBrand() + " Di chuyển bằng: " + bicycle.move());

//    Bài03
//    Duck duck = new Duck("Vịt");
//
//    System.out.println("Con " + duck.name + " " + duck.fly() + " " + duck.swim());
//
//    Fish fish = new Fish("Cá");
//
//    System.out.println("Con " + fish.name + " " + fish.swim());

//    Bài04
//    RemoteControl smartLight = new RemoteControl() {
//        @Override
//        public void powerOn() {
//            System.out.println("Đèn đã bật");
//        }
//    };
//
//    smartLight.powerOn();
//    smartLight.checkBattery();

//    Bài05
//    OfficeStaff os = new OfficeStaff("Huy", 3000);
//
//    System.out.println("Lương nhân viên là: " + os.calculateSalary());
//
//    Manager mana = new Manager("Toan", 4000);
//
//    System.out.println("Lương quản lý là: " + mana.calculateSalary());

//    Bài06
    List<Product> products = new ArrayList<>();

    products.add(new Product("Tivi", 15000));
    products.add(new Product("Bàn", 15000));
    products.add(new Product("Tủ Lạnh", 15000));
    products.add(new Product("Ghế", 15000));


//    Anonymous Class
    Collections.sort(products, new Comparator<Product>() {

        // Có thể thêm thuộc tính nội bộ
        private int compareCount = 0;

        @Override
        public int compare(Product o1, Product o2) {
            compareCount ++;
            return Double.compare(o1.getPrice(), o2.getPrice());
        }
    });

    System.out.println("Sắp xếp theo giá (Anonymous Class):");
    products.forEach(System.out::println);

    System.out.println("---------------------------");


//    Lambda Expression
    Collections.sort(products, (p1,p2)-> p1.getName().compareTo(p2.getName()) );

    System.out.println("Sắp xếp theo tên (Lambda):");
    products.forEach(System.out::println);
}
