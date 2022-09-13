import java.util.Objects;

public class ObjectsClassApp {
    public static class Product{
        private String data;

        public String getData() {
            return data;
        }

        public Product(String data) {
            this.data = data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Product product = (Product)  o;

            return data != null ? data.equals(product.data) : product.data == null;
        }

        @Override
        public int hashCode() {
            return data != null ? data.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "product{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        execute(new Product("FAJAR"));
        execute(null);//contoh jika kita memanggil null ketika menggunakan ObjectsClass
        Product x = new Product("ujeh");
        System.out.println(x.getData());
    }

    public static void execute(Product product){
        /*
        jika tidak menggunakan objects class maka kita perlu mengecek terlebih dahulu apakan valuenya null

        if (product != null){//harus melakukan pengecekan terus jika tidak menggunakan objectsClass
            System.out.println(product.toString());
            System.out.println(product.hashCode());

        }
        */

        /*
        dengan menggunakan objectsClass,dia tidak akan error ketika ada data yang null atau product yang null
         */
        System.out.println(Objects.toString(product));
        System.out.println(Objects.hashCode(product));

    }
}
