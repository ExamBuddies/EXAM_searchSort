# EXAM_searchSort

## Sorting algorithms ##

**Selection sort:**  n! = n(n-1)(n-2) eller O(n2) 	
Itererer listen og finder den mindste værdi og sætter den som det første element. Derefter tager den fra næste position og gør det samme, og placerer det som nr. 2 osv. Tager n! tid, så ikke specielt effektivt.


**Insertion sort:** n2 

**Bubble sort:** n2
Sammenligner to og to, og bytter hvis den anden værdi er lavere end den første. Efter første gennemgang af listen, vil vi have den laveste værdi først, og den største værdi sidst. Metoden gentages, indtil der ikke længere sker flere skift.
Mergesort: worse case: O(n*log2n), average: O(n*log2n)
Opdel array i to dele. Sorter de to halvdele. Hvis de to halvdele er usorteret, køres mergesort rekursivt på disse.
Når vi har sorteret de to overordnede lister. Sammenligner vi dem pr. Index, og udskifter de relevante elementer, før den sætter dem sammen.
Kræver dobbelt så meget plads, da de to halvdelen skal have hver deres array, ud over det originale.


**Quicksort:** worst case: O(n2)
Vælger pivot først, og derefter finder den pivotets endelige plads (?). 
Hvordan vælger man pivot? Det er en god idé at vælge en i midten, i forhold til hastighed. Man laver en algoritme der finder en pivot generelt, før man finder den endelige plads.
For at finde den endelig plads for pivot, kører man fra ”venstre” først, og tjekker at alle elementer er lavere end pivot. Når man støder på et element der er større end pivot, kører man fra højre mod venstre indtil man finder et element der lavere end pivot. De kan så byttes. Dette fortsætter indtil man finder den sidste plads, som pivot selv må skulle placeres på.
