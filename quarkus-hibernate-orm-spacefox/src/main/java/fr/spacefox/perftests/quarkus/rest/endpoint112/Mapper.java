package fr.spacefox.perftests.quarkus.rest.endpoint112;

import fr.spacefox.perftests.quarkus.core.service112.model.Model112;
import fr.spacefox.perftests.quarkus.rest.endpoint112.schema.Schema112;

final class Mapper {
    private Mapper() {}

    public static Schema112 of(Model112 model) {
        return new Schema112(model.id(), model.value());
    }
}
