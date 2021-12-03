import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void setMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setMinStation() {
        Radio radio = new Radio();
        radio.setMinStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationTwo() {
        Radio radio = new Radio();
        radio.setMaxStation();
        radio.setCurrentStation(10);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationThree() {
        Radio radio = new Radio();
        radio.setMinStation();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void setNextStation() {
        Radio radio = new Radio();
        radio.setNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setNextStationTwo() {
        Radio radio = new Radio();
        radio.setMaxStation();
        radio.setNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setBackStation() {
        Radio radio = new Radio();
        radio.setBackStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setBackStationTwo() {
        Radio radio = new Radio();
        radio.setMaxStation();
        radio.setBackStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void setMaxVelume() {
        Radio radio = new Radio();
        radio.setMaxVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void getCurrentVolume() {
        Radio radio = new Radio();
        radio.getCurrentVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setIncreaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeTwo() {
        Radio radio = new Radio();
        radio.setMaxVolume();
        radio.setIncreaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolume() {
        Radio radio = new Radio();
        radio.setDecreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setDecreaseVolumeTwo() {
        Radio radio = new Radio();
        radio.setMaxVolume();
        radio.setDecreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

}