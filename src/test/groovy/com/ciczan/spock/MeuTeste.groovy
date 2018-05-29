package com.ciczan.spock

import spock.lang.Specification
import spock.lang.Title

@Title("In this test we want to see how things go in the Report.")
class ApplesAndOranges extends Specification {

	def "Apples are not Oranges"() {
		
		expect:
		"apple" == "orange"
		
		
	}
}
