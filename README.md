# realyse
Realyse tech challenge repo

This is a test for the positin of Lead Data Engineer at Realyse :

## job description
https://www.glassdoor.co.uk/Job/remote-lead-data-engineer-jobs-SRCH_IL.0,6_IS11048_KO7,25.htm?rdserp=true&jl=3654453236&guid=000001765090b762a91e058fe2cbbeea&pos=102&src=GD_JOB_AD&srs=EI_JOBS&s=21&ao=1136006

The first delivery on 13/12/2020 consists of :

## solution 1

## solution 6

Basic example for using PostGIS geometric functions. Seemed reasonable to go for ST_Contains doing a simple OR :

select ST_Contains(ST_GeometryFromText('POLYGON((10 11,10 9,11 9,14 9,14 10,10 11))'),ST_GeometryFromText('POINT(9 3)')) or ST_Contains(ST_GeometryFromText('POLYGON((10 11,10 9,11 9,14 9,14 10,10 11))'),ST_GeometryFromText('POINT(12 10)'));

just a note ... this is the kind of thing I guess Realyse is doing with PostGIS : https://stackoverflow.com/questions/37233780/st-contains-find-all-road-that-are-within-the-scope

