package fr.spacefox.perftests.quarkus.rest.endpoint470;

import fr.spacefox.perftests.quarkus.core.service470.model.Model470;
import fr.spacefox.perftests.quarkus.rest.endpoint470.schema.Schema470;

final class Mapper {
    private Mapper() {}

    public static Schema470 of(Model470 model) {
        return new Schema470(model.id(), model.value());
    }
}
