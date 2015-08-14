describe(
	'Quand j\'appelle la fonction alphaNumericSorter.compareChaineDeCaractere(a,b)',

	function() {
		var  stringNumericSorter;
		
		beforeEach(function() {
			stringNumericSorter = new AlphaNumericSorter();
		});

		var casDeTest = [
		                 ['ds_1_test'  ,'<', 'ds_001_test'],
		                 ['ds_001_test' ,'>', 'ds_1_test'],
		                 ['AAA'  ,'<', 'AAB'],
		                 ['AAA'  ,'<', 'ABC'],
		                 ['01_a'  ,'<', '1_b'],
		                 ['D10_b'  ,'>', 'D10_A'],
		                 ['D10_A'  ,'>', 'D1'],
		                 ['1'  ,'<', 'D10_A'],
		                 ['D10'  ,'<', 'D100'],
		                 ['2'  ,'>', '01'],
				         ['02'  ,'>', '01'],
		                 ['D10_A'  ,'>', 'D1_A'],
		                 ['0'  ,'<', '10'],
		                 ['10'  ,'>', '0'],
		                 ['1_002_a' ,'<', '001_2_a'],
		                 ['001_2_a' ,'>', '1_002_a'],
		                 ['1_002' ,'<', '001_2'],
				         ['001_2' ,'>', '1_002'],
		                 ['10'  ,'>', '1'],
		                 ['10'  ,'>', '2'],
		                 ['10'  ,'>', '3'],
		                 ['1'   ,'<', '01'],
		                 ['01'   ,'>', '1'],
		                 ['1'  ,'<', '02'],
				         ['0'  ,'<', '02'],
		                 ['1', '==', '1'], 
		                 ['10' ,'<', '10_10'],
				         ['10_10' ,'>', '10'],
				         ['24' ,'<', '24_10'],
				         ['' ,'<', '10'],
				         ['10' ,'>', ''],
				         ['001_002' ,'==', '001_002'],
				         ['001_002_a'   ,'==', '001_002_a']
				         ];
		
		casDeTest.forEach(function(donneesDeTest) {
			var a = donneesDeTest[0];
			var b = donneesDeTest[2];
			var strResultatAttendu = donneesDeTest[1];
			
			// Variables de comparaison
			var resultatAttenduEgalite   = 0;
			var resultatAttenduSuperieur = 1;
			var resultatAttenduInferieur = -1;
					
			var resulatAttenduComparaison = {
					INFERIEUR : '<',
					EGAL : '==',
					SUPERIEUR : '>'
			};
		
		
			it('' + a + ' ' + strResultatAttendu + ' ' + b, function() {
				
				var resultatObtenu = AlphaNumericSorter.prototype.bind.compareChaineDeCaractere(a,b);
				var resultatAttendu = strResultatAttendu;
				
				switch(resultatAttendu) {
				
				// Math.sign renvoit le signe d'un nombre
				case resulatAttenduComparaison.EGAL:
					expect(resultatAttenduEgalite).toEqual(Math.sign(resultatObtenu)); 
					break;
				case resulatAttenduComparaison.INFERIEUR:
					expect(resultatAttenduInferieur).toEqual(Math.sign(resultatObtenu));
					break;
				case resulatAttenduComparaison.SUPERIEUR:
					expect(resultatAttenduSuperieur).toEqual(Math.sign(resultatObtenu));
					break;
				}

			});
		});
	});
	
