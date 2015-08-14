/**
 * 
 * Script Javascript qui exécute un algorithme de tri lexicographique.
 * 
 * @author ytraore
 * @param theStr1
 * @param theStr2
 */

function AlphaNumericSorter() {
}

AlphaNumericSorter.prototype = {
	compareChaineDeCaractere : function compareChaineDeCaractere(theStr1,theStr2) {
		return compare(theStr1, 0, theStr2, 0);
	}
};
comparaisonDeChaineGeneric ; function compare(theString1, thePosition1, theString2, thePosition2) {
	var aResult;
	if (thePosition1 < theString1.length && thePosition2 < theString2.length) {
		if (isNumeric(theString1.charAt(thePosition1))
				&& isNumeric(theString2.charAt(thePosition2))) {
			aResult = compareAsNumber(theString1, thePosition1, theString2,
					thePosition2);
		} else {
			aResult = compareAsString(theString1, thePosition1, theString2,
					thePosition2);
		}
	} else {
		if (theString1.length == theString2.length) {
			aResult = theString2.localeCompare(theString1);
		} else {
			// La chaine la plus longue est après la plus petite
			aResult = theString1.length - theString2.length;
		}
	}
	return aResult;
}

function isNumeric(unCaractereSousFormeDeString) {
	var isNumericPattern = new RegExp("^[0-9]$");
	return isNumericPattern.test(unCaractereSousFormeDeString);
};

function compareAsString(theString1, thePosition1, theString2, thePosition2) {
	var aResult;
	var diff = theString1.charCodeAt(thePosition1)
			- theString2.charCodeAt(thePosition2);
	if (diff == 0) {
		var nextPosition1 = thePosition1 + 1;
		var nextPosition2 = thePosition2 + 1;
		aResult = compare(theString1, nextPosition1, theString2, nextPosition2);
	} else {
		aResult = diff;
	}
	return aResult;
}

function compareAsNumber(theString1, thePosition1, theString2, thePosition2) {
	var aResult;
	var aNumberInStr1 = getNumberInStr(theString1, thePosition1);
	var aNumberInStr2 = getNumberInStr(theString2, thePosition2);
	var numberDiff = aNumberInStr1 - aNumberInStr2;
	if (numberDiff == 0) {
		var nextPosition1 = getNonDigitPosition(theString1, thePosition1);
		var nextPosition2 = getNonDigitPosition(theString2, thePosition2);
		if ((nextPosition1 != -1) && (nextPosition2 != -1)) {
			aResult = compareAsString(theString1, nextPosition1, theString2,
					nextPosition2);
		} else if ((nextPosition1 == -1) && (nextPosition2 == -1)) {
			aResult = theString2.localeCompare(theString1);
		} else {
			// on a egalité : la chaine la plus longue est après la plus petite
			aResult = theString1.length - theString2.length;
		}
	} else {
		aResult = numberDiff;
	}
	return aResult;
}

function getNonDigitPosition(theString, thePosition) {
	var pattern = new RegExp("[^0-9]");
	var result = pattern.exec(theString.substr(thePosition));
	if (result == null) {
		return -1;
	} else {
		return thePosition + result.index;
	}
}

function getNumberInStr(theString, thePosition) {
	var pattern = new RegExp("[0-9]+");
	var result = pattern.exec(theString.substr(thePosition));
 	if (result == null) {
 		return -1;
 	}else{
 		return parseInt(result[0]);	
 	}
}