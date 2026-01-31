package fr.spacefox.perftests.quarkus.rest.endpoint681;

import fr.spacefox.perftests.quarkus.core.service681.model.Model681;
import fr.spacefox.perftests.quarkus.rest.endpoint681.schema.Schema681;

final class Mapper {
    private Mapper() {}

    public static Schema681 of(Model681 model) {
        return new Schema681(model.id(), model.value());
    }
}
