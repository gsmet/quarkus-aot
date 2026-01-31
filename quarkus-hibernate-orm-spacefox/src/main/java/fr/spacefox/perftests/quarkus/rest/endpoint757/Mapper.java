package fr.spacefox.perftests.quarkus.rest.endpoint757;

import fr.spacefox.perftests.quarkus.core.service757.model.Model757;
import fr.spacefox.perftests.quarkus.rest.endpoint757.schema.Schema757;

final class Mapper {
    private Mapper() {}

    public static Schema757 of(Model757 model) {
        return new Schema757(model.id(), model.value());
    }
}
