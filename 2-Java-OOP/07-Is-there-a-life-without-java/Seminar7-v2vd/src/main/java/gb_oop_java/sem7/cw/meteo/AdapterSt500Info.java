package gb_oop_java.sem7.cw.meteo;

import java.time.LocalDateTime;

public class AdapterSt500Info implements MeteoSensor {
    private SensorTemperature adapter;

    public AdapterSt500Info(SensorTemperature adapter) {
        this.adapter = adapter;
    }

    @Override
    public int getId() {
        return adapter.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) adapter.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(adapter.year(), 1, 1, 0, 0);
        dateTime.plusDays(adapter.day() - 1);
        dateTime.plusSeconds(adapter.second());
        return dateTime;
    }
}
