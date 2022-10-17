package practice.hospital;

import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        float minTemp = 32;
        float maxTemp = 40;
        float[] patientTemperatures = new float[patientsCount];

        for (int i = 0; i < patientTemperatures.length; i++) {
            patientTemperatures[i] = minTemp + (float) (Math.random() * (maxTemp - minTemp));
        }
        return patientTemperatures;
    }

    public static String getReport(float[] temperatureData) {

        float sumTemp = 0;
        int count = 1;

        for (int i = 0; i < temperatureData.length; i++) {
            sumTemp += temperatureData[i];
            if (temperatureData[i] >= 36.2 && temperatureData[i] <= 36.9) {
                count++;
            }
        }

        float averageTemp = sumTemp / temperatureData.length;
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */

        String report =
            "Температуры пациентов: " + Arrays.toString(temperatureData).replaceAll("[\\[|\\]|,]", "") +
            "\nСредняя температура: " + (float) Math.round(averageTemp * 100) / 100 +
            "\nКоличество здоровых: " + count;
        return report;
    }
}
