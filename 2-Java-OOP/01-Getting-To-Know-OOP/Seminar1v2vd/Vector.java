package Seminar1v2;

public class Vector {
    private Integer x;
    private Integer y;
    private Integer z;

    public Vector(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     *
     * @return длинна вектора
     */
    public double lenghtVector() {
        return Math.sqrt(x*x+y*y+z*z);
    }

    /**
     * @apiNote метод, вычисляющий скалярное произведение.
     * @param vector2 выбор вектора, с котором необходимо выполнить скалярное произведение
     * @return скарялное произведение двух векторов
     */
    public double scalar(Vector vector2) {
        return this.x*vector2.x + this.y*vector2.y + this.z*vector2.z;
    }

    /**
     * @apiNote метод, вычисляющий вектроное произведение с другим вектором
     * @param vector2 выбор вектора, с котором необходимо вычислить вектроеное произведение
     * @return новый вектор
     */
    public Vector multiVector(Vector vector2) {
        return new Vector(
                this.y*vector2.z - this.z*vector2.y,
                this.z*vector2.x - this.x*vector2.z,
                this.x*vector2.y - this.y*vector2.x);
    }

    /**
     * @apiNote метод, вычисляющий угол между векторами
     * @param vector2 выбор вектора, с котором необходимо найти косинус
     * @return косинус вектором
     */
    public double cos(Vector vector2) {
        return scalar(vector2) / (lenghtVector() * vector2.lenghtVector());
    }
}