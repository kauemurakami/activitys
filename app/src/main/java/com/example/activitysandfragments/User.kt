package com.example.activitysandfragments

import java.io.Serializable

data class User(
  val name: String,
  val age: Int,
) : Serializable
