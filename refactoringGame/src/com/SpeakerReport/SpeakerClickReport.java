package com.SpeakerReport;

public class SpeakerClickReport
{
    public int totalOfAllSpeakerClicks;
    public int numberOfIndividualClicks;

    public int GetPercentageOfTotalForIndividualSpeaker()
    {
        if (totalOfAllSpeakerClicks == 0)
        {
            return 0;
        }

        double ratioOfTotal = (double)numberOfIndividualClicks / totalOfAllSpeakerClicks;
        int percentFormOfRatio = (int) Math.floor(100 * ratioOfTotal);
        return percentFormOfRatio;
    }
}