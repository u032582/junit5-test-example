package com.example.junittest;

public class TemperatureConverter {

    private double temperature;
    private boolean isCelsius;

    /**
     * 温度と温度の種類を設定するコンストラクタ
     * 
     * @param temperature 温度
     * @param isCelsius   温度の種類（trueなら摂氏、falseなら華氏）
     */
    public TemperatureConverter(double temperature, boolean isCelsius) {
        this.temperature = temperature;
        this.isCelsius = isCelsius;
    }

    /**
     * 温度の変換を行うメソッド
     * 
     * @param toCelsius trueなら摂氏に、falseなら華氏に変換する
     * @return 変換された温度
     */
    public double convert(boolean toCelsius) {
        if (isCelsius == toCelsius) {
            return temperature;
        }

        if (toCelsius) {
            // 華氏から摂氏への変換
            return (temperature - 32) * 5 / 9;
        } else {
            // 摂氏から華氏への変換
            return temperature * 9 / 5 + 32;
        }
    }
}