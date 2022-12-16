# projethooks

Ce projet simule différentes missions dans l'armée avec les classes suivantes :

abstracts :
- Pax 
- Weapon

entities :
- ChefDeGroupe
- ChefEquipe
- FAMAS
- GrenadierVoltigeur
- HK416
- PerceptionFAMAS
- PerceptionHK416

enum :
- Grades

Tout ceci, va permettre au gradé de donner des missions et des ordres.

## Avant de coder :

Ce projet contient deux hooks :
- un de commit qui envoi un message à chaque commit effectué.
- un de pre-push qui va compter de 5 en 5 quand il y a un push. 
 
 Pour s'assurer que git connaisse le fichier de hooks assurer vous exécuter la commande suivante sur le dossier root du projet la première fois que vous le récupérer.

   
 ```git config core.hooksPath .githooks```

