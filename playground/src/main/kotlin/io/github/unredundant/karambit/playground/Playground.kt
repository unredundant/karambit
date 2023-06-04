package io.github.unredundant.karambit.playground

import io.github.unredundant.karambit.core.ClientFactory
import io.github.unredundant.karambit.core.MyBrotherInChristQuery

suspend fun main() {
  val client = ClientFactory.instantiateClient()
  val response = client.query(MyBrotherInChristQuery()).execute()
  println(response.data)
  print("hi")
}
