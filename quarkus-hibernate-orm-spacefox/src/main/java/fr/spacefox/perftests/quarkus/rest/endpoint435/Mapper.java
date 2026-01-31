package fr.spacefox.perftests.quarkus.rest.endpoint435;

import fr.spacefox.perftests.quarkus.core.service435.model.Model435;
import fr.spacefox.perftests.quarkus.rest.endpoint435.schema.Schema435;

final class Mapper {
    private Mapper() {}

    public static Schema435 of(Model435 model) {
        return new Schema435(model.id(), model.value());
    }
}
