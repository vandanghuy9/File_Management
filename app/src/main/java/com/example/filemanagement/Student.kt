package com.example.filemanagement

import com.example.filemanagement.model.Address
import com.example.filemanagement.model.Avatar
import com.example.filemanagement.model.Company
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Student (var id: Int, var name: String, var username: String,
                    var email: String, var avatar: Avatar,
                    var address: Address, var phone: String,
                    var website: String, var company: Company)