package com.pixipanda.sqlautomation.handler.load.jdbc

import com.pixipanda.sqlautomation.config.save.SaveConfig
import com.pixipanda.sqlautomation.Spark

case class DB2LoadHandler(query: String, saveConfig: SaveConfig) extends JdbcLoadHandler(query, saveConfig) with Spark{

  override def process(): Unit = super.process()
  override def decryptPassword: String = super.decryptPassword
}
