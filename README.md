# partition
Creation of a custom Jar library that returns the partitions of a list with a specified length 

####################################

1/ c'est un mini-projet contenant deux class, la première c'est la class « Main » qui nous présente en exécutant le projet une partie démo de la fonction « getPartition » située à la deuxième class « Partition ».
la fonction « getPartition » prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments. 

a- Pour exécuter le projet:
    -> cd partition/src
    -> javac Main.java
    -> java Main
b- La partie démo s'affiche dans votre invite de commande montrant le résultat de partitionnement d'une liste d'entier allant de 1 à 5.

2/ La class « PartitionTest » Montre le test unitaire pour la class « Partition » avec Junit4.

3/ Le fichier partition.jar situé sous out/artifacts/partition_jar/ constitut notre librérie packagée, maintenant nous pouvons l'ajouter commme dépendance dans toute autre application et pour l'utiliser il suffit de l'importer comme une bibliothèque java:

  -> import partition.*;
  -> il suffit d'appeler la fonction "partition.getPartition(liste, taille);" dans notre code qui retourne une liste de sous listes d'entiers
  
  Remarque: Le fichier MANIFEST.MF contient toutes les méta de configuration de notre jar
  
 ######## Merci pour votre temps et votre attention. #########

    
