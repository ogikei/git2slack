package jp.ogikei

import com.amazonaws.services.lambda.runtime.Context
import github.Record

object Main {
  def main(record: java.util.Map[String, Object], context: Context): Unit = {
    val record = Record(record)
    val recordJson = record.parseRecord()

    val params = List("pr", "b")
  }
}
