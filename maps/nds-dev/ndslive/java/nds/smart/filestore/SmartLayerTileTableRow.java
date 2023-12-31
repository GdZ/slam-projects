/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.smart.filestore;

public class SmartLayerTileTableRow
{
    public int getTileId()
    {
        return this.tileId_;
    }

    public void setTileId(int tileId_)
    {
        isTileIdNull = false;
        this.tileId_ = tileId_;
    }

    public void setNullTileId()
    {
        isTileIdNull = true;
        this.tileId_ = (int)0;
    }

    public boolean isNullTileId()
    {
        return isTileIdNull;
    }

    public nds.smart.tile.SmartLayerTile getSmartLayer()
    {
        return this.smartLayer_;
    }

    public void setSmartLayer(nds.smart.tile.SmartLayerTile smartLayer_)
    {
        this.smartLayer_ = smartLayer_;
    }

    public void setNullSmartLayer()
    {
        this.smartLayer_ = null;
    }

    public boolean isNullSmartLayer()
    {
        return this.smartLayer_ == null;
    }

    public nds.smart.types.SmartLayerHeader getHeader()
    {
        return this.header_;
    }

    public void setHeader(nds.smart.types.SmartLayerHeader header_)
    {
        this.header_ = header_;
    }

    public void setNullHeader()
    {
        this.header_ = null;
    }

    public boolean isNullHeader()
    {
        return this.header_ == null;
    }

    private boolean isTileIdNull = true;
    private int tileId_;
    private nds.smart.tile.SmartLayerTile smartLayer_;
    private nds.smart.types.SmartLayerHeader header_;
}
