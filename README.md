# Implementation of simple translator 
 
In this assignment, you should use Java or JavaScript to implement and test a simple translator that allows to translate:
- from polish to english 
- from polish to german 
 
You should select language based on your preferred area - if you are mostly interested in frontend testing select JavaScript, if you mostly interested in mobile or backend testing select Java. 
 
Your input for this task will be two files:
- POL2ENG.txt - with polish to english translations 
- ENG2GER.txt - with english to german translations 
 
Both containing lists of translations in the following format: 
language_A_word;language_B_word 
 
Fe. for ENG2GER.txt it could be: 

passport;Reisepass
bicycle;Fahrrad
rainforest;Regenwald 
 
Example dictionaries can be downloaded from:
- POL2ENG.txt: http://intern.softwareqa.pl/POL2ENG.txt  
- ENG2GER.txt: http://intern.softwareqa.pl/ENG2GER.txt  
 
 You should implement following translation functions: 
 1. polish2English(polish2EnglishDictionaryPath, polishExpression) It should take 2 string parameters - path to polish-english dictionary file and polish expression to translate, it should return english translation of that expression as a string 
 2. polishToGerman(polish2EnglishDictionaryPath, english2GermanDictionaryPath, polishExpression) It should take 3 string parameters - paths to polish-english dictionary file, path to english-german dictionary file and polish expression to translate, it should return german translation of expression as a string 
 3. generateGermanToPolishTranslationFile(polish2EnglishDictionaryPath, english2GermanDictionaryPath) It should take 2 string parameters - paths to polish-english dictionary file and english-german dictionary file, it should generate german-polish dictionary file and return path to it (or trigger download through browser)

 * If you have chosen to implement this assignment in Java then dictionary file in third function should be saved to a local file and you should return path to that file. If you have chosen to use JavaScript you can do the same or just generate file that will be downloaded from browser after function is executed. 
 
Example usages 
 1. polishToEnglish(“POL2ENG.txt”, “rower”) should return “bicycle” 
 2. polishToGerman(“POL2ENG.txt”, “ENG2GER.txt”, “las deszczowy”) should return “Regenwald” 
 3. generateGermanToPolishTranslationFile(“POL2ENG.txt”, “ENG2GER.txt”) should generate a file GER2POL.txt, containing: 
    -Reisepass;passport 
    -Fahrrad;rower 
    -Regenwald;las deszczowy 
 
And return it’s path (or trigger download through browser) 
  You can either choose if paths to dictionaries passed as arguments are paths to local files or files available to download over the internet.  
 
Regardless of what implementation you have chosen your functions need to be unit tested. 
Your solution should work out of the box, no manual configuration should be necessary. We strongly recommend to use automated build tools like Maven, Gradle etc. (for Java) or Gulp, NPM, Webpack etc. (for JS). 
