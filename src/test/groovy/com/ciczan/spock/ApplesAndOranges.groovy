package com.ciczan.spock

import spock.lang.Issue
import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Title

@Title("In this test we want to see how things go in the Report.")
@Narrative("""
As a user
I want to compare apples and oranges
So that I am sure they are different
""")
class ApplesAndOranges extends Specification {

	@Issue("JIRA-0000")
	def "Apples are not Oranges"() {
		given: "Assigning some variable" 
		String apple = "apple"
		String orange = "orange"
		
		
		expect: "Expect to be different"
		"apple" != "orange"
		
		
	}
	
	@Issue("JIRA-0001")
	def "What about grapes?"() {
		given: "Assigning some variable"
		String grape = "grape"
		
		and: "Somethins in the middle"
		print("printing to where?")
		assert false

		
		expect: "Grapes are the same"
		grape == grape
		
		
	}
}
