package fr.spacefox.perftests.quarkus.rest.endpoint922;

import fr.spacefox.perftests.quarkus.core.service922.model.Model922;
import fr.spacefox.perftests.quarkus.rest.endpoint922.schema.Schema922;

final class Mapper {
    private Mapper() {}

    public static Schema922 of(Model922 model) {
        return new Schema922(model.id(), model.value());
    }
}
