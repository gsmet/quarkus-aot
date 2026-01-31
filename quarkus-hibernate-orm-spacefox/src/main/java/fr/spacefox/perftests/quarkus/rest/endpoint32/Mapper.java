package fr.spacefox.perftests.quarkus.rest.endpoint32;

import fr.spacefox.perftests.quarkus.core.service32.model.Model32;
import fr.spacefox.perftests.quarkus.rest.endpoint32.schema.Schema32;

final class Mapper {
    private Mapper() {}

    public static Schema32 of(Model32 model) {
        return new Schema32(model.id(), model.value());
    }
}
