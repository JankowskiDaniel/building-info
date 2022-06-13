# Building Info #
![example workflow](https://github.com/JankowskiDaniel/building-info/actions/workflows/ci.yml/badge.svg)

## Introduction ##

For building administrators who want to minimise the costs of building management, our Building Info application will enable obtaining information about building parameters at the level of rooms, floors and entire buildings. The application will be available via GUI and also as a remote API, thanks to which it can be integrated with existing tools.

## Technologies: ##
<ul>
    <li>Java 11</li>
    <li>Spring 2.3.3</li>
</ul>

## Documentation: ##
https://jankowskidaniel.github.io/building-info/

## Data structure examples: ##
<ol>
    <li>For building location:</li>
    
</ol>

```json
{
    "id":1,
    "name":"test2",
    "address":"test1",
    "area": 0.0,
    "volume":0.0,
    "lightingpower":0.0,
    "heatlimit":0.0,
    "levels": [{
        "id":1,
        "area": 0.0,
        "volume":0.0,
        "lightingpower":0.0,
        "rooms":[{
            "id":1,
            "area":2.5,
            "volume":5.0,
            "lightingpower":10.0,
            "heatingenergy":10.0
            },
            {"id":2,
            "area":7.5,
            "volume":8.0,
            "lightingpower":40.0,
            "heatingenergy":10.0},
            {"id":3,
            "area":3,
            "volume":2.0,
            "lightingpower":30.0,
            "heatingenergy":10.0}
        ]
    }]
}
```

    

