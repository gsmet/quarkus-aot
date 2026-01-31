package fr.spacefox.perftests.quarkus.rest.endpoint985;

import fr.spacefox.perftests.quarkus.core.service985.model.Model985;
import fr.spacefox.perftests.quarkus.rest.endpoint985.schema.Schema985;

final class Mapper {
    private Mapper() {}

    public static Schema985 of(Model985 model) {
        return new Schema985(model.id(), model.value());
    }
}
