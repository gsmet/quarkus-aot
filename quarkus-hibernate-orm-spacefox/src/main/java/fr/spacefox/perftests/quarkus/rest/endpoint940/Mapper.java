package fr.spacefox.perftests.quarkus.rest.endpoint940;

import fr.spacefox.perftests.quarkus.core.service940.model.Model940;
import fr.spacefox.perftests.quarkus.rest.endpoint940.schema.Schema940;

final class Mapper {
    private Mapper() {}

    public static Schema940 of(Model940 model) {
        return new Schema940(model.id(), model.value());
    }
}
