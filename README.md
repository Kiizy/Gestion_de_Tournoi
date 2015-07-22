# Gestion_de_Tournoi

Bonjour j'essuie ton pére VOICI LE CAHIER DES CHARGES

Maison des ligues de Lorraine
Projet java – Gestion de tournoi

Nous venons d'être contactés par M. Sapin le responsable de la Maison des ligues de Lorraine et son assistant, qui requièrent nos services dans le cadre de l'informatisation de certaines de leurs activités. 
Dans un premier temps, ils ont besoin d'un logiciel pour l'organisation de tournois de Volley-Ball 6 contre 6 au sein de la Ligue de Volley-Ball. Projet qui si tout se passe bien sera étendu à toutes les ligues, qui en ont elles aussi le besoin.
Le cahier de charges fournit par les responsables est assez détaillé et je compte sur votre sens du travail bien fait pour ne pas décevoir ces clients très pointilleux.
Le cahier des charge exige de votre livrable qu'il permette la composition des poules d'équipes, la mise en place du programme des matchs, la désignation des arbitres et le choix des terrains. Toutefois, notre objectif ayant toujours été d'aller au-delà des attentes du client, la direction technique de notre société vous propose de prendre également en charge la suite de l'organisation: la gestion des résultats, détermination des vainqueurs de poules, organisation des phases finales, etc.
Je propose un calendrier afin que cette aventure soit la plus agréable possible.

Phase 0 : Prendre connaissance du cahier de charges
- Définissez une architecture de votre application et établissez un diagramme de classe détaillé.

Phase 1 : Codage
- Ecrire le code de l'application
- Tester intensivement

Phase 2 : Rapport
- Décrire l'état d'avancement du projet et préciser les fonctionnalités implémentées (1 page ).
- Expliquez vos choix de conception.

Phase 3 : Soutenance
- Préparer le code pour une inspection lors de la remise du livrable
Vous trouvez avec cette note le cahier de charges dicté par les responsables de la Maison des ligues. Beaucoup de courage, et portez haut l'étendard de notre entreprise.

 
Cahier des charges




L'application a pour rôle de faciliter l'organisation d'un tournoi de Volley 6 contre 6 au sein de la LDVB (Ligue de Volley-Ball). Ce tournoi permettra aux équipes de 6 à 9 joueurs (3 remplaçants maximum) ainsi formées de s'affronter les unes contre les autres durant des matchs de 3 sets gagnants.
L'application, réservée aux organisateurs du tournoi, permettra de créer un document  présentant le déroulement des tournois. L'organisateur devra renseigner les participants (joueurs, capitaines), ainsi que certaines informations les concernant (nom, prénom etc. ...) les compositions des équipes ainsi que les éventuels arbitres.
L'application créera automatiquement un Tournoi (création des poules d'équipes, ordre des matchs, désignation des arbitres et terrain d'accueil).
L'organisateur du tournoi aura à sa disposition une interface graphique du type :
-------------------------------------------------------------------------------
Bienvenue dans l'application de gestion de tournois Maison des Ligues.
Vous trouverez ici toutes les rubriques nécessaires pour la mise en place d’un tournoi.
-------------------------------------------------------------------------------
A vous de gerer la mise en forme, mais il doit y avoir :
0 - Menu Principal
1 - Inscription d'une Equipe
2 - Consultation / Modification / Suppression des Equipes
3 - Création du tournoi.
QUITTER

Contraintes imposées par le client :

Equipes
Le nombre d'équipes n'est pas limité. L'application devra calculer automatiquement les compositions des poules d'équipes.
Une équipe est composée d'au minimum 6 joueurs, et 9 au maximum. Chaque équipe désigne un capitaine (joueur).

Poules
Lors de la 1ere phase du tournoi, les équipes de chaque poule s'affrontent. Les poules devront être composées de 3 à 6 équipes.
Exemple : Si 12 équipes sont inscrites, l'application propose à l'organisateur trois options : 3 poules de 4 équipes, 4 poules de 3 équipes ou 2 poules de 6 équipes. Le problème d'un nombre impair d'équipe et supérieur à 6 devra être résolu.

Arbitres
Un arbitre est désigné pour chaque rencontre. Cet arbitre peut appartenir à une équipe ou non.
Il est désigné automatiquement, mais ne doit pas faire partie d'une des deux équipes prenant part à la rencontre. Si plusieurs matchs se jouent simultanément (voir contrainte Terrains), l'arbitre ne doit faire partie d'aucune des équipes jouant.


Terrains

L'organisateur doit renseigner le nombre de terrains qu'il a à sa disposition pour toute la durée du tournoi.
L'application doit désigner un terrain par rencontre. Si plusieurs terrains sont disponibles, plusieurs rencontres peuvent se faire simultanément.


Horaires et Jours des rencontres

L'organisateur choisit les jours sur lesquels se déroulent les matchs (ex : Seulement les lundis).
Le calendrier des matches sera compté en semaines (non datées) afin d'avoir une meilleure flexibilité (Exemple : pas de matchs pendant les vacances.).
Deux horaires sont disponibles par jour : 12h30 et 13h. 
Une équipe ne peut jouer deux matchs le même jour.


Sauvegarde

Comme toutes les données ne seront pas entrées par l'organisateur le même jour, une  sauvegarde doit être faite automatiquement au moment de la fermeture de l'application. L'utilisateur doit pouvoir également sauvegarder de lui-même.


Rendu final de l'application

Au moment de la création du tournoi, les équipes (et joueurs) ne peuvent plus être modifiés.
L'application calcule automatiquement l'ordre des rencontres et les modalités du tournoi (arbitres etc ...).
Tout cela devra être transcrit sur un document texte (.txt ou .pdf).


Manuel d'utilisation

L'application doit être fournie avec un manuel d'utilisation complet
