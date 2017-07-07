package jp.ogikei

import com.amazonaws.services.lambda.runtime.Context
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.ObjectMapper
import play.api.libs.json._

class Git2Slack private(gitMessage: java.util.Map[String, Object]) {
//  def parseJson(gitMessage: java.util.Map[String, Object]): JsValue = {
//    val mapper = new ObjectMapper().writeValueAsString(gitMessage)
//    Json.parse(mapper)
//  }
//
//  def parseMessage(): Unit = {
//  }
//
//  def parseComment(): Unit = {
//  }
//
//  def parseBody(): Unit = {
//
//  }
}


// TODO: MessageAttributes

object Git2Slacktmp {
  def apply(message: java.util.Map[String, Object]): Git2Slack = {
    new Git2Slack(message)
  }

  def convertMessages(gitMessage: java.util.Map[String, Object], context: Context): String = {
    val mapper = new ObjectMapper().writeValueAsString(gitMessage)
    val json = Json.parse(mapper)

    val message = (json \\ "Message").head
    val parsedMessage = message.toString.replace("\\", "")
    val formattedMessage = parsedMessage.dropWhile(_ == '\"').reverse.dropWhile(_ == '"').reverse
    val messageJson = Json.parse(formattedMessage)
    val body = messageJson \ "comment" \ "body"

    println(body.as[String])

    "test"
  }
}

object Main {
  def main(records: java.util.Map[String, Object], context: Context) {
    // Messages(Message, Message, ...)
    // TODO: parallel execution for Messages
    Record(message)

    val git2Slack = Git2Slack(message)
    println(git2Slack)
  }
}
