package fr.spacefox.perftests.quarkus.rest.endpoint583;

import fr.spacefox.perftests.quarkus.core.service583.model.Model583;
import fr.spacefox.perftests.quarkus.rest.endpoint583.schema.Schema583;

final class Mapper {
    private Mapper() {}

    public static Schema583 of(Model583 model) {
        return new Schema583(model.id(), model.value());
    }
}
