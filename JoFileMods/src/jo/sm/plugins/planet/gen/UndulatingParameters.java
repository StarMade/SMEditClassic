package jo.sm.plugins.planet.gen;

import jo.sm.data.BlockTypes;
import jo.sm.ui.act.plugin.Description;



@Description(displayName="Giant's Causeway", shortDescription="Create a hexagonal slab like surface.")
public class UndulatingParameters
{
    @Description(displayName="", shortDescription="Planetary radius")
    private int     mPlanetRadius;
    @Description(displayName="", shortDescription="Tallest point above baseline (-ve for below)")
    private int     mPlanetHeight;
    @Description(displayName="", shortDescription="Block type to fill with")
    private short mFillWith;
    
    public UndulatingParameters()
    {
        mPlanetRadius = 250;
        mPlanetHeight = 32;
        mFillWith = BlockTypes.TERRAIN_ROCK_ID;
    }

    public int getPlanetRadius()
    {
        return mPlanetRadius;
    }

    public void setPlanetRadius(int planetRadius)
    {
        mPlanetRadius = planetRadius;
    }

    public int getPlanetHeight()
    {
        return mPlanetHeight;
    }

    public void setPlanetHeight(int planetHeight)
    {
        mPlanetHeight = planetHeight;
    }

    public short getFillWith()
    {
        return mFillWith;
    }

    public void setFillWith(short fillWith)
    {
        mFillWith = fillWith;
    }
}
