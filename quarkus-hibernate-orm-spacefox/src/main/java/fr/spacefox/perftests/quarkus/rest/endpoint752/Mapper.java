package fr.spacefox.perftests.quarkus.rest.endpoint752;

import fr.spacefox.perftests.quarkus.core.service752.model.Model752;
import fr.spacefox.perftests.quarkus.rest.endpoint752.schema.Schema752;

final class Mapper {
    private Mapper() {}

    public static Schema752 of(Model752 model) {
        return new Schema752(model.id(), model.value());
    }
}
