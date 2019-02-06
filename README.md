# Esempio polimorfismo - Comparable / Comparator

Vediamo come implementare una utility per eseguire il sort dato un array di oggetti. Vediamo due modi:
* questi oggetti implementano un'interfaccia, `it.esempiosorter.custom.Comparable`, con un metodo per confrontare l'oggetto con un altro oggetto dell'array;
* al metodo di sort viene pasato un oggetto che implementa un'interfaccia,  `it.esempiosorter.custom.Comparator`, con un metodo per confrontare due oggetti;

Vediamo poi sotto package `it.esempiosorter.general` la versione utilizzando le interfacce del JDK `java.lang.Comparable` e `java.util.Comparator` e il metodo `sort` di `java.util.Collections`.

## Comparable

Esempio utilizzando oggetti che implementano l'interfaccia `it.esempiosorter.custom.Comparable` ad esempio `it.esempiosorter.comparable.Persona`, e il sorter `it.esempiosorter.custom.SorterComparable`.  La classe per eseguire i test `it.esempiosorter.comparable.TestSorter`.

## Comparator

La classe che implementa il metodo sort `it.esempiosorter.custom.SorterComparator` a cui viene passao anche un oggetto di tipo `it.esempiosorter.custom.Comparator`. La classe per eseguire i test: `it.esempiosorter.comparator.TestSorter`.



## Generale

Le stesse funzionalità utilizzando le interfacce `java.lang.Comparable` e `java.util.Comparator` e il metodo `sort` di `java.util.Collections`.

