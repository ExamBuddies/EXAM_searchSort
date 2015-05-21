# EXAM_searchSort

**Quicksort:** worst case: O(n2)
Vælger pivot først, og derefter finder den pivotets endelige plads (?). 
Hvordan vælger man pivot? Det er en god idé at vælge en i midten, i forhold til hastighed. Man laver en algoritme der finder en pivot generelt, før man finder den endelige plads.
For at finde den endelig plads for pivot, kører man fra ”venstre” først, og tjekker at alle elementer er lavere end pivot. Når man støder på et element der er større end pivot, kører man fra højre mod venstre indtil man finder et element der lavere end pivot. De kan så byttes. Dette fortsætter indtil man finder den sidste plads, som pivot selv må skulle placeres på.
