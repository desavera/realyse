# realyse
Realyse tech challenge repo

This is a test for the positin of Lead Data Engineer at Realyse :

## job description
https://www.glassdoor.co.uk/Job/remote-lead-data-engineer-jobs-SRCH_IL.0,6_IS11048_KO7,25.htm?rdserp=true&jl=3654453236&guid=000001765090b762a91e058fe2cbbeea&pos=102&src=GD_JOB_AD&srs=EI_JOBS&s=21&ao=1136006

## Delivery 1 on 13/12/2020 :

### solution for question #1

- A classic scenario of carrying over from the last non empty value in a Dataframe. Spark scala is here the best approach.
- A docker container with Spark 2.4 was configured and is triggered by a shell script through docker run.
- REF : https://stackoverflow.com/questions/33380678/how-to-carry-over-last-non-empty-value-to-subsequent-rows-using-spark-dataframe

### solution for question #6

- A basic example for using PostGIS geometric functions. Seemed reasonable to go for ST_Contains doing a simple OR.
- This is the kind of thing I guess Realyse is doing with PostGIS : https://stackoverflow.com/questions/37233780/st-contains-find-all-road-that-are-within-the-scope
- REF : https://postgis.net/docs/ST_Contains.html

[check the solution here...](sql/solution6.sql)

