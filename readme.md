# Futurama Translator

The Futurama Translator translates from English to Nibblonian and Nibblonia.  

## Current Version
Translation is functional, GUI unfinished.

## Background
Nibblonian is one of two 'alien' language featured in the the TV show Futurama. They are easter eggs or  background joke, appearing in the background of many scenes in the form of graffiti, on shop signs etc. Only by translating the the language can fans understand the jokes.

## Nibblonian
Nibblonian (also referred to as AL2 in some fan material) is the second of the alien languages. Technologically not a language, it is in fact an encryption of the original English text.

Source: [The InfoSphere] (https://theinfosphere.org/Alien_languages)

## Cipher
Nibblionian is a variation of the autokey cipher. The encryption algorithm works as follows:

* First character is a simple substitution i.e. letters numerical value (a = 0, b= 1, etc) translates in a cipher syumbol. 
* Each subsequent letter is translated by adding the numerical value of the preceding letter to the current letter's value, then translating into the cipher symbol.

### Example 
Translate "bcd":

	* b = 1: thus b translates to symbol corresponding to 1
	* c = 2 + b = 3: thus c translates to symbol corresponding to 3
	* d = 3 + c = 6: thus d translates to symbol corresponding to 6

![Image of Nibblonian]
(https://theinfosphere.org/images/5/57/AL2_Key.jpg)

## Language
* Java

## GUI Toolkit
* Java Swing

## Packages
* Princeton Standard Library
* Google Guava



