# Esempio polimorfismo - Comparable / Comparator

Vediamo come implementare una utility per eseguire il sort dato un array di oggetti. Vediamo due modi:
* questi oggetti implementano un'interfaccia, `it.esempiosorter.comparable.Comparable`, con un metodo per confrontare l'oggetto con un altro oggetto dell'array;
* al metodo di sort viene pasato un oggetto che implementa un'interfaccia,  `it.esempiosorter.comparator.Comparator`, con un metodo per confrontare due oggetti;

Vediamo poi sotto package `it.esempiosorter.general` la versione utilizzando le interfacce del JDK `java.lang.Comparable` e `java.util.Comparator` e il metodo `sort` di `java.util.Collections`.

## Comparable

Esempio utilizzando oggetti che implementano l'interfaccia `it.esempiosorter.comparable.Comparable` ad esempio `it.esempiosorter.comparable.Persona`, e il sorter `it.esempiosorter.comparable.Sorter`.  La classe per eseguire i test `it.esempiosorter.comparable.TestSorter`.

## Comparator

La classe che implementa il metodo sort `it.esempiosorter.comparator.Sorter` a cui viene passato anche un oggetto di tipo `it.esempiosorter.comparator.Comparator`. La classe per eseguire i test: `it.esempiosorter.comparator.TestSorter`, che esegue il sort di oggetti di tipo `it.esempiosorter.comparator.Persona`.

## Generale

Le stesse funzionalità utilizzando le interfacce `java.lang.Comparable` e `java.util.Comparator` e il metodo `sort` di `java.util.Collections` o `java.util.Arrays`.

