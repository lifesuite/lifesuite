CREATE INDEX ON :Product(long_name);

CREATE INDEX ON :Nutrient(Output_value);

CALL db.index.fulltext.createNodeIndex("productNameIndex", ["Product"], ["long_name"]);
