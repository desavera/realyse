# realyse
Realyse tech challenge repo

This is the solutions set for the tech challenge for the positin of Lead Data Engineer at Realyse.


### solution for question #1

- A classic scenario of carrying over from the last non empty value in a Dataframe. Spark scala is here the best approach.
- A Jupyter Notebook was configured and will be used for the presenting the solution : https://hub.docker.com/r/aghorbani/spark-jupyter-scala/
- REF : https://stackoverflow.com/questions/33380678/how-to-carry-over-last-non-empty-value-to-subsequent-rows-using-spark-dataframe

### solution for question #2

- A very interesting challenge for Regex.
- A Jupyter Notebook was configured and will be used for the presenting the solution : https://hub.docker.com/r/aghorbani/spark-jupyter-scala/
- REF : https://regex101.com/

[check the solution here...](src/NamesExtractor.scala)

### solution for question #3

- A very challenging use case where we will need to do a hierarchical aggregation using Spark Dataframesin Scala.
- REF : https://stackoverflow.com/questions/52508872/how-to-recursively-aggregate-treelikehierarchical-data-using-spark

### solution for question #4

- A classic exercise to explore indexing techniques on very large data sets. 
- This is a particularly interesting use case for Bloom filters.
- REF : https://llimllib.github.io/bloomfilter-tutorial/

### solution for question #5

- A classic exercise to explore PostGIS features for GIS built in utilities.
REF : https://postgis.net/docs/ST_Distance.html

### solution for question #6

- A basic example for using PostGIS geometric functions. Seemed reasonable to go for ST_Contains doing a simple OR as the proposal is limited to two points only.
- PostgreSQL and PostGIS extension were installed locally and the solution can be presented through psql command line.
- This is the kind of thing I guess Realyse is doing with PostGIS : https://stackoverflow.com/questions/37233780/st-contains-find-all-road-that-are-within-the-scope
- REF : https://postgis.net/docs/ST_Contains.html

[check the solution here...](sql/solution6.sql)

### solution for question #7

 - Not a single answer ... and absolutely not trivial but I have a strategy to be proposed using Delta Lake or Spark 3 merges.
 
[check the solution here...](doc/solution7.txt)
