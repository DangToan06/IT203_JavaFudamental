
void main() {
    Scanner sc = new Scanner(System.in);
    ProductRepository productRepository = new ProductRepository();

    productRepository.add(new ElectronicProduct("EP001", "TiVi", 5000000, 12));
    productRepository.add(new ElectronicProduct("EP002", "Máy giặt", 3000000, 6));
    productRepository.add(new FoodProduct("FP001", "bim bim", 10000, 10));
    productRepository.add(new FoodProduct("FP002", "Sting", 20000, 20));


    // Hiển thị danh sách
    for (Product product : productRepository.findAll()) {
        product.displayInfo();
        System.out.println("Thành tiền: "+ product.calculateFinalPrice());
    }

    // Tìm kiếm
    System.out.println("Nhập id sản phẩm muốn tìm: ");
    String searchById = sc.nextLine();

    if(productRepository.findById(searchById) != null) {
        Product product = productRepository.findById(searchById);
        product.displayInfo();
    }else {
        System.out.println("Sản phẩm không tồn tại");
    }

    // Xắp sếp theo giá tăng dần
    Collections.sort(productRepository.findAll(), new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return Double.compare(o1.calculateFinalPrice(), o2.calculateFinalPrice());
        }
    });

    System.out.println(productRepository.findAll());
    //Thống kê

}
