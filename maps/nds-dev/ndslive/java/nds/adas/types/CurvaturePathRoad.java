/**
 * Automatically generated by Zserio Java extension version 2.12.0.
 * Generator setup: writerCode, pubsubCode, serviceCode, sqlCode.
 */

package nds.adas.types;

public class CurvaturePathRoad implements zserio.runtime.io.PackableWriter, zserio.runtime.PackableSizeOf
{
    public static final class ZserioPackingContext extends zserio.runtime.array.PackingContext
    {
        public ZserioPackingContext()
        {
            featureReference_ = new nds.core.types.Var4ByteDirectedReference.ZserioPackingContext();
            curvaturePoints_ = new nds.adas.types.CurvaturePointList.ZserioPackingContext();
        }

        public nds.core.types.Var4ByteDirectedReference.ZserioPackingContext getFeatureReference()
        {
            return featureReference_;
        }

        public nds.adas.types.CurvaturePointList.ZserioPackingContext getCurvaturePoints()
        {
            return curvaturePoints_;
        }

        private nds.core.types.Var4ByteDirectedReference.ZserioPackingContext featureReference_;
        private nds.adas.types.CurvaturePointList.ZserioPackingContext curvaturePoints_;
    };

    public CurvaturePathRoad()
    {
    }

    public CurvaturePathRoad(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(in);
    }

    public CurvaturePathRoad(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        read(context, in);
    }

    public CurvaturePathRoad(
            nds.core.types.Var4ByteDirectedReference featureReference_,
            nds.adas.types.CurvaturePointList curvaturePoints_)
    {
        setFeatureReference(featureReference_);
        setCurvaturePoints(curvaturePoints_);
    }

    @Override
    public void initPackingContext(zserio.runtime.array.PackingContext context)
    {
        final ZserioPackingContext zserioContext = context.cast();
        featureReference_.initPackingContext(zserioContext.getFeatureReference());
        curvaturePoints_.initPackingContext(zserioContext.getCurvaturePoints());
    }

    @Override
    public int bitSizeOf()
    {
        return bitSizeOf(0);
    }

    @Override
    public int bitSizeOf(long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition += featureReference_.bitSizeOf(endBitPosition);
        endBitPosition += curvaturePoints_.bitSizeOf(endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    @Override
    public int bitSizeOf(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition += featureReference_.bitSizeOf(zserioContext.getFeatureReference(), endBitPosition);
        endBitPosition += curvaturePoints_.bitSizeOf(zserioContext.getCurvaturePoints(), endBitPosition);

        return (int)(endBitPosition - bitPosition);
    }

    public nds.core.types.Var4ByteDirectedReference getFeatureReference()
    {
        return featureReference_;
    }

    public void setFeatureReference(nds.core.types.Var4ByteDirectedReference featureReference_)
    {
        this.featureReference_ = featureReference_;
    }

    public nds.adas.types.CurvaturePointList getCurvaturePoints()
    {
        return curvaturePoints_;
    }

    public void setCurvaturePoints(nds.adas.types.CurvaturePointList curvaturePoints_)
    {
        this.curvaturePoints_ = curvaturePoints_;
    }

    @Override
    public boolean equals(java.lang.Object obj)
    {
        if (obj instanceof CurvaturePathRoad)
        {
            final CurvaturePathRoad that = (CurvaturePathRoad)obj;

            return
                    ((featureReference_ == null) ? that.featureReference_ == null : featureReference_.equals(that.featureReference_)) &&
                    ((curvaturePoints_ == null) ? that.curvaturePoints_ == null : curvaturePoints_.equals(that.curvaturePoints_));
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        int result = zserio.runtime.HashCodeUtil.HASH_SEED;

        result = zserio.runtime.HashCodeUtil.calcHashCode(result, featureReference_);
        result = zserio.runtime.HashCodeUtil.calcHashCode(result, curvaturePoints_);

        return result;
    }

    public void read(zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        featureReference_ = new nds.core.types.Var4ByteDirectedReference(in);

        curvaturePoints_ = new nds.adas.types.CurvaturePointList(in);
    }

    public void read(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamReader in)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        featureReference_ = new nds.core.types.Var4ByteDirectedReference(zserioContext.getFeatureReference(), in);

        curvaturePoints_ = new nds.adas.types.CurvaturePointList(zserioContext.getCurvaturePoints(), in);
    }

    @Override
    public long initializeOffsets()
    {
        return initializeOffsets(0);
    }

    @Override
    public long initializeOffsets(long bitPosition)
    {
        long endBitPosition = bitPosition;

        endBitPosition = featureReference_.initializeOffsets(endBitPosition);
        endBitPosition = curvaturePoints_.initializeOffsets(endBitPosition);

        return endBitPosition;
    }

    @Override
    public long initializeOffsets(zserio.runtime.array.PackingContext context, long bitPosition)
    {
        final ZserioPackingContext zserioContext = context.cast();
        long endBitPosition = bitPosition;

        endBitPosition = featureReference_.initializeOffsets(zserioContext.getFeatureReference(), endBitPosition);
        endBitPosition = curvaturePoints_.initializeOffsets(zserioContext.getCurvaturePoints(), endBitPosition);

        return endBitPosition;
    }

    @Override
    public void write(zserio.runtime.io.BitStreamWriter out) throws java.io.IOException
    {
        featureReference_.write(out);

        curvaturePoints_.write(out);
    }

    @Override
    public void write(zserio.runtime.array.PackingContext context, zserio.runtime.io.BitStreamWriter out)
            throws java.io.IOException
    {
        final ZserioPackingContext zserioContext = context.cast();
        featureReference_.write(zserioContext.getFeatureReference(), out);

        curvaturePoints_.write(zserioContext.getCurvaturePoints(), out);
    }

    private nds.core.types.Var4ByteDirectedReference featureReference_;
    private nds.adas.types.CurvaturePointList curvaturePoints_;
}
