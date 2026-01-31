package fr.spacefox.perftests.quarkus.rest.endpoint205;

import fr.spacefox.perftests.quarkus.core.service205.model.Model205;
import fr.spacefox.perftests.quarkus.rest.endpoint205.schema.Schema205;

final class Mapper {
    private Mapper() {}

    public static Schema205 of(Model205 model) {
        return new Schema205(model.id(), model.value());
    }
}
