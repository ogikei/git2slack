package jp.ogikei.github

import com.fasterxml.jackson.databind.ObjectMapper
import play.api.libs.json.{JsValue, Json}

class Record(record: java.util.Map[String, Object]) {
  def parseRecord(): JsValue = {
    val mapper = new ObjectMapper().writeValueAsString(record)
    Json.parse(mapper)
  }

  def selectTargetEvent(ls: List[String]): Unit = ls match {
    case h :: t if h == "pr" => selectTargetEvent(t)
  }

}

object Record {
  def apply(record: java.util.Map[String, Object]): Record = {
    if (record.isEmpty) throw new Exception("not exist record.")
    else new Record(record)
  }
}
