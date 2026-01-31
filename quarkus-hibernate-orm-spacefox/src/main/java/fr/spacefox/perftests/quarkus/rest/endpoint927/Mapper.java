package fr.spacefox.perftests.quarkus.rest.endpoint927;

import fr.spacefox.perftests.quarkus.core.service927.model.Model927;
import fr.spacefox.perftests.quarkus.rest.endpoint927.schema.Schema927;

final class Mapper {
    private Mapper() {}

    public static Schema927 of(Model927 model) {
        return new Schema927(model.id(), model.value());
    }
}
