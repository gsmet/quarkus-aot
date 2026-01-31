package fr.spacefox.perftests.quarkus.rest.endpoint144;

import fr.spacefox.perftests.quarkus.core.service144.model.Model144;
import fr.spacefox.perftests.quarkus.rest.endpoint144.schema.Schema144;

final class Mapper {
    private Mapper() {}

    public static Schema144 of(Model144 model) {
        return new Schema144(model.id(), model.value());
    }
}
