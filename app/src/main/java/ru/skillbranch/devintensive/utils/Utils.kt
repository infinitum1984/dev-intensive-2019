package ru.skillbranch.devintensive.utils

object Utils {
    fun parsFullName(fullName:String?):Pair<String?,String?>{

        val parts  :List<String>? =  fullName?.split(" ")

        if (parts.isNullOrEmpty())
            return null to null

        if (parts.size==1)
            return parts[0] to null

        val firstName = parts?.get(0);
        val lastName = parts?.get(1)
        return firstName to lastName
    }
}