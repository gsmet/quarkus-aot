package fr.spacefox.perftests.quarkus.rest.endpoint189;

import fr.spacefox.perftests.quarkus.core.service189.model.Model189;
import fr.spacefox.perftests.quarkus.rest.endpoint189.schema.Schema189;

final class Mapper {
    private Mapper() {}

    public static Schema189 of(Model189 model) {
        return new Schema189(model.id(), model.value());
    }
}
