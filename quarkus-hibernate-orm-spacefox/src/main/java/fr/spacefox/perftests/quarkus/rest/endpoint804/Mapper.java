package fr.spacefox.perftests.quarkus.rest.endpoint804;

import fr.spacefox.perftests.quarkus.core.service804.model.Model804;
import fr.spacefox.perftests.quarkus.rest.endpoint804.schema.Schema804;

final class Mapper {
    private Mapper() {}

    public static Schema804 of(Model804 model) {
        return new Schema804(model.id(), model.value());
    }
}
