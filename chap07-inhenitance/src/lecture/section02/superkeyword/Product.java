package lecture.section02.superkeyword;


// 부모 클래스  Product
public class Product {


    /* 기본요소 1.필드 */
    private String code;    // 상품코드
    private String brand;   // 브랜드
    private String name;    // 상품명
    private int price;      // 가격
    private Date manufacturingDate; // 제조일자


    /*기본요소 2. 생성자*/

    // 기본 생성자
    public Product() {
        System.out.println("Product 클래스의 기본생성자 호출");
    }

    // 모든 필드을 초기화하는 생성자
    public Product(String code, String brand, String name, int price, Date manufacturingDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;

        System.out.println("Product 클래스의 모든필드를 초기화하는 생성자 호출함...");
    }

    /*기본요소 3.매서드*/
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }


    /* 오버라이딩*/
    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}
