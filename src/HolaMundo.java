public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        convertToDolar(100, "MXN");
    }

    /**
     * Description: Convert quantity of money in dollars
     * @param quantity Quantity of money
     * @param currency Kind of money MXN or COP
     * @return quantity Update quantity in dollars
     */
    public static double convertToDolar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return  quantity;
    }
}
