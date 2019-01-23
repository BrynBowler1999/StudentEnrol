package com.enrol

class Course {
	String fullName
	String post
	String subject
	String lecturerEmail
	String office
	String bio

    static constraints = {
	fullName nullable:false, blank:false	
	psot nullable:false, blank:false
	subject nullable:false, blank:false
	lecuturerEmail nullable:false, blank:false, email:true
	office nullable:false, blank:false
	bio nullable:false, blank:false, maxSize:5000, widget:'textarea'
    }
}
