package fr.spacefox.perftests.quarkus.rest.endpoint181;

import fr.spacefox.perftests.quarkus.core.service181.model.Model181;
import fr.spacefox.perftests.quarkus.rest.endpoint181.schema.Schema181;

final class Mapper {
    private Mapper() {}

    public static Schema181 of(Model181 model) {
        return new Schema181(model.id(), model.value());
    }
}
