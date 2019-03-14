package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class ProductData {
    private String productId;
    private BigDecimal productPrice;
    private String productName;
    private Date productSnapshotDate;
    private String productType;

    public ProductData(String productId, BigDecimal productPrice, String productName, Date productSnapshotDate, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productName = productName;
        this.productSnapshotDate = productSnapshotDate;
        this.productType = productType;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductSnapshotDate(Date productSnapshotDate) {
        this.productSnapshotDate = productSnapshotDate;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductId() {
        return productId;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public Date getProductSnapshotDate() {
        return productSnapshotDate;
    }

    public String getProductType() {
        return productType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productPrice, productSnapshotDate, productType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ProductData that = (ProductData) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(productPrice, that.productPrice) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(productSnapshotDate, that.productSnapshotDate) &&
                Objects.equals(productType, that.productType);
    }
}
