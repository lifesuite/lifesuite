// remove any nutrients that have a value of 0
CALL apoc.periodic.commit('
MATCH (n:Nutrient) WHERE n.Output_value <= 0
WITH n LIMIT {limit}
DETACH DELETE n
RETURN COUNT(n)
', {limit: 1000});

// remove any products that don't have nutrients
CALL apoc.periodic.commit('
MATCH (n:Product) WHERE NOT (n)-[:HAS_NUTRIENT]->(:Nutrient)
OPTIONAL MATCH (n)-[:HAS_SERVING_SIZE]->(s:ServingSize)
WITH n, s LIMIT {limit}
DETACH DELETE n
DETACH DELETE s
RETURN COUNT(n)
', {limit: 1000});

