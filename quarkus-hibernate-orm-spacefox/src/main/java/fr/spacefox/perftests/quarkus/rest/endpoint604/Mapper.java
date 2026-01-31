package fr.spacefox.perftests.quarkus.rest.endpoint604;

import fr.spacefox.perftests.quarkus.core.service604.model.Model604;
import fr.spacefox.perftests.quarkus.rest.endpoint604.schema.Schema604;

final class Mapper {
    private Mapper() {}

    public static Schema604 of(Model604 model) {
        return new Schema604(model.id(), model.value());
    }
}
