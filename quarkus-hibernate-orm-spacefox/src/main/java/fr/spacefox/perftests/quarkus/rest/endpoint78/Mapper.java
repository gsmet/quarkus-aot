package fr.spacefox.perftests.quarkus.rest.endpoint78;

import fr.spacefox.perftests.quarkus.core.service78.model.Model78;
import fr.spacefox.perftests.quarkus.rest.endpoint78.schema.Schema78;

final class Mapper {
    private Mapper() {}

    public static Schema78 of(Model78 model) {
        return new Schema78(model.id(), model.value());
    }
}
