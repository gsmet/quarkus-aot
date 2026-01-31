package fr.spacefox.perftests.quarkus.rest.endpoint17;

import fr.spacefox.perftests.quarkus.core.service17.model.Model17;
import fr.spacefox.perftests.quarkus.rest.endpoint17.schema.Schema17;

final class Mapper {
    private Mapper() {}

    public static Schema17 of(Model17 model) {
        return new Schema17(model.id(), model.value());
    }
}
