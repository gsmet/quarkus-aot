package fr.spacefox.perftests.quarkus.rest.endpoint150;

import fr.spacefox.perftests.quarkus.core.service150.model.Model150;
import fr.spacefox.perftests.quarkus.rest.endpoint150.schema.Schema150;

final class Mapper {
    private Mapper() {}

    public static Schema150 of(Model150 model) {
        return new Schema150(model.id(), model.value());
    }
}
