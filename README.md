<h1 style="color: cornflowerblue">Rapport de l'inversion de contrôle et l'injection des dépendances</h1>
<h2 style="color: cadetblue">Introduction</h2>
<p>IoC (Inversion of control), est un processus qui définit les dépendances d'un objet sans 
avoir à les créer. C'est lors de la création des objets, que Spring va injecter les Beans entre 
eux afin d'avoir toutes leurs dépendances.</p>
<p>Cela va aider le développeur la possibilité de se focaliser sur la partie Métier de l'application</p>
<p>Spring va s'occuper de l'injection des dépandences et toutes les fonctionnalités techniques</p>
<h2 style="color: cadetblue">Ennoncé</h2>
<ol>
    <li>Couche DAO 
        <ul>
            <li>créer l'interface IDao</li>
            <li>créer une implémentation de l'interface IDao</li>
        </ul>
    </li>
    <li>Couche Métier
        <ul>
            <li>créer l'interface IMetier</li>
            <li>créer une implémentation de l'interface IMetier</li>
        </ul>
    </li>
    <li>Couche Présentation
        <p>Créer une application qui permet de faire l'injection des dépandences</p>
        <ul>
        <li>Instantiation statique</li>
        <li>Instantiation dynamique</li>
        <li>En utilisant Spring Framework
            <ul>
                <li>version XML</li>
                <li>version Annotation</li>
            </ul>
        </li>
        </ul>
    </li>
</ol>
<h2 style="color: cadetblue">Conception</h2>
<h3>Principe du couplage faible</h3>
<img src="captures/Conception.png" alt="conception image">
<p>
Pour utiliser le couplage faible, nous devons utiliser les interfaces.
Considérons une classe DaoImpl qui implémente l'interface IDao, et une classe MetierImpl qui implémente l'interface IMetier.</p>
<p>Si la classe MetierImpl est liée à l’interface IDao par une association, on dit que le classe MetierImpl et la classe IDaoImpl sont liées par un
couplage faible.</p>
<p>Cela signifie que la classe MetierImpl peut fonctionner avec n’importe quelle classe qui implémente l’interface IDao.
En effet la classe MetierImpl ne connait que l’interface IDao. De ce fait n’importe quelle classe implémentant cette
interface peut être associée à la classe MetierImpl, sans qu’il soit nécessaire de modifier quoi que se soit dans la
classe MetierImpl.</p>
<p>Avec le couplage faible, nous pourrons créer des applications fermées à la modification et ouvertes à
l’extension.
</p>
<h2 style="color: cadetblue">Captures d'écrans</h2>
<h3>Création de l'interface IDao</h3>
<img src="captures/InterfaceIDao.png" alt="interface IDao">
<h3>Création d'une implémentation de l'interface IDao version Base de Données</h3>
<img src="captures/IDaoImpl.png" alt="impl version base de données">
<h3>Création d'une implémentation de l'interface IDao version web services</h3>
<img src="captures/IDaoImplV2.png" alt="IDapImpl version web services">
<hr>
<h3>Création de l'interface IMetier</h3>
<img src="captures/InterfaceMetier.png" alt="IMetier">
<h3>Création d'une implémentation de l'interface IMetier</h3>
<img src="captures/MetierImpl.png" alt="implementation de IMetier">
<h3>Instantiation statique</h3>
<img src="captures/Pres1_instanstation_statique.png" alt="instantiation statique">
<h3>Instantiation dynamique</h3>
<img src="captures/Pres2_instanstation_dynamique.png" alt="instantiation dynamique">
<h3>Injection des dépendances en utilisant Spring version xml</h3>
<p>On doit installer en premier lieu les dépandences, ensuite ajouter un fichier config.xml</p>
<img src="captures/config_xml.png" alt="config.xml">
<img src="captures/Spring_xml.png" alt="spring version xml">
<h3>Injection des dépendances en utilisant Spring version annotations</h3>
<p>Repository Class</p>
<img src="captures/Repository.png" alt="repository class">
<p>Service Class</p>
<img src="captures/Service.png" alt="service">
<p>Controller</p>
<img src="captures/pres4_annota.png" alt="i">
