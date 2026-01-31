package fr.spacefox.perftests.quarkus.rest.endpoint915;

import fr.spacefox.perftests.quarkus.core.service915.model.Model915;
import fr.spacefox.perftests.quarkus.rest.endpoint915.schema.Schema915;

final class Mapper {
    private Mapper() {}

    public static Schema915 of(Model915 model) {
        return new Schema915(model.id(), model.value());
    }
}
