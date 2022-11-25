interface InvoicePersistence {
    public void save(Invoice invoice);
}

public class DataBasePersistence implements InvoicePersistence {
    @Override
    public void save(Invoice invoice) {
        // Save to DB
    }
}

public class FilePersistence implements InvoicePersistence {
    @Override
    public void save(Invoice invoice) {
        // Save to file
    }
}