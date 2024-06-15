package dto;

public record Rectangle(double lado) {
    public double area() {
        return Math.pow(lado, 2);
    }
}
