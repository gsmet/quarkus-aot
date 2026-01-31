package fr.spacefox.perftests.quarkus.rest.endpoint206;

import fr.spacefox.perftests.quarkus.core.service206.model.Model206;
import fr.spacefox.perftests.quarkus.rest.endpoint206.schema.Schema206;

final class Mapper {
    private Mapper() {}

    public static Schema206 of(Model206 model) {
        return new Schema206(model.id(), model.value());
    }
}
