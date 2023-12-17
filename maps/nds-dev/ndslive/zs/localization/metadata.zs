/*!

# Localization Metadata

This package defines metadata for the localization layers.


**Dependencies**

!*/

package localization.metadata;

import core.grid.*;
import localization.types.*;

/** Occupancy grid layer metadata. */
struct OccupancyGridLayerMetadata
{

  /** Size of a cell in any provided occupancy grid. */
  GridCellSize cellSize;

  /**
    * Set to `true` if occupancy grids have relations to other features. In that
    * case, the grid layers have grid IDs that are used for referencing.
    */
  bool hasRelations;

};

/** Obstacle layer metadata. */
struct ObstacleLayerMetadata
{
  ObstacleType availableObstacleTypes[];
};

/** Landmark layer metadata. */
struct LandmarkLayerMetadata
{
  /** List of available landmark types in the layer that use line geometries. */
  LandmarkLineType availableLineTypes[];

  /** List of available landmark types in the layer that use planar polygon geometries. */
  LandmarkPolygonType availablePolygonTypes[];

  /** List of available landmark types in the layer that use mesh geometries. */
  LandmarkMeshType availableMeshTypes[];

  /**
    * Set to `true` if landmarks have relations to other features. In this case, the
    * geometry layer uses landmark IDs to reference the landmark geometries.
    */
  bool hasRelations;

  /**
    * Set to `true` if landmarks have detail information. In this case, the geometry
    * layer uses landmark IDs to reference the landmark geometries.
    */
  bool hasDetails;
};

/** Empty metadata structure for relation layers between landmarks and other features. */
struct LandmarkRelationLayerMetadata
{
};

/** Subtype to distinguish between roads and other targeted features. */
subtype LandmarkRelationLayerMetadata RoadLandmarkRelationLayerMetadata;

/** Subtype to distinguish between lanes and other targeted features. */
subtype LandmarkRelationLayerMetadata LaneLandmarkRelationLayerMetadata;

/** Subtype to distinguish between road surfaces and other targeted features. */
subtype LandmarkRelationLayerMetadata RoadSurfaceLandmarkRelationLayerMetadata;

/** Empty metadata structure for relation layers between occupancy grids and other features. */
struct OccupancyGridRelationLayerMetadata
{
};

/** Subtype to distinguish between roads and other targeted features. */
subtype OccupancyGridRelationLayerMetadata RoadOccupancyGridLayerMetadata;

/** Subtype to distinguish between lanes and other targeted features. */
subtype OccupancyGridRelationLayerMetadata LaneOccupancyGridLayerMetadata;