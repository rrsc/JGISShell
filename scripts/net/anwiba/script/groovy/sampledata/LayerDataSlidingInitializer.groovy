/*
 * #%L
 * jgisshell scripting
 * %%
 * Copyright (C) 2007 - 2018 Andreas W. Bartels
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */
package net.anwiba.script.groovy.sampledata

import java.awt.Color

import net.anwiba.spatial.scripting.groovy.api.JGISShellGroovyScript
@groovy.transform.BaseScript JGISShellGroovyScript facade

def region = facade.variable("region", "Karlsruhe")
def table = "landuse"
def database = "sqlite:spatialite://\$SYSTEM{jgisshell.workingpath}/data/osm/${region}/${region}.osm.sqlite"
def resource = "${database}?table=${table}&column=geometry"
def reference = facade.layerReference(resource)

def landuseStyle = facade.featureStyleBuilder(facade.multipolygon())
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("water_works")), facade.areaStyle(Color.BLACK, Color.BLUE.brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("basin")), facade.areaStyle(Color.BLACK, Color.BLUE.brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("reservoir")), facade.areaStyle(Color.BLACK, Color.BLUE.brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("commercial")), facade.areaStyle(Color.LIGHT_GRAY, Color.LIGHT_GRAY))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("railway")), facade.areaStyle(Color.LIGHT_GRAY, Color.LIGHT_GRAY))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("plaza")), facade.areaStyle(Color.LIGHT_GRAY, Color.LIGHT_GRAY))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("place")), facade.areaStyle(Color.LIGHT_GRAY, Color.LIGHT_GRAY))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("highway")), facade.areaStyle(Color.LIGHT_GRAY, Color.LIGHT_GRAY))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("traffic_island")), facade.areaStyle(Color.LIGHT_GRAY, Color.LIGHT_GRAY))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("garages")), facade.areaStyle(Color.LIGHT_GRAY, Color.LIGHT_GRAY))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("garagegr")), facade.areaStyle(Color.LIGHT_GRAY, Color.LIGHT_GRAY))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("flowerbed")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("nursery")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("plant_nursery")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("greenhouse_horti")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("wetland")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("winter_sports")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("fishfarm")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("brownfield")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("greenfield")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("farm")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("vineyard")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("farmyard")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("farmland")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("village_green")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("landfill")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("recreation_groun")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("cemetery")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("grass")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("winery")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("animal_keeping")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .addConditionalStyle(facade.equal(facade.reference("type"), facade.value("area")), facade.areaStyle(Color.BLACK, Color.GREEN.brighter().brighter()))
    .defaultStyle(facade.areaStyle(Color.BLACK, Color.YELLOW))
    .build()

def layerViewIdentifier = facade.view().add(table, reference)
facade.view().style(layerViewIdentifier, landuseStyle)
facade.addVariable("layerViewName", table)
facade.addVariable("layerViewIdentifier", layerViewIdentifier)

def index = -1
facade.addVariable("layerSliderIndex", index)

def values = [
  "grass",
  "cemetery",
  "residential",
  "plaza",
  "greenfield",
  "industrial",
  "recreation_groun",
  "landfill",
  "retail",
  "railway",
  "commercial",
  "village_green",
  "meadow",
  "farmland",
  "allotments",
  "quarry",
  "construction",
  "farm",
  "education",
  "orchard",
  "brownfield",
  "basin",
  "farmyard",
  "vineyard",
  "military",
  "reservoir",
  "greenhouse_horti",
  "ex-military",
  "plant_nursery",
  "water_works",
  "timber_yard",
  "exercise_area",
  "winter_sports",
  "scrub",
  "basin_",
  "garages",
  "nursery",
  "place",
  "wetland",
  "road",
  "highway",
  "traffic_island",
  "test_area",
  "conservation",
  "garagegr",
  "flowerbed",
  "area",
  "animal_keeping",
  "scrubs",
  "pipelinearea",
  "depot",
  "leisure",
  "winery",
  "fishfarm",
  "institutional",
  "outdoor_seating",
  "yes",
  "churchyard",
  "religious",
  "urban_green"
]
facade.addVariable("layerSliderConditionValues", values)


