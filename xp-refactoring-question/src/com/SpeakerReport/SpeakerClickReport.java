package com.SpeakerReport;

public class SpeakerClickReport
{
    public int total;
    public int indTotal;

    // get ration of individual clicks to total clicks for a given speaker.
    public int GetRatio()
    {
        //total clicks for all speakers equaling 0
        if (total == 0) return 0;
        //take clicks for this speaker and get the percentage compared to total for all speakers
        return (int) (100.0* indTotal / total);
    }
}