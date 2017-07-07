package jp.ogikei

import com.fasterxml.jackson.databind.ObjectMapper
import jp.ogikei
import play.api.libs.json.{JsValue, Json}

import scala.collection.immutable
import scala.collection.immutable.Nil

sealed trait Record[+Message]
case object Nil extends Record[Nothing]
case class Messages() extends Record[Message]

//object Record {
//  def apply(record: java.util.Map[String, Object]): JsValue = {
//    if (record.isEmpty) ogikei.Nil
//    else Record(record)
//  }
//}



object Messages {
}

class Record(record: java.util.Map[String, Object]) {
  val mapper: String = new ObjectMapper().writeValueAsString(record)
  val json: JsValue = Json.parse(mapper)
}


val mapper = new ObjectMapper().writeValueAsString(gitMessage)
val json = Json.parse(mapper)

val message = (json \\ "Message").head


record
message < record
message