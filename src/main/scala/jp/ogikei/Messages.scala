package jp.ogikei

trait Record[+Message]
case object Nil extends Record[Nothing]
case class MQ[+Message](head: Message, tail: Record[Message]) extends Record[Message]

//object Record {
//  def apply(as: MQ): Record = {
//  }
//}

//object Messages {
//  def apply(message: Message): Messages[Message] = {
//    if message.
//  }
//}





