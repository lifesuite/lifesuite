neo4j stop

rm -rf $NEO4J_HOME/data/databases/$NEO4J_DB_NAME

neo4j-admin import --database=$NEO4J_DB_NAME \
    --nodes:Product=$DATA_DIR/$PRODUCTS_FILE \
    --nodes:Nutrient=$DATA_DIR/$NUTRIENTS_FILE \
    --nodes:ServingSize=$DATA_DIR/$SERVING_SIZE_FILE \
    --relationships:HAS_NUTRIENT=$DATA_DIR/$HAS_NUTRIENTS_FILE \
    --relationships:HAS_SERVING_SIZE=$DATA_DIR/$HAS_SERVING_SIZE_FILE \

neo4j start

echo 'waiting for neo4j to start'
until $(curl --output /dev/null --silent --head --fail http://localhost:7474); do
    printf '.'
    sleep 1
done

echo 'adding schema...'
cat schema.cql | cypher-shell -u $NEO4J_USERNAME -p $NEO4J_PASSWORD

echo 'cleaning up the import...'
cat cleanup.cql | cypher-shell -u $NEO4J_USERNAME -p $NEO4J_PASSWORD

