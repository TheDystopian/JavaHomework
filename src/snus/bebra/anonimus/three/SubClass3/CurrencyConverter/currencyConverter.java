package snus.bebra.anonimus.three.SubClass3.CurrencyConverter;

public class currencyConverter {
    private final double[] currencyRatios = {5.00, 3.00, 7.00, 20.00, 12.50, 2.50, 1.5};
    private final String[] currencyNames = {"Гео", "Симолеоны", "Монеты", "Кубик хлама", "Евродоллар", "Клетки", "Пиксели"};

    public String getCurrency(int index) {
        return currencyNames[index];
    }

    public double translateCurrency(double currency, int from, int to) {
        return currency * (currencyRatios[from] / currencyRatios[to]);
    }

    public int size() {
        return Math.min(currencyNames.length, currencyRatios.length);
    }

    @Override
    public String toString() {
        StringBuilder currencies = new StringBuilder();

        for (int i = 0; i < this.size(); i++)
            currencies.append(
                    String.format(
                        "%d. %-15s%15.2f%n",
                        i+1,
                        currencyNames[i],
                        currencyRatios[i]
                    )
            );
        return currencies.toString();
    }
}





