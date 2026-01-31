package fr.spacefox.perftests.quarkus.rest.endpoint722;

import fr.spacefox.perftests.quarkus.core.service722.model.Model722;
import fr.spacefox.perftests.quarkus.rest.endpoint722.schema.Schema722;

final class Mapper {
    private Mapper() {}

    public static Schema722 of(Model722 model) {
        return new Schema722(model.id(), model.value());
    }
}
