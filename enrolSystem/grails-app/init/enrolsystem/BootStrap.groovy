package com.enrol

class BootStrap {

    def init = { servletContext ->

def computing=new Course(
	department:'Computing',
	courseTitle:'BSc Hon Computing',
	courseLeader:'Dr Michelle Murphy',
	courseCode:'CS123',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	numberOfStudents:55,
	tuitionFees:9000.60,
	Description:'Lorem Ipsum and that',
	studyMode: 'Fulltime').save()

def history=new Course(
	department:'History',
	courseTitle:'BSc Hon History',
	courseLeader:'Dr Mike Masowski',
	courseCode:'HS125',
	startDate:new Date('04/04/2019'),
	endDate:new Date('08/08/2023'),
	numberOfStudents:75,
	tuitionFees:9000.60,
	Description:'Lorem Ipsum and that',
	studyMode: 'Fulltime').save()

def jakeorwin=new Lecturer(
	fullName:'Jake Orwin',
	post:'DR',
	subject:'History',
	lecturerEmail:'orwin@shu.com',
	office:'a123',
	bio:'History Teacher n that').save()

def edbee=new Lecturer(
	fullName:'Ed Bee',
	post:'DR',
	subject:'Computing',
	lecturerEmail:'bee@shu.ac.uk',
	bio:'Computing Teacher n that').save()

def comptuing=new Module(
	module_title:'SysArchs',
	module_code:'129',
	credits:50,
	lecturer:'Ed Bee',
	course:'Computing',
	bio:'Computing n that').save()

def joeglover=new Student(
	studentName:'Joe Glover',
	studentID:'b9176',
	dob:new Date('08/01/1999'),
	studentEmail:'joeglover@mail.com',
	studentUsername:'joeglover',
	studentPassword:'purpleaki',
	isFundingAvailable:true,	
	course: 'Computing').save()
    }
    def destroy = {
    }	
}
