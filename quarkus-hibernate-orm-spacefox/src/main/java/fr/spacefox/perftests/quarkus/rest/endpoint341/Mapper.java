package fr.spacefox.perftests.quarkus.rest.endpoint341;

import fr.spacefox.perftests.quarkus.core.service341.model.Model341;
import fr.spacefox.perftests.quarkus.rest.endpoint341.schema.Schema341;

final class Mapper {
    private Mapper() {}

    public static Schema341 of(Model341 model) {
        return new Schema341(model.id(), model.value());
    }
}
