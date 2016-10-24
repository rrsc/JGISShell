# JGISShell
Java GIS Viewer and Layer Datastore Manager

JGSShell is a Java based spatial data viewer and layer datastore manager. It consist of 4 parts, a viewer, a layer manager, a scripting API (groovy and Java) and a URL concept to access layer and datastores.

I started JGISShell 10 years ago as an private education and spatial data and technologies evaluation project. Now it has riched a state that it could be used by other. Maybe for educaction, explore spatial data or manage spatial data. 

## Geodata Viewer

![Viewer](https://raw.githubusercontent.com/AndreasWBartels/JGISShell/7c0dcd1ea2a6cce4814cbc335e668e9147d2fbc8/doc/images/WindAndRadioWaves-LUBW.png)  
`map source: © 2016 Landesanstalt für Umwelt, Messungen und Naturschutz Baden-Württemberg`  

The first part is a viewer for spatial data who supports the following formats:

### Feature based geodata
Shapefiles, GeoJSON, PostGIS, SpatiaLite, GeoPackage, Oracle Locator/Spatial, SAP Hana, ESRI MDB based Geodatabases, ESRI Arc GIS Rest Feature Services, ESRI SDE and a own GML equal XML format.

### Image based geodata
Worldfiles, mbtiles, OSM, MAPBOX Tile Layers, ESRI Arc GIS Rest Map and Image Services

### Grid based geodata
ESRI ASCII Grid, Saga Grid and XYZ Grid files

## Layer Manager
The second part is a navigator tree to explore and manage geodata datastores.

## Scripting
The third part is the possibility to extend the viewer with java and groovy.

## Data access URL schema
The fourth part is a URL based schema to access different kinds of datastores and layers.

For more see [WIKI]https://github.com/AndreasWBartels/JGISShell/wiki

## Author
JGISShell was created by [Andreas W. Bartels](https://github.com/AndreasWBartels).

## License

The license is a reduced [BSD](https://www.freebsd.org/copyright/freebsd-license.html) like license.
See [license.txt](https://github.com/AndreasWBartels/JGISShell/blob/master/license.txt) for more information.

