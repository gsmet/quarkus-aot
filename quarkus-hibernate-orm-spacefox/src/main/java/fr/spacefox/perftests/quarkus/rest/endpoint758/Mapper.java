package fr.spacefox.perftests.quarkus.rest.endpoint758;

import fr.spacefox.perftests.quarkus.core.service758.model.Model758;
import fr.spacefox.perftests.quarkus.rest.endpoint758.schema.Schema758;

final class Mapper {
    private Mapper() {}

    public static Schema758 of(Model758 model) {
        return new Schema758(model.id(), model.value());
    }
}
