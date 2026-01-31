package fr.spacefox.perftests.quarkus.rest.endpoint578;

import fr.spacefox.perftests.quarkus.core.service578.model.Model578;
import fr.spacefox.perftests.quarkus.rest.endpoint578.schema.Schema578;

final class Mapper {
    private Mapper() {}

    public static Schema578 of(Model578 model) {
        return new Schema578(model.id(), model.value());
    }
}
