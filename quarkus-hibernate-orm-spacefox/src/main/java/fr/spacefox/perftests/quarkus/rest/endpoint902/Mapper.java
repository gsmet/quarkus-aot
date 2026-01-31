package fr.spacefox.perftests.quarkus.rest.endpoint902;

import fr.spacefox.perftests.quarkus.core.service902.model.Model902;
import fr.spacefox.perftests.quarkus.rest.endpoint902.schema.Schema902;

final class Mapper {
    private Mapper() {}

    public static Schema902 of(Model902 model) {
        return new Schema902(model.id(), model.value());
    }
}
