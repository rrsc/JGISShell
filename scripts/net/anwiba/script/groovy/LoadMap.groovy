package net.anwiba.script.groovy
// Copyright (c) 2015 by Andreas W. Bartels (bartels@anwiba.de)
import net.anwiba.gis.scripting.groovy.api.JGISShellGroovyScript
@groovy.transform.BaseScript JGISShellGroovyScript facade

def resource = facade.resource("\$SYSTEM{jgisshell.workingpath}/data/backup.map")
if (facade.canRead(resource)) {
  def map = facade.readMap(resource)
  facade.view().map(map)
}
