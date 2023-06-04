package io.github.unredundant.karambit.core

import com.apollographql.apollo3.ApolloClient

object ClientFactory {

  fun instantiateClient(): ApolloClient = ApolloClient.Builder().apply {
    val port = System.getenv()["DAGGER_SESSION_PORT"] ?: error("DAGGER_SESSION_PORT doesn't exist")
    val token = System.getenv()["DAGGER_SESSION_TOKEN"] ?: error("DAGGER_SESSION_TOKEN doesn't exist")
    serverUrl("http://127.0.0.1:$port/query")
    addHttpHeader("authorization", "Basic $token")
  }.build()
}
