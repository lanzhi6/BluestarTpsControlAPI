package me.lanzhi.bluestartpscontrol;

public interface BluestarControlAPI
{
    public boolean setmspt(long mspt) throws MsptIllegalException;

    public long getmspt();

    public String tpsFormat(double tps);
}
