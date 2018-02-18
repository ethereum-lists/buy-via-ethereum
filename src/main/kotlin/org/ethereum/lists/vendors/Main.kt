package org.ethereum.lists.vendors

import org.ethereum.lists.cilib.checkFields
import java.io.File

fun main(args: Array<String>) {
    val mandatoryFields = listOf("name")
    val optionalFields = listOf("url", "accepts", "comment", "tags")
    File("list.json").checkFields(mandatoryFields, optionalFields)
}
