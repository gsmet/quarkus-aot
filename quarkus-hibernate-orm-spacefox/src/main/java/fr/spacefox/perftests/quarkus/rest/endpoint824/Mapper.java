package fr.spacefox.perftests.quarkus.rest.endpoint824;

import fr.spacefox.perftests.quarkus.core.service824.model.Model824;
import fr.spacefox.perftests.quarkus.rest.endpoint824.schema.Schema824;

final class Mapper {
    private Mapper() {}

    public static Schema824 of(Model824 model) {
        return new Schema824(model.id(), model.value());
    }
}
