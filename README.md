I. Overview
	This application is a collection of 7 apps, which do:
	 - age and gender extraction from an image which will be stored in a Cloudant NoSQL DB, mongodb, or redis
	 - age and gender extracted will be saved into a wav file
	 - input a text to be translated and will be converted into a wav file
	 - select a wav file and be converted to text
	 - enter text which will be converted into a wav file and saved in an Object Storage service

II. Technology used
	 - Language Translator
	 - Speech to Text
	 - Text to Speech
	 - Cloudant NoSQL DB
	 - Object Storage
	 - mongodb (Bluemix experimental)
	 - redis (Bluemix experimental)

III. How to deploy in bluemix
 	1. create application
 	2. add the following services:
		- Language Translator
		- Speech to Text
		- Text to Speech
		- Cloudant NoSQL DB
		- Object Storage
		- mongodb (Bluemix experimental)
		- redis (Bluemix experimental)
	 3. restage app to apply the changes
 	 4. go to http://cccf-mp.mybluemix.net
